package com.superduckinvaders.game.objective;

import com.superduckinvaders.game.Round;
import com.superduckinvaders.game.entity.item.Item;

/**
 * Represents an objective involving collecting a specific item.
 */
public class CollectObjective extends Objective {

    /**
     * The item that needs to be collected.
     */
    private Item target;

    /**
     * Initialises this CollectObjective.
     *
     * @param parent the round this CollectObjective belongs to
     * @param target the item that needs to be collected
     */
    public CollectObjective(Round parent, Item target) {
        super(parent);

        this.target = target;
    }

    /**
     * Gets a string describing this CollectObjective to be printed on screen.
     *
     * @return a string describing this CollectObjective
     */
    @Override
    public String getObjectiveString() {
        return "Collect the red flag in the top right";
    }

    /**
     * Updates the status towards this CollectObjective.
     *
     * @param delta how much time has passed since the last update
     */
    @Override
    public void update(float delta) {
        if (parent.getPlayer().intersects(target.getX(), target.getY(), target.getWidth(), target.getHeight())) {
            status = OBJECTIVE_COMPLETED;
        }
    }
}
