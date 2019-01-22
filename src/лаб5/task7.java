package лаб5;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        //обьявление данных
        double radius;
        double edge;
        //получение данных
        Scanner s = new Scanner(System.in);
        radius = s.nextDouble();
        edge = s.nextDouble();
        //логика программы
        if (radius*radius < edge*edge) {
            System.out.println("Площадь квадрата " + edge + " больше площади круга " + radius + "");
        }
        if (radius*radius > edge*edge) {
            System.out.println("Площадь круга " + radius + " больше площади квадрата " + edge + "");
        }
        if (radius < 0) {
            System.out.println("Радиус должен быть положительным");
            return; }
        if (edge < 0) {
            System.out.println("Сторона квадрата должна быть положительна");
            return; }

    }}
