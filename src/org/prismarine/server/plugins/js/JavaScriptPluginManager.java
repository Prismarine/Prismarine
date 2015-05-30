package org.prismarine.server.plugins.js;

import org.prismarine.api.plugin.PluginManagerBase;
import org.prismarine.api.plugin.PluginType;
import org.prismarine.server.Prismarine;
import org.prismarine.server.Server;
import org.prismarine.server.util.Logger;
import org.prismarine.api.plugin.JavascriptPluginBase;
import org.prismarine.server.util.PluginLogger;
import org.prismarine.server.util.exceptions.PluginLoadException;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class JavaScriptPluginManager implements PluginManagerBase{

    private File jsPluginDir;
    private ArrayList<JavascriptPlugin> jsPlugins;
    private ScriptEngineManager factory;
    public Server server;

    public JavaScriptPluginManager(File pluginsDir){
        Logger.write("Loading plugins...");
        this.jsPluginDir = new File("./plugins/javascript");
        this.factory = new ScriptEngineManager();
        //put them all in an awesome list
        this.jsPlugins = new ArrayList<JavascriptPlugin>();
        this.server = Prismarine.getServer();

        try {
            if(!this.jsPluginDir.exists()){
                this.jsPluginDir.mkdirs();
            }
            //list all files in directory
            final File[] jsPlugins = jsPluginDir.listFiles();

            if (jsPlugins != null) {
                for (final File f : jsPlugins) {
                    final String name = f.getName(); //TODO: initialize server var or json in zip
                    final FileReader reader = new FileReader(f);
                    this.addPlugin(reader, name);
                    reader.close();
                }
            }
        } catch(Exception ex){
            Logger.error(ex);
        }
    }

    @Override
    public void addPlugin(FileReader pluginFile, String name){
        String extension = "js";
        ScriptEngine engine = factory.getEngineByExtension(extension);

        try {
            //create a new plugin
            JavascriptPlugin plugin = new JavascriptPlugin(pluginFile, name);

            //put classes that are allowed to use by plugins
            engine.put("Logger", new PluginLogger());
            engine.put("Server", server);

            //eval the plugin js
            engine.eval(pluginFile);

            //set the default javascript PluginBase to the script, and require it to use it that way.
            JavascriptPluginBase scriptPlugin = ((Invocable) engine).getInterface(JavascriptPluginBase.class);
            if (scriptPlugin == null) {
                Logger.error("No method onEnable() and/or onDisable() found for plugin " + name);
            } else {
                try {
                    //run the onEnable script
                    scriptPlugin.onEnable();
                } catch (final Throwable t) {
                    Logger.error("Plugin Initialization Error " + t.getMessage());
                }
            }

            //add it to the ArrayList
            jsPlugins.add(plugin);
        } catch (Exception ex){
            ex = new PluginLoadException(name, PluginType.JAVASCRIPT);
            Logger.error(ex);
        } finally {
            Logger.write("Loaded: " + name + "!", "PluginManager");
        }
    }

    @Override
    public File getPluginsDir(){
        return jsPluginDir;
    }

    public int getJsPluginCount(){
        return jsPlugins.size();
    }

}
