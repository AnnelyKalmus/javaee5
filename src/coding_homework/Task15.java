package coding_homework;

import java.util.Arrays;
import java.util.Scanner;

/*
Write an application that reads from the user 10 arbitrarily large numbers (variables
of type int) and prints those that occurred at least twice. */

// What is arbitrarily large? Did the task with just int type.

public class Task15 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write 10 numbers: ");
        int[] array = new int[10];

        for (int i = 0; i < 10; i++) {
            array[i] = scanner.nextInt();
        }
        for (int x : array) {
        }
        System.out.println("Numbers occurring more than once are: ");
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if ((array[i] == array[j]) && (i != j)) {
                    System.out.println(array[j]+ " ");
                }
                }
            }

    }
}
