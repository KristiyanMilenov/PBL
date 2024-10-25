
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello");
        System.out.println("This game generates a random number from 1-100");
        System.out.println("Your task is to guess the number");
        System.out.println("You will be provided with hints whether your guess is higher or lower");

        Random rand = new Random();
        int randomnumber = 0;
        randomnumber = rand.nextInt(100) + 1;



        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number:");
        int attempts = 0;
        int number = 0;
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
            System.out.println("You entered the number: " + number);
        } else {
            String invalidInput = scanner.next();
            System.out.println("Error: '" + invalidInput + "' is not a valid number.");
        }

        while (randomnumber != number) {
            if (randomnumber<number){
                System.out.println("Guess lower");
            }
             else if (randomnumber>number) {
                System.out.println("Guess higher");
            }

            System.out.println("Guess again: ");
             number = scanner.nextInt();
            attempts++;
        }

        if (randomnumber==number){
            System.out.println("Congratulations you win");
            System.out.println("It took you "+ attempts+" attempts");
        }

    }

}
