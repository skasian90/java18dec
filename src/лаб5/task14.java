package лаб5;

import java.util.Scanner;

public class task14 {
    public static void main(String[] args) {
        //обьявление данных
        double X;

        //получение данных
        Scanner s = new Scanner(System.in);
        X = s.nextDouble();
        //логика программы
        if (X < -11 || X > 19 ) {
            // вывод результата
            System.out.printf("X не попадает ни в зеленый, ни в красный интервал");
        }
        if (X > -3 && X < 5 ) {
            // вывод результата
            System.out.printf("X не попадает ни в зеленый, ни в красный интервал");
        }

        //условие
        if (X >= -11 && X <=-3) {
            System.out.printf("Красный");
        }
        if (X >= 5 && X <= 19 ) {
            System.out.printf("Зеленый");
        }

    }}
