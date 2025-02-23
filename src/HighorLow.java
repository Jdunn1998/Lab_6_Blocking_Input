import java.util.Scanner;
import java.util.Random;

public class HighorLow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random generator = new Random();

        int randomNumber = generator.nextInt(10) + 1;
        int guess = 0;
        String trash;
        boolean correct;

        //Do while
        do {
            correct = false;
            System.out.println("Guess a number between 1 and 10: ");
        if (in.hasNextInt()) {
            guess = in.nextInt();
        if (guess >= 1 && guess <= 10) {
            correct = true;
        }else {
            trash = in.nextLine();
            System.out.println("Please enter a number between 1 and 10 not: " + trash);
            }
        }
        }while (!correct);

        System.out.println("The random number was: " + randomNumber);

        if (guess > randomNumber) {
            System.out.println("Your guess was too high! ");
        }else if (guess < randomNumber) {
            System.out.println("Your guess was too low!");
        }else {
            System.out.println("Congratulations! You guessed the right number! ");
        }



}}
