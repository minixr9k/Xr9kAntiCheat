package dev.minixr9k.xr9kAntiCheat.checks.movement;

import dev.minixr9k.xr9kAntiCheat.checks.Check;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.potion.PotionEffectType;

public class SprintBlindness extends Check {

    public SprintBlindness() {
        super("SprintBlindness", "Movement");
    }

    public void handle(PlayerMoveEvent e) {
        if (e.getPlayer().isSprinting() && e.getPlayer().hasPotionEffect(PotionEffectType.BLINDNESS)) {
            fail(e.getPlayer(), "none");
            e.setCancelled(true);
        }
    }
}
