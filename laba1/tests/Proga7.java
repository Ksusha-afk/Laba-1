package laba1.tests;
import java.util.Scanner;
import java.util.Calendar;

public class Proga7 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите Ваше имя: ");
        String name = sc.nextLine();

        int year = Calendar.getInstance().get(Calendar.YEAR);
        int yearOfBirthday;

        System.out.print("Введите Ваш возраст: ");
        int age = sc.nextInt();

        do {
            yearOfBirthday = age - year;
        } while(yearOfBirthday>0); // this line changed
        System.out.println("Вы родились в "+yearOfBirthday+"году"+name);//line changed


    }

}
