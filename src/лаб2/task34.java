package лаб2;

import java.util.Scanner;

public class task34 {
    public static void main  (String[] args) {
        //обьявление данных
        double a;
        double b;
        double c;
        double d;
        double R;
        //получение данных
        Scanner s=new Scanner(System.in);
        a= s.nextInt();
        b= s.nextInt();
        c= s.nextInt();
        d= s.nextInt();

        //вычисления
        R = (a*d)+(b*c)/a*d;
        //вывод результата
        System.out.printf("%f",R);
    }
}
