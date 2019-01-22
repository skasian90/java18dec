package лаб5;

import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        //обьявление данных
        double areaCircle;
        double areaSquare;
        double a;
        double d;
        //получение данных
        Scanner s = new Scanner(System.in);
        areaCircle = s.nextDouble();
        areaSquare = s.nextDouble();

        //логика программы
        d=2*Math.sqrt(areaCircle/Math.PI);
        a=Math.sqrt(areaSquare);
        //условие
        if (d > a) {
            // вывод результата
            System.out.printf("Круг не поместится в квадрате");
        }
        if (d < a) {
            // вывод результата
            System.out.printf("Круг уместится в квадрате");
        }
        if (areaCircle < 0) {
            // вывод результата
            System.out.printf("Площадь круга должна быть положительной");
        }
        if (areaSquare < 0) {
            // вывод результата
            System.out.printf("Площадь квадрата должна быть положительной");
        }

    }}
