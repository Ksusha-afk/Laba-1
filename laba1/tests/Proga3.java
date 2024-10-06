package laba1.tests;

import java.util.Scanner;

public class Proga3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Day ");
        String day = in.nextLine();

        System.out.println("Month ");
        String month = in.nextLine();

        System.out.println("Year");
        String date = in.nextLine();

        System.out.printf("Cегодня, Date: %s Month: %s Year: %s \n", date, day, month);
        in.close();

    }
}
