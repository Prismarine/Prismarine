package org.prismarine.server.util;

public class PluginLogger {

    //TODO: get the plugin name and put it in the message as [Name]

    /**
     * Sends a debug message to the console.
     *
     * @param msg The debug message to send
     */
    public void debug(String msg){
        System.out.println("[Prismarine][Plugin] " + msg);
    }

    /**
     * Sends an info message to the console.
     *
     * @param msg The info message to send
     */
    public void write(String msg){
        System.out.println("[Prismarine][Plugin] " + msg);
    }

    /**
     * Sends an error message to the console.
     *
     * @param msg The error message to send
     */
    public void error(String msg){
        System.out.println("[Prismarine][Plugin] " + msg);
    }

}
