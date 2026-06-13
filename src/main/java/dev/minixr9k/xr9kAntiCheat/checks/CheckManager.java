package dev.minixr9k.xr9kAntiCheat.checks;

import dev.minixr9k.xr9kAntiCheat.checks.movement.SprintBlindness;

public class CheckManager {

    private final SprintBlindness sprintBlindness;

    public CheckManager() {
        this.sprintBlindness = new SprintBlindness();
    }

    public SprintBlindness getSprintBlindness() {
        return sprintBlindness;
    }

}
