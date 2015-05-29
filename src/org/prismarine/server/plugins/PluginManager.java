package org.prismarine.server.plugins;

import org.prismarine.server.plugins.js.JavaScriptPluginManager;
import org.prismarine.server.util.Logger;

import java.io.File;

public class PluginManager {

    private File pluginDir;
    private JavaScriptPluginManager javascriptMgr;

    public PluginManager(){
        this.pluginDir = new File("/plugins");
        //check if directories exist.
        if (!pluginDir.exists()){
            pluginDir.mkdir();
        }

        //initialize javascript's plugin manager
        this.javascriptMgr = new JavaScriptPluginManager(pluginDir);
        Logger.write("Loaded " + javascriptMgr.getJsPluginCount() + " javascript plugins");
    }

    public File getPluginsFolder(){
        return pluginDir;
    }

}
