package coding_homework;

import java.util.Scanner;

/*Write an application that takes a number n from the user (type int)
and calculates the sum of the harmonic series from 1 to n, according to the formula. */

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        double sum = 0.0;
        while (number > 0) {
            sum = sum + (double) 1 / number;
            number--;
        }
        System.out.println("Sum of the harmonic series from 1 to entered number is: " + sum);
    }
}


