package laba1.tests;
import java.util.Scanner;

public class Proga4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите название месяца: ");
        String monthName = scanner.next();

        System.out.print("Введите количество дней в этом месяце: ");
        int days = scanner.nextInt();

        System.out.println("Месяц " + monthName + " содержит " + days + " дней.");

    }

}
