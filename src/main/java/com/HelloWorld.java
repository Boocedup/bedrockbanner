package com;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class HelloWorld implements Listener {
    @EventHandler
    public void onBlockplace(BlockPlaceEvent event) {
        Material type = event.getBlock().getType();
        if (type == Material.BEDROCK) {
            Player player = event.getPlayer();


            player.kickPlayer("Don't place bedrock g");

        }
    }
}
