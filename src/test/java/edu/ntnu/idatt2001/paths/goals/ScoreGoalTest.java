package edu.ntnu.idatt2001.paths.goals;

import edu.ntnu.idatt2001.paths.playerBuilder.Player;
import edu.ntnu.idatt2001.paths.actions.ScoreAction;
import edu.ntnu.idatt2001.paths.playerBuilder.PlayerBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("ScoreGoalTest")
class ScoreGoalTest {

    ScoreAction scoreAction;
    ScoreGoal scoreGoal;

    Player testPlayer;



    @BeforeEach
    void setUp() {
        scoreAction = new ScoreAction(100);
        scoreGoal = new ScoreGoal(100);
        testPlayer = new PlayerBuilder("Test").gold(100).health(100).score(100).build();
    }

    @Test
    void isFulfilled() {
        scoreAction.execute(testPlayer);
        assertTrue(scoreGoal.isFulfilled(testPlayer));
    }
}