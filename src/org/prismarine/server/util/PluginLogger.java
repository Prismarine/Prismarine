package org.prismarine.server.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PluginLogger {

    //TODO: get the plugin name and put it in the message as [Name]
    private static void log(String msg){
        final DateFormat format = new SimpleDateFormat("HH:mm:ss");
        System.out.println("[" + format.format(new Date()) + "] " + msg);
    }

    /**
     * Sends a debug message to the console.
     *
     * @param msg The debug message to send
     */
    public void debug(String msg){
        log("[Prismarine/PLUGIN] " + msg);
    }

    /**
     * Sends an info message to the console.
     *
     * @param msg The info message to send
     */
    public void write(String msg){
        log("[Prismarine/PLUGIN] " + msg);
    }

    /**
     * Sends an error message to the console.
     *
     * @param msg The error message to send
     */
    public void error(String msg){
        log("[Prismarine/PLUGIN] " + msg);
    }

}
