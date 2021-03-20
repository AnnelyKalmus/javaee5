package coding_homework;
/*Write an application that will play "too much, too little" game with you. At the beginning the application
should randomly choose a number from 0 to 100 (hint: use the Random.nextInt() method) and wait for the user
to enter a number. If the user gives a number greater than the number chosen by the computer, your
application should print "too much" and wait for the next number. If the user gives a smaller number,
the application should print "not enough" and wait for the next number in the same way. If the user provides
the exact value, the application should print the word "Congratulations!" and finish. */

import java.util.Random;
import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Random number = new Random();
        int chosenNumber = number.nextInt(100);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number between 0 and 100: ");
        int userInput = scanner.nextInt();

        do {
            if (userInput < 0 || userInput > 100) {
                System.out.println("not valid range, please enter number between 0 and 100: ");
                userInput = scanner.nextInt();
            } else if (userInput > chosenNumber) {
                System.out.println("too much");
                userInput = scanner.nextInt();
            } else if (userInput < chosenNumber) {
                System.out.println("not enough");
                userInput = scanner.nextInt();
            }
        } while (userInput != chosenNumber);
        System.out.println("Congratulations!");
    }
}
