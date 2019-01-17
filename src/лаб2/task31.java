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
        //вычисления
        discriminant = (b*b)-(4*a*c);
        //вывод результата
        System.out.println(discriminant);
    }}
