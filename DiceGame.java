/****************************************************************************
 *
 * Created by: Ben Lapuhapo
 * Created on: Feb 24 2020
 * This program is a dice guessing game
 *
 ****************************************************************************/

import java.util.Scanner;
import java.util.Random;

public class DiceGame {
    public static void main(String[] args) {

    Random rand = new Random();
    Scanner UserInput = new Scanner(System.in);

    // Variables

    // This will give a range from 0 - 5
    int RandomNumber = rand.nextInt(6);
    int UserGuess;
    int Counter;
    
    //Add one so that the range is from 1 - 6 
    RandomNumber += 1;
    Counter = 0;

    // Asks the user what the number is
    System.out.print("Guess the secret number? (1 - 6):");
    UserGuess = UserInput.nextInt();

    // Repeats this process as long as the answer is wrong
    while (RandomNumber != UserGuess) {
        // One more trial that you took is added to the total
        Counter += 1;

        System.out.print("Your Guess is incorrect! ");
        
        // Asks the user again  
        System.out.print(" Guess the secret number? (1 - 6):");
        UserGuess = UserInput.nextInt();
        }

    // One more trial that you took is added to the total
    Counter += 1;
    System.out.print("Congratulations!! You only took " + Counter + " Try.");

    }
}