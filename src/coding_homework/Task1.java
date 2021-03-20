package coding_homework;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter diameter: ");
        float diameter = scanner.nextFloat();
        float π = 3.14f;
        System.out.println("Perimeter of a circle is: " + diameter * π);

        System.out.println("Perimeter of a circle is: " + Math.PI * diameter);
    }
}
