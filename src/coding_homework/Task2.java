package coding_homework;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your weight in kg: ");
        float weightKg = scanner.nextFloat();
        System.out.println("Please enter your height in cm: ");
        float heightCm = scanner.nextFloat();
        float heightM = heightCm / 100;

        float yourBMI = weightKg / (heightM * heightM);

        if (yourBMI >= 18.5 && yourBMI <= 24.9) {
            System.out.println("BMI optimal");
        } else {
            System.out.println("BMI not optimal");
        }
    }
}
