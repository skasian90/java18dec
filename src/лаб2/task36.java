package лаб2;

import java.util.Scanner;

public class task36 {
    public static void main  (String[] args) {
        //обьявление данных
        double a;
        double b;
        double c;
        double x;
        double result;
        //получение данных
        Scanner s=new Scanner(System.in);
        a= s.nextInt();
        b= s.nextInt();
        c= s.nextInt();
        x= s.nextInt();
        //условие
        if (a <0) {
            // вывод результата
            System.out.println("Подкоренное выражение должно быть неотрицательным");
            return;//немедленное завершение программы
        }
        if (b <0) {
            // вывод результата
            System.out.println("Подкоренное выражение должно быть неотрицательным");
            return;//немедленное завершение программы
        }
        if (c <0) {
            // вывод результата
            System.out.println("Подкоренное выражение должно быть неотрицательным");
            return;//немедленное завершение программы
        }
        if (x <0) {
            // вывод результата
            System.out.println("Подкоренное выражение должно быть неотрицательным");
            return;//немедленное завершение программы
        }
        if (a !=0) {
            // вывод результата
            System.out.println("Знаменатель не может быть равен нулю");
            return;//немедленное завершение программы
        }
        //условие
        if (b !=0) {
            // вывод результата
            System.out.println("Знаменатель не может быть равен нулю");
            return;//немедленное завершение программы
        }
        //условие
        if (c !=0) {
            // вывод результата
            System.out.println("Знаменатель не может быть равен нулю");
            return;//немедленное завершение программы
        }
        //условие
        if (x !=0) {
            // вывод результата
            System.out.println("Знаменатель не может быть равен нулю");
            return;//немедленное завершение программы
        }
        //вычисления
        result = 1/Math.sqrt((a*(x*x))+(b*x)+c);
        //вывод результата
        System.out.printf("%.4f",result);
    }
}
