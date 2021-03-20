package coding_homework;
/*
Write an application that will take a positive number from the user (type int) and calculate the Fibonacci
number at the indicated index. For example, if the number equals 5, your program should print the fifth
Fibonacci number. In Fibonacci sequence, each number is the sum of the two preceding ones.
For example, the first few Fibonacci numbers are: 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377...*/

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a positive number: ");
        int input = scanner.nextInt();

        int num1 = 0;
        int num2 = 1;
        int counter = 0;
        while (counter < input) {

            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
        List<Integer> fibonacciNumbers = Arrays.asList(num1);
        System.out.println(fibonacciNumbers.get(fibonacciNumbers.size() - 1));
    }
}
