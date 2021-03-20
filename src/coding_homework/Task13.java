package coding_homework;
/*Write an application that "stutters", that is, reads the user's text (type String), and prints the given text,
in which each word is printed twice.
For example, for the input: "This is my test" the application should print "This This is is my my test test".*/

import java.util.Scanner;
//
public class Task13 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] words = s.split("\\s+");

        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replaceAll("[^\\w]", "");
            System.out.print(words[i] + " " + words[i] + " ");
        }
    }

}



