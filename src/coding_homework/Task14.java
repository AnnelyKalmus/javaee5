package coding_homework;
/*
Write an application that reads two lowercase letters of the Latin alphabet (type char) and calculates
how many characters is there in the alphabet between given letters. Hint - use the ASCII code table and
treat the characters as int numbers.*/

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first character: ");
        char firstChar = scanner.next().charAt(0);
        System.out.println("Please enter second character: ");
        char secondChar = scanner.next().charAt(0);

        int asciiOfFirst = (int) firstChar;
        int asciiOfSecond = (int) secondChar;
      //  System.out.println("Numeric values of entered characters are: " + asciiOfFirst + " and " + asciiOfSecond);

        int bigger = 0;
        int smaller = 0;
        int result;


        if (asciiOfFirst > asciiOfSecond) {
            bigger = asciiOfFirst;
            smaller = asciiOfSecond;
        } else if (asciiOfFirst < asciiOfSecond) {
            smaller = asciiOfFirst;
            bigger = asciiOfSecond;
        }
        if (bigger >= smaller) {
            result = bigger - smaller;

            System.out.println("There are " + result + " characters between letter " + firstChar + " and letter " + secondChar + ".");
        }
    }
    }
