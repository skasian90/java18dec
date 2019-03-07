package лаб6;

import java.util.Scanner;

public class task20 {
    public static void main(String[] args) {

        int W;// ограничитель столбцов
        int i;// счетчик столбцов
        int d;// ограничитель минусов


        Scanner s = new Scanner(System.in);
        W = s.nextInt();
        i = 1;
        d = W - 2;

        if (W < 0) {
            System.out.print("Значение W должно быть неотрицательно");
            return;
        }
        System.out.print("+");
        while (i <= d) {
            i = i + 1; //увеличение счетчика
            System.out.print("-");
        }
        System.out.println("+");
        System.out.print("|");
        i = 2;
        while (i < W) {
            i = i + 1; //увеличение счетчика
            System.out.print(".");
        }
        System.out.println("|");
        System.out.print("+");
        i = 1;
        while (i <= d) {
            i = i + 1; //увеличение счетчика
            System.out.print("-");
        }
        System.out.print("+");
    }}
