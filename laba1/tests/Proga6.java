package laba1.tests;
import java.util.Scanner;
import java.util.Calendar;

public class Proga6 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите Ваше имя: ");
        String name = sc.nextLine();

        int year = Calendar.getInstance().get(Calendar.YEAR);
        int myyear, result;
        do {
            System.out.print("Введите Ваш год рождения: ");
            myyear = sc.nextInt();
            result = myyear - year;
        } while(result>0); // this line changed
        System.out.println("Вам"+result+"лет"+name);//line changed
    }
}
