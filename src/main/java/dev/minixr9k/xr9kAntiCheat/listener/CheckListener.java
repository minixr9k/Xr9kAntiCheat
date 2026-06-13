package dev.minixr9k.xr9kAntiCheat.listener;

import dev.minixr9k.xr9kAntiCheat.Xr9kAntiCheat;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class CheckListener implements Listener {

    private Xr9kAntiCheat plugin;

    public CheckListener(Xr9kAntiCheat plugin) {
        this.plugin = plugin;
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    private void onMove(PlayerMoveEvent e) {

        plugin.getCheckManager().getSprintBlindness().handle(e);
        plugin.getCheckManager().getSprintHunger().handle(e);

    }

}
