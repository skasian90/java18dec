package лаб5;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        //обьявление данных
        double radius;
        double edge;
        double circle;
        double square;
        //получение данных
        Scanner s = new Scanner(System.in);
        radius = s.nextDouble();
        edge = s.nextDouble();
        //проверка исходных данных
        if (radius < 0) {
            System.out.println("Радиус должен быть положительным");
            return; }
        if (edge < 0) {
            System.out.println("Сторона квадрата должна быть положительна");
            return; }
        //логика программы
        circle = Math.PI*(radius*radius);
        square = edge*edge;
        if (circle < square) {
            System.out.printf("Площадь квадрата %.4f больше площади круга %.4f",circle,square );
        }
        if (circle > square) {
            System.out.printf("Площадь круга %.4f больше площади квадрата %.4f",circle,square);
        }

    }}