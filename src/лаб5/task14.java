package лаб5;

import java.util.Scanner;

public class task14 {
    public static void main(String[] args) {
        //обьявление данных
        double X, Y, Z;
        //получение данных
        Scanner s = new Scanner(System.in);
        X = s.nextDouble();
        Y = s.nextDouble();
        Z = s.nextDouble();
        //условие
        if (5 > X && X > -3) {
            System.out.println(X);
        }
        if (5 > Y && Y > -3) {
            System.out.println(Y);
        }
        if (5 > Z && Z > -3) {
            System.out.println(Z);
        }



    }}
