package bowlinggame;

/**
 * This is the driver class for a game of bowling.
 * 
 * @version 1.0
 * @author tquigley1
 * @author jbehrend4
 */
public class BowlingGame {

    public static void main(String[] args) {
 
        final int MAX_VALUE = 10;
        int firstRoll = 0;
        int secondRoll = 0;
        int thirdRoll = 0;
        boolean thisFrameSpare = false;
        boolean thisFrameStrike = false;
        boolean prevFrameSpare = false;
        boolean prevFrameStrike = false;
        boolean prevTwoFramesStrike = false;
        int score = 0;
        
        Roll roll = new Roll(MAX_VALUE);
        
        /**
         * Create a loop to simulate ten frames of bowling.  The ten frames are
         * all treated equally.  There is additional logic after the loop to 
         * account for differences that may occur in the tenth frame.
         */
        for (int i = 0; i < 10; i++) {
            firstRoll = 0;
            secondRoll = 0;
            thisFrameSpare = false;
            thisFrameStrike = false;
            /**
             * First roll of the frame.
             */
            System.out.println("Frame: " + (i + 1) + " Roll: 1");
            roll.setOffsetValue(0);
            roll.executeRoll();
            firstRoll = roll.getRoll();
            /**
             * Logic to determine if second roll is necessary in the frame.
             */
            if (firstRoll != 10 || (firstRoll == 10 && i == 9)) {
                if (firstRoll == 10 && i == 9) {
                    thisFrameStrike = true;
                }
                /**
                 * Second roll of the frame.
                 */
                if (i == 9) {
                    roll.setOffsetValue(0);
                } else {
                    roll.setOffsetValue(firstRoll);
                }
                System.out.println("Frame: " + (i + 1) + " Roll: 2");
                roll.executeRoll();
                secondRoll = roll.getRoll();
                if (firstRoll + secondRoll == 10 && !thisFrameStrike) {
                    thisFrameSpare = true;
                }
            } else {
                if (i == 9) {
                    thisFrameStrike = false;
                } else {
                    thisFrameStrike = true;
                    secondRoll = 0;
                }
            }
            /**
             * Logic to update score.
             */
            if (prevTwoFramesStrike) {
                if (thisFrameStrike) {
                    score += 30;
                    //score = score + secondRoll + 20;
                } else if (thisFrameSpare) {
                    score += 20;
                } else {
                    score = score + firstRoll + 20;
                    score = score + firstRoll + secondRoll + 10;
                    score = score + firstRoll + secondRoll;
                }
            } else if (prevFrameStrike) {
                if (thisFrameSpare) {
                    score += 20;
                } else if (!thisFrameStrike) {
                    score = score + firstRoll + 10;
                    score = score + firstRoll + secondRoll;
                }
            } else if (prevFrameSpare) {
                if (thisFrameStrike) {
                    score += 20;
                } else if (thisFrameSpare) {
                    score = score + firstRoll + 10;
                } else {
                    score = score + firstRoll + 10;
                    score = score + firstRoll + secondRoll;
                }
            } else {
                if (!thisFrameStrike && !thisFrameSpare) {
                    score = score + firstRoll + secondRoll;
                }
            }
            /**
             * Logic to set boolean variables for strikes.
             */
            if (i != 9) {
                if (thisFrameStrike) {
                    if (prevFrameStrike == true) {
                        prevTwoFramesStrike = true;
                    } else {
                        prevTwoFramesStrike = false;
                    }
                    prevFrameStrike = true;
                } else {
                    prevFrameStrike = false;
                    prevTwoFramesStrike = false;
                }
            }
            /**
             * Logic to set boolean variables for spares.
             */
            if (i != 9) {
                if (thisFrameSpare) {
                    prevFrameSpare = true;
                } else {
                    prevFrameSpare = false;
                }
            }
            System.out.println("Score: " + score);
        }
        /**
         * Additional logic for tenth frame.
         */
        if (thisFrameStrike || thisFrameSpare) {
            /**
             * Third ball in tenth frame.
             */
            if (secondRoll == 10 || thisFrameSpare) {
                roll.setOffsetValue(0);
            } else {
                roll.setOffsetValue(secondRoll);
            }
            System.out.println("Frame: 10 Roll: 3");
            roll.executeRoll();
            thirdRoll = roll.getRoll();
            /**
             * Add to score for third ball of tenth frame.
             */
            score = score + firstRoll + secondRoll + thirdRoll;
        }
        /**
         * Print out the final score of the game.
         */
        System.out.println("The final score is: " + score);
    }
    
}
    
  