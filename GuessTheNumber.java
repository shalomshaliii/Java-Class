import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        Random random = new Random();
        int secretnumber = random.nextInt(100) + 1;
        int guess;
        int playerbet;
        int balance = 100;
        int attempts = 3;
        System.out.println("welcome to the number guessing game");
        System.out.println("you will start with a balance of $100");
        System.out.println("you have 3 attempts to guess the number");
        while (attempts > 0) {
            System.out.println("your current balance is:" + balance);
            System.out.println("how much will you bet? or if you are afraid of losing you can enter 0");
            playerbet = obj.nextInt();
            if (playerbet == 0) {
                System.out.println("well I am really sorry that you are a quiter, and quiter balance is:" + balance);
                break;
            }
            if (playerbet > balance) {
                System.out
                        .println("I am sorry,you are broke to bet that much money my friend try to bet on your level");
                continue;
            }
            System.out.println("Guess a number from 1 upto 100");
            guess = obj.nextInt();
            attempts--;
            if (guess == secretnumber) {
                System.out.println("you are lucky my friend you have guessed the correct number,and you have won $:"
                        + playerbet * 2);
                balance += playerbet * 2;
                System.out.println("you have" + attempts + "attempts remaining");
                break;

            } else {
                if (guess < secretnumber) {
                    System.out.println("too low!,try again");
                } else {
                    System.out.println("too high!,try again");
                }
                System.out.println("you have" + attempts + "attempts remaining");
            }

            if (attempts == 0) {
                System.out.println("you have run out of attempts! The number was" + secretnumber);
                balance -= playerbet;
                System.out.println("your final balance is:" + balance);

            }

        }
    }
}
