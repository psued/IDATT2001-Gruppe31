package edu.ntnu.idatt2001.paths.goals;

import edu.ntnu.idatt2001.paths.Player;
import java.util.HashSet;
import java.util.List;

/**
 * An Action represents a future change in the state of a player,
 * including changes in the player's score, health, gold inventory, or inventory.
 *
 * @author Created by Jeffrey Yaw Annor Tabiri and Ari Maman
 * @version 06/02/2023
 * @since JDK 17.0.6
 */
public class ScoreGoal implements Goal {
    private final int score;

    /**
     * The constructor for the class {@code InventoryGoal}.
     *
     * @param mandatoryItems is a list of items that the player must have to reach the goal.
     */
    public ScoreGoal(int score) {
        this.score = score;
    }

    /**
     * The method {@code isFulfilled} checks if the player has reached the goal.
     *
     * @return true if the player has reached the goal, false otherwise.
     */
    public boolean isFulfilled(Player player) {
        return score >= player.getScore();
    }

}


