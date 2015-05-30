package org.prismarine.server.util;

public class Logger {

    /**
     * Sends a debug message to the console.
     *
     * @param msg The debug message to send
     */
    public static void debug(String msg){
        System.out.println("[Prismarine][DEBUG] " + msg);
    }

    /**
     * Sends an info message to the console.
     *
     * @param msg The info message to send
     */
    public static void write(String msg){
        System.out.println("[Prismarine] " + msg);
    }

    /**
     * Sends an info message to the console.
     * @param msg The info message to send
     * @param manager The manager name that sent this console message
     */
    public static void write(String msg, String manager){
        System.out.println("[Prismarine][" + manager + "] " + msg);
    }

    /**
     * Sends an error message to the console.
     *
     * @param msg The error message to send
     */
    public static void error(String msg){
        System.out.println("[Prismarine] " + msg);
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
