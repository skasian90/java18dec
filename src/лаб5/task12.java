package лаб5;

import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        //обьявление данных
        double x, y, z;
        //получение данных
        Scanner s = new Scanner(System.in);
        x = s.nextDouble();
        y = s.nextDouble();
        z = s.nextDouble();

        //условие
        if (x == y || y == z || x==z) {
            System.out.println("Среди чисел есть равные");
        } else {
            System.out.println("Числа не равны друг другу");
        }
    }}
