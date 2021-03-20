package coding_homework;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter integer a: ");
        double a = scanner.nextInt();
        System.out.println("Please enter integer b: ");
        double b = scanner.nextInt();
        System.out.println("Please enter integer c: ");
        double c = scanner.nextInt();

        double delta = b * b - 4 * a * c;
        System.out.println("Delta is: " + delta);

        if (delta >= 0) {

        double x1 = (-b - Math.sqrt(delta)) / (2 * a);
        System.out.println("The value of x1 is: " + x1);

        double x2 = (-b + Math.sqrt(delta)) / (2 * a);
        System.out.println("The value of x2 is: " + x2);

    } else {
            System.out.println("Delta negative");
        }
}
}