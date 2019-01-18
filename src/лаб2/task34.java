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
        //условие
        if (a ==0) {
            // вывод результата
            System.out.println("Значение a должно быть не равно нулю");
            return;//немедленное завершение программы
        }
        if (d ==0) {
            // вывод результата
            System.out.println("Значение d должно быть не равно нулю");
            return;//немедленное завершение программы
        }
        //вычисления
        R = ((a*d)+(b*c))/(a*d);
        //вывод результата
        System.out.printf("%f",R);
    }
}
