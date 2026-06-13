package dev.minixr9k.xr9kAntiCheat.checks.movement;

import dev.minixr9k.xr9kAntiCheat.checks.Check;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.entity.Player;

public class SprintHunger extends Check { //ETO KOSTIL NE LEZTE SYDA

    public SprintHunger() {
        super("SprintHunger", "Movement");
    }

    public void handle(PlayerMoveEvent e) {
        if (e.getPlayer().isSprinting() && e.getPlayer().getFoodLevel() <= 6) {
            fail(e.getPlayer(), "none");
            e.setCancelled(true);
        }
    }
}
