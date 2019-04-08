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

        System.out.print(" 0");//Один раз перед циклом
        while (i <= W ) {
            i = i + 1;
            System.out.println(i);
            while (n <= H)
                n = n + 1;
                System.out.println(n);

        }
        System.out.println();

}}
