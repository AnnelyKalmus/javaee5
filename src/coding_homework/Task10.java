package coding_homework;
/*
Write an application that gets one positive number (type int) from the user and calculates a sum of
digits of the given number. Hint: to make some operations on every single digit of the number
(digit by digit), you can calculate the remainder of dividing the number by 10 (to get the value of
the last digit) and divide the number by 10 (to "move" to the next digit).*/

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a positive number: ");
        int input = scanner.nextInt();

        System.out.println(sumOfDigits(input));
    }

        public static int sumOfDigits(int input) {

            int sum = 0;
            while (input != 0) {
                sum += input % 10;
                input = input / 10;
            }
            return sum;
        }
    }

