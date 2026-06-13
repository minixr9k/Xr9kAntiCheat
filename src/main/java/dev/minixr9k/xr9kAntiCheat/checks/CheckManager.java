package dev.minixr9k.xr9kAntiCheat.checks;

import dev.minixr9k.xr9kAntiCheat.checks.movement.SprintBlindness;
import dev.minixr9k.xr9kAntiCheat.checks.movement.SprintHunger;

public class CheckManager {

    private final SprintBlindness sprintBlindness;
    private final SprintHunger sprintHunger;

    public CheckManager() {
        this.sprintBlindness = new SprintBlindness();
        this.sprintHunger = new SprintHunger();
    }

    public SprintBlindness getSprintBlindness() {
        return sprintBlindness;
    }
    
    public SprintHunger getSprintHunger() {
        return sprintHunger;
    }

}
