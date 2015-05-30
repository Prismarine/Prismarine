package org.prismarine.server;

import net.minecraft.server.MinecraftServer;
import org.prismarine.server.plugins.PluginManager;
import org.prismarine.server.util.Logger;

import java.io.File;

public class Server implements org.prismarine.api.Server{

    private MinecraftServer nms;
    private PluginManager pluginManager;
    private long startedTime;


    public void init(String[] options) {
        startedTime = System.currentTimeMillis();
        try {
            //log start
            Logger.write("Starting prismarine server");
            Logger.write("Loading Minecraft Server...");

            //always run minecraft server as the latest process
            //initialize the minecraft server
            MinecraftServer.main(options);
            this.nms = MinecraftServer.getServer();
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }


    @Override
    public int getMemoryUsage() {
        return 0;
    }

    @Override
    public long getServerUptime() {
        return startedTime - System.currentTimeMillis();
    }

    @Override
    public String getMotd() {
        return nms.getMotd();
    }

    @Override
    public void reloadMotd() {
        //TODO: code motd property reloading
    }

    @Override
    public File getServerIcon() {
        return nms.d("server-icon.png");
    }

    @Override
    public void shutdown() {
        nms.safeShutdown();
    }

    @Override
    public void restart() {
        //TODO: implement Restart
    }

    @Override
    public boolean hasWhitelist() {
        return nms.getPlayerList().getHasWhitelist();
    }

    @Override
    public boolean getOnlineMode() {
        return nms.getOnlineMode();
    }

    @Override
    public boolean getPvpEnabled() {
        return nms.getPVP();
    }

    @Override
    public boolean getAnimalsSpawn() {
        return nms.getSpawnAnimals();
    }

    @Override
    public boolean getGenerateStructures() {
        return nms.getGenerateStructures();
    }

    @Override
    public boolean getAllowFlight() {
        return nms.getAllowFlight();
    }

    @Override
    public void setMotd(String s) {
        nms.setMotd(s);
    }

    @Override
    public String getServerVersion() {
        return nms.getVersion();
    }

    public void initPlugins(){
        pluginManager = new PluginManager();
    }

    public MinecraftServer getNms(){
        return this.nms;
    }
}
