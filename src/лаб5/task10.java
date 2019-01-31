package лаб5;

import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        //обьявление данных
        double X;
        double Y;
        double Z;
        double result;

        //получение данных
        Scanner s = new Scanner(System.in);
        X = s.nextDouble();
        Y = s.nextDouble();
        Z = s.nextDouble();

        //логика программы
        if (X > 0) {
            result = X * X;
        } else {
            result = X;}
        System.out.println(result);
        if (Y > 0) {
            result = Y * Y;
        } else {
            result = Y;}
        System.out.println(result);
        if (Z > 0) {
            result = Z * Z;
        } else {
            result = Z;}
        System.out.println(result);
    }}
