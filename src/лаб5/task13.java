package лаб5;

import java.util.Scanner;

public class task13 {
    public static void main(String[] args) {
        //обьявление данных
        double A;
        double B;
        double X;
        double result;
        //получение данных
        Scanner s = new Scanner(System.in);
        A = s.nextDouble();
        B = s.nextDouble();
        X = s.nextDouble();

        if (A > B) {
            // проверка данных
            System.out.printf("Некорректный интервал. Левая граница должна быть меньше правой");
        }
        //условие
        if (X >= A && X <= B ) {
            // вывод результата
            System.out.printf(" "+X+" попадает в интервал от "+A+" до "+B+"");
        }
        if (X < A && X < B ) {
            // вывод результата
            System.out.printf(" "+X+" за пределами интервала от "+A+" до "+B+"");
        }
        if (X > A && X > B ) {
            // вывод результата
            System.out.printf(" "+X+" за пределами интервала от "+A+" до "+B+"");
        }

        }}