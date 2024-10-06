package laba1.tests;
import java.util.Scanner;

public class Proga9 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите число ");
        int x = in.nextInt();

        int y = x++;
        int a = x--;
        int b = x*x;

        System.out.println("Последовательность чисел: "+a+ +x+ +y+ +b);

    }
}
