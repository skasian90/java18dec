package лаб5;

import java.util.Scanner;

public class task26 {
    public static void main(String[] args) {
        //обьявление данных
        double A, B, C, D;
        //получение данных
        Scanner s = new Scanner(System.in);
        A = s.nextDouble();
        B = s.nextDouble();
        C = s.nextDouble();
        D = s.nextDouble();

        //условие
        if (A < 0) {
            // вывод результата
            System.out.printf("Значение A должно быть неотрицательным");
        }
        if (B < 0) {
            // вывод результата
            System.out.printf("Значение B должно быть неотрицательным");
        }
        if (C < 0) {
            // вывод результата
            System.out.printf("Значение C должно быть неотрицательным");
        }
        if (D < 0) {
            // вывод результата
            System.out.printf("Значение D должно быть неотрицательным");
        }
        if (A < C && B < D) {
            // вывод результата
            System.out.printf("Размещение возможно");
        }
        if (A > C || B > D) {
            // вывод результата
            System.out.printf("Размещение невозможно");

        }}}
