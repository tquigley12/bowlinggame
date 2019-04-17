package bowlinggametest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

/**
 * This class tests the BowlingGame class using JUnit.
 * @author tquigley1
 * @author jbehrend4
 */
public class BowlingGameTest {
    
    private RollTest roll;
    private int score;
    
    @Before
    public void setUp() {
        roll = new RollTest();
        score = 0;
    }
    
    @Test
    public void zeroGame() {
        roll.executeRoll(0);
        score += roll.getRoll();
        roll.executeRoll(0);
        score += roll.getRoll();
        roll.executeRoll(0);
        score += roll.getRoll();
        roll.executeRoll(0);
        score += roll.getRoll();
        roll.executeRoll(0);
        score += roll.getRoll();
        roll.executeRoll(0);
        score += roll.getRoll();
        roll.executeRoll(0);
        score += roll.getRoll();
        roll.executeRoll(0);
        score += roll.getRoll();
        roll.executeRoll(0);
        score += roll.getRoll();
        roll.executeRoll(0);
        score += roll.getRoll();
        roll.executeRoll(0);
        score += roll.getRoll();
        roll.executeRoll(0);
        score += roll.getRoll();
        roll.executeRoll(0);
        score += roll.getRoll();
        roll.executeRoll(0);
        score += roll.getRoll();
        roll.executeRoll(0);
        score += roll.getRoll();
        roll.executeRoll(0);
        score += roll.getRoll();
        roll.executeRoll(0);
        score += roll.getRoll();
        roll.executeRoll(0);
        score += roll.getRoll();
        roll.executeRoll(0);
        score += roll.getRoll();
        roll.executeRoll(0);
        score += roll.getRoll();
        Assert.assertEquals(0.0, (double) score, 0.0);
    }
    
    @Test
    public void allOnesGame() {
        roll.executeRoll(1);
        score += roll.getRoll();
        roll.executeRoll(1);
        score += roll.getRoll();
        roll.executeRoll(1);
        score += roll.getRoll();
        roll.executeRoll(1);
        score += roll.getRoll();
        roll.executeRoll(1);
        score += roll.getRoll();
        roll.executeRoll(1);
        score += roll.getRoll();
        roll.executeRoll(1);
        score += roll.getRoll();
        roll.executeRoll(1);
        score += roll.getRoll();
        roll.executeRoll(1);
        score += roll.getRoll();
        roll.executeRoll(1);
        score += roll.getRoll();
        roll.executeRoll(1);
        score += roll.getRoll();
        roll.executeRoll(1);
        score += roll.getRoll();
        roll.executeRoll(1);
        score += roll.getRoll();
        roll.executeRoll(1);
        score += roll.getRoll();
        roll.executeRoll(1);
        score += roll.getRoll();
        roll.executeRoll(1);
        score += roll.getRoll();
        roll.executeRoll(1);
        score += roll.getRoll();
        roll.executeRoll(1);
        score += roll.getRoll();
        roll.executeRoll(1);
        score += roll.getRoll();
        roll.executeRoll(1);
        score += roll.getRoll();
        Assert.assertEquals(20.0, (double) score, 0.0);
    }
    
}
