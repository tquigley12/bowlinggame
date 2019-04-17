package bowlinggame;

import java.util.Scanner;

/**
 *
 * This class prompts the user to input a roll.  The I-O to get the roll and verify it
 * is contained in this class, and it will not relinquish control back to the main
 * program until a valid roll is provided.
 * @version 1.0
 * @author tquigley1
 * @author jbehrend4
 */
public class Roll {
   
    private final int maxValue;
    private int offsetValue;
    private int roll;
    private final Scanner keyboard = new Scanner(System.in);
    
    /**
     * 
     * @param maxValue.  Maximum possible value of roll. 
     */
    public Roll(int maxValue) {
        this.maxValue = maxValue;
    }
    
    /**
     * 
     * @param offsetValue.  Offset used against maximum roll value to determine
     * range of possible rolls.
     */
    public void setOffsetValue(int offsetValue) {
        this.offsetValue = offsetValue;
    }
    
    /**
     * This method prompts the user for a range of numbers based on the maximum and
     * offset values.  If the user enters a valid other than in this range, or a 
     * non-numeric value, it prompts again until a valid value is entered.
     */
    public void executeRoll() {
        String keyboardInput;
        boolean validRoll = false;
        int testRoll = 0;
        System.out.println("Enter value for next roll.  Must be between 0 and " +
                (maxValue - offsetValue) + ".");
        keyboardInput = keyboard.nextLine();
        
        do {
            try {
                testRoll = Integer.parseInt(keyboardInput);
                if (testRoll >= (0) && testRoll <= (maxValue - offsetValue)) {
                    validRoll = true;
                } else {
                    System.out.println("Invalid entry.  Enter value for next roll.  " + 
                        "Must be between 0 and " + (maxValue - offsetValue) + ".");
                    keyboardInput = keyboard.nextLine();
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid entry.  Enter value for next roll.  " + 
                        "Must be between 0 and " + (maxValue - offsetValue) + ".");
                keyboardInput = keyboard.nextLine();
            }
        } while (!validRoll);

        setRoll(testRoll);
        
    }
    
    /**
     * 
     * @param roll.  Input parameter to set the value for roll. 
     */
    private void setRoll(int roll) {
        this.roll = roll;
    }
    
    /**
     * 
     * @return The value for the roll. 
     */
    public int getRoll() {
        return roll;
    }
    
}
