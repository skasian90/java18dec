package лаб5;

import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {
        //обьявление данных
        double a, b, c;
        //получение данных
        Scanner s = new Scanner(System.in);
        a = s.nextDouble();
        b = s.nextDouble();
        c = s.nextDouble();

        //условие
        if (a < b && b < c) {
            System.out.println("Выполняется");
        } else {
            System.out.println("Не выполняется");
        }
    }}