package лаб5;

import java.util.Scanner;

public class task18 {
    public static void main(String[] args) {
        //обьявление данных
        double A, B, C;
        //получение данных
        Scanner s = new Scanner(System.in);
        A = s.nextDouble();
        B = s.nextDouble();
        C = s.nextDouble();

        //условие
        if (A < 0) {
            // вывод результата
            System.out.printf("Значение A должно быть неотрицательным");
            return;//немедленное завершение программы
        }
        if (B < 0) {
            // вывод результата
            System.out.printf("Значение B должно быть неотрицательным");
            return;//немедленное завершение программы
        }
        if (C < 0) {
            // вывод результата
            System.out.printf("Значение C должно быть неотрицательным");
            return;//немедленное завершение программы
        }
        if (A == B || A == C || B==C) {
            System.out.println("Треугольник является равнобедренным.");
        } else {
            System.out.println("Треугольник не является равнобедренным.");
        }
        }}