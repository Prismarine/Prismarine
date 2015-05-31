package org.prismarine.server.players;

import com.google.common.collect.Maps;
import net.minecraft.server.EntityPlayer;
import org.prismarine.api.players.Player;

import java.util.Map;

public class PlayerManager {

    private Map<Player, EntityPlayer> players = Maps.newHashMap();

    public PlayerManager(){

    }

    public void addPlayer(EntityPlayer p){
        players.put(new PrismarinePlayer(p), p);
    }
}
