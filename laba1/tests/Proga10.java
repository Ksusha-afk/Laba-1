package laba1.tests;

import java.util.Scanner;

public class Proga10 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число ");
        int x = in.nextInt();

        System.out.println("Введите второе число ");
        int y = in.nextInt();

        int sum = y + x;
        int difference = x - y;

        System.out.println("Сумма чисел: " + sum + " Разность чисел: " + difference);

    }


}
