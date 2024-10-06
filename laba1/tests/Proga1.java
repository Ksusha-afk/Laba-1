package laba1.tests;

import java.util.Scanner;

public class Proga1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Имя: ");
        String name = in.nextLine();

        System.out.print("Фамилия: ");
        String secondName = in.nextLine();

        System.out.print("Отчество: ");
        String lastname = in.nextLine();

        System.out.printf("Привет, Фамилия: %s Имя: %s Отчество: %s \n", name, secondName, lastname);
        in.close();
    }
}