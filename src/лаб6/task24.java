package лаб6;

import java.util.Scanner;

public class task24 {
    public static void main(String[] args) {
        //

        Scanner s = new Scanner(System.in);

        int W;// ограничение ширины сетки вводимые пользователем
        W = s.nextInt();
        int H;// ограничение высоты сетки вводимые пользователем
        H = s.nextInt();
        int i;//счетчик символов в строке
        i = 0;
        int n;//счетчик количества строк
        n = 0;

        if (W < 0) {
            System.out.print("Значение W должно быть неотрицательно");
            return;
        }
        if (H < 0) {
            System.out.print("Значение H должно быть неотрицательно");
            return;
        }

        System.out.print(" ");//Один раз перед циклом
        while (i < W ) {
            System.out.print(i);
            i = i + 1;
            }
        System.out.println();
        i = 0;

        while (n < H) {
            System.out.print(n);
            n = n + 1;

            i = 0;
            while (i < W ) {
                System.out.print(".");
                i = i + 1;
            }
            System.out.print("|");
            System.out.println();
        }
        i = 0;
        System.out.print(" ");
        while (i < W ) {
            i = i + 1;
            System.out.print("-");

        }


}}
