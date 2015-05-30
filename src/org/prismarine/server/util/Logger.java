package org.prismarine.server.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {

    private static void log(String msg){
        final DateFormat format = new SimpleDateFormat("HH:mm:ss");
        System.out.println("[" + format.format(new Date()) + "] " + msg);
    }

    /**
     * Sends a debug message to the console.
     *
     * @param msg The debug message to send
     */
    public static void debug(String msg){
        log("[Prismarine/DEBUG] " + msg);
    }

    /**
     * Sends an info message to the console.
     *
     * @param msg The info message to send
     */
    public static void write(String msg){
        log("[Prismarine/INFO] " + msg);
    }

    /**
     * Sends an info message to the console.
     * @param msg The info message to send
     * @param manager The manager name that sent this console message
     */
    public static void write(String msg, String manager){
        log("[Prismarine/INFO][" + manager + "] " + msg);
    }

    /**
     * Sends an error message to the console.
     *
     * @param msg The error message to send
     */
    public static void error(String msg){
        log("[Prismarine/ERROR] " + msg);
    }

    /**
     * Sends an error message to the console.
     *
     * @param ex The exception to get the error message from
     */
    public static void error(Exception ex){
        error(ex.getMessage());
    }
}
