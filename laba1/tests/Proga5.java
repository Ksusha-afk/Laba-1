package laba1.tests;
import java.util.Scanner;
import java.util.Calendar;

public class Proga5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int myyear, result;
        do {
            System.out.print("Введите Ваш год рождения: ");
            myyear = sc.nextInt();
            result = myyear - year;
        } while(result>0); // this line changed
        System.out.println("Вам "+result+ "года/лет");//line changed

    }
}
