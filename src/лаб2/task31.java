package лаб2;

import java.util.Scanner;

public class task31 {
    public static void main  (String[] args) {
        //обьявление данных
        double a;
        double b;
        double c;
        double discriminant;
        //получение данных
        Scanner s=new Scanner(System.in);
        a= s.nextInt();
        b= s.nextInt();
        c= s.nextInt();
        //условие
        if (a==0)  {
            // вывод результата
            System.out.printf("Уравнение y=0 x^2+%sx+%s не является квадратным", b, c);
            return;//немедленное завершение программы
        }
        //вычисления
        discriminant = (b*b)-(4*a*c);
        //вывод результата
        System.out.printf("%.4f",discriminant);
    }}

