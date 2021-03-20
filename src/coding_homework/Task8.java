package coding_homework;

import java.util.Scanner;

/*Write an application that implements a simple calculator. The application should: a. read first number (type float)
        b. read one of following symbols: + - / * c. read second number (type float)
        d. return a result of given mathematical operation
        If the user provides a symbol other than supported, the application should print "Invalid symbol".
If the entered action cannot be implemented (i.e. it is inconsistent with the principles of mathematics),
the application should print "Cannot calculate".
 */
public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number: ");
        float firstNumber = scanner.nextFloat();
        System.out.print("enter operator: ");
        char operator = scanner.next().charAt(0);
        System.out.print("enter second number: ");
        float secondNumber = scanner.nextFloat();

        float result = 0;
        switch (operator) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '/':
                result = firstNumber / secondNumber;
                if (secondNumber == 0)
                    System.out.println("Cannot calculate");
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            default:
                System.out.println("Cannot calculate");
                return;
        }

        System.out.println("Result is: " + firstNumber + " " + operator + " " + secondNumber + " = " + result);
    }
}
