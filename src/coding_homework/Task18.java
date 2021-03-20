package coding_homework;

import java.util.Scanner;
import java.util.regex.Pattern;
/* Write an application that reads a text from the user (type String) and checks
whether the user sneezed, i.e. whether the text equals 􏰀achooo!􏰁 with one or
more letter "o" at the end of the expression (so both 'acho!' and 'achooooooo!􏰁
are correct). Hint: use a regular expression with the appropriate quantifier.*/

public class Task18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sneeze, or don't sneeze..");
        String input = scanner.nextLine();

        String regex = "acho{1,}!";
        boolean matches = Pattern.matches(regex, input);
        if(matches){
            System.out.println("User sneezed");
        } else {
            System.out.println("User didn't sneeze");
        }
        }
    }

