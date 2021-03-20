package coding_homework;

import java.time.LocalDate;
import java.util.Scanner;
import static java.time.temporal.ChronoUnit.DAYS;

/*Write an application that will read from the user the date of your next SDA classes and calculate how many days are left to them.
Hint: read the date as String and parse it to LocalDate. Get the current date using LocalDate.now() method. */

public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the date of next SDA class (yyyy-mm-dd) :");
        String inputDate = scanner.nextLine();

        LocalDate dateOfNextSDA = LocalDate.parse(inputDate);

        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

        long daysUntilSDA = DAYS.between(currentDate, dateOfNextSDA);
        System.out.println("There are " + daysUntilSDA + "days left until next SDA class");
    }
}
