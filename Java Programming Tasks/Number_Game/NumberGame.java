package Number_Game;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    // Instance variable of round, score and Scanner class
    // object------------------------------------------------
    static int round = 1;
    static int score = 0;
    static int noRound = 5;
    static int scorePerRound = 100;// Every correct answer amounts to 100 on the score board
    static int upperLimit = 100;
    static int lowerLimit = 1;
    static Scanner scanner = new Scanner(System.in);

    // This is a static block containing game instructions
    static {
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-Welcome to Number Game-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println("Instructions:- ");
        System.out.println("* You will get " + noRound + " chances to guess a random number between " + lowerLimit
                + " and " + upperLimit);
        System.out.println("* If guessed right you will be awarded " + scorePerRound + " points ");
        System.out.println("* Best of Luck.......You will need it");
    }

    public static void main(String[] args) {
        // calling random
        // method--------------------------------------------------------------------------------------
        int randomInt = NumberGame.ramdomInt(lowerLimit, upperLimit);
        // System.out.println("######" + randomInt);//To test if the random number is
        // being generated or not
        // This loop will take care of number of attempts per
        // game----------------------------------------------------
        for (int i = 0; i <= noRound; i++) {
            int guess = NumberGame.prompt(i);
            String result = NumberGame.compare(randomInt, guess);
            System.out.println(result);
            // This if condition will check the result and gives score to the
            // player--------------------------------------
            if (result.equals("Correct")) {
                score = score + scorePerRound;
                break;
            } else
                continue;
        }
        // This will display the score after every
        // round---------------------------------------------------------------
        System.out.println("Your current score after round " + round + " is:- " + score);
        // This will give a choice to the user weather to continue playing or
        // quit-------------------------------------
        System.out.println("Do you want to play other round(y/n)");
        char choice = scanner.next().charAt(0);
        // This will analyse the response, if y => main method will run again if n=> It
        // will display the thanks message
        if (choice == 'y') {
            round = round + 1;
            NumberGame.main(null);
        } else if (choice == 'n') {
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-Thank you-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");

        } else if (choice == 'd')
            NumberGame.developerOptions();
        else
            System.out.println("Invalid entry");
    }

    private static void developerOptions() {
        System.out.println(
                "---------------------------------------Developer Options---------------------------------------");

        System.out.println("Number of attamps per round:- " + noRound);
        System.out.println("Set new value:-");
        noRound = scanner.nextInt();

        System.out.println("Score per correct guess:- " + scorePerRound);
        System.out.println("Set new value:-");
        scorePerRound = scanner.nextInt();

        System.out.println("Random number lower limit is:- " + lowerLimit);
        System.out.println("Set new value:-");
        lowerLimit = scanner.nextInt();

        System.out.println("Random number upper limit is:- " + upperLimit);
        System.out.println("Set new value:-");
        upperLimit = scanner.nextInt();

        NumberGame.main(null);

    }

    // This method will generate a random number within the limits
    // specified---------------------------------------
    public static int ramdomInt(int num1, int num2) {
        Random random = new Random();
        int temp2 = -1;
        while (temp2 < num1) {
            int temp1 = random.nextInt(99999);
            temp2 = temp1 % num2;
        }
        return temp2;
    }

    // This method will prompt the user to enter guessed
    // number-----------------------------------------------------
    public static int prompt(int attampts) {
        System.out.println("-----------------------------------" + "Number of attampts left " + (noRound - attampts)
                + "-----------------------------------");
        System.out.println("Guess a number:- ");
        int num = scanner.nextInt();
        return num;
    }

    // This method will compare the guesses with the randomly generated
    // number---------------------------------------
    public static String compare(int rand, int guess) {
        String result = "Invalid Guess, try again with a number";

        if (guess == rand)
            result = "Correct";

        else if (guess < rand)
            result = "Too low";

        else if (guess > rand)
            result = "Too high";

        return result;
    }
}