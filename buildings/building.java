package buildings;

/**
 * Base class for all static structures (Buildings) in the game.
 * Buildings can produce units, generate resources, or provide defensive bonuses.
 */
public abstract class building {
    private int health;
    // TODO: Add fields for position, owner, and resource storage.

    public building(int health) {
        this.health = health;
    }

    /**
     * Abstract method to define the passive effect a building has (e.g., generating resources).
     */
    public abstract void executePassiveEffect();

    public boolean isDestroyed() {
        return health <= 0;
    }
}