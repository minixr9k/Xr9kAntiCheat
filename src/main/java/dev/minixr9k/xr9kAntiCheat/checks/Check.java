package dev.minixr9k.xr9kAntiCheat.checks;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class Check {
    private String name;
    private String category;

    public Check(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public void fail(Player failer, String msg) {
        for (Player p : Bukkit.getOnlinePlayers()) {
            if (p.isOp()) {
                p.sendMessage("%s failed %s (%s)", failer.getName(), name, msg);
            }
        }
    }


}
