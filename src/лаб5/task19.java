package лаб5;

import java.util.Scanner;

public class task19 {
    public static void main(String[] args) {
        //обьявление данных
        double X, Y, Z;
        double result;
        //получение данных
        Scanner s = new Scanner(System.in);
        X = s.nextDouble();
        Y = s.nextDouble();
        Z = s.nextDouble();

        //логика программы

        if (X > Y && X > Z) {
            result = X;
            System.out.println(result);
        }
        if (Y > X && Y > Z) {
            result = Y;
            System.out.println(result);
        }
        if (Z > Y && Z > X) {
            result = Z;
            System.out.println(result);
        }}}
