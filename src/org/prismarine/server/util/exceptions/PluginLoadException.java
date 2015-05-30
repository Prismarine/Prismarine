package org.prismarine.server.util.exceptions;

import org.prismarine.api.plugin.PluginType;

public class PluginLoadException extends Exception {

    public PluginLoadException(String name, PluginType type){
        super("could not load " + type + " plugin: " + name + "!");
    }
}
