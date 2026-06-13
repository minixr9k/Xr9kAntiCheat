package dev.minixr9k.xr9kAntiCheat;

import dev.minixr9k.xr9kAntiCheat.checks.CheckManager;
import dev.minixr9k.xr9kAntiCheat.listener.CheckListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Xr9kAntiCheat extends JavaPlugin {

    private CheckManager checkManager;

    @Override
    public void onEnable() {

        checkManager = new CheckManager();

        new CheckListener(this);

    }

    public CheckManager getCheckManager() { return checkManager; }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
