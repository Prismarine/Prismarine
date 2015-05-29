package org.prismarine.server.plugins.js;

import org.prismarine.api.plugin.Plugin;
import org.prismarine.api.plugin.PluginType;

import java.io.FileReader;

public class JavascriptPlugin implements Plugin{

    private FileReader plugin;
    private String name;

    public JavascriptPlugin(FileReader plugin, String name){
        this.plugin = plugin;
        this.name = name;
    }

    @Override
    public PluginType getPluginType(){
        return PluginType.JAVASCRIPT;
    }

    public String getName(){
        return name;
    }

}
