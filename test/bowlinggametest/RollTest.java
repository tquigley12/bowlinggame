package bowlinggametest;

import org.junit.Test;
import java.util.Scanner;

/**
 *
 * @author e1032375
 */
class RollTest {
    private int roll;
    
    public RollTest() {
        
    }
    
    @Test
    public void executeRoll(int roll) {
        setRoll(roll);
    }
    
    private void setRoll(int roll) {
        this.roll = roll;
    }
    
    public int getRoll() {
        return roll;
    }
    
}
