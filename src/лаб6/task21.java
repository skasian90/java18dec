package лаб6;

import java.util.Scanner;

/**
 * Created by adm on 26.02.2019.
 */
public class task21 {
    public static void main(String[] args) {
        //
        int W;
        Scanner s = new Scanner(System.in);
        W = s.nextInt();
        int i; //счетчик шагов
        i = 1;
        int n; //ограничение
        n = 20;
        if (W < 0) {
            System.out.print("Значение W должно быть в интервале [0, 20]");
            return;
        }
        if (W > 20) {
            System.out.print("Значение W должно быть в интервале [0, 20]");
            return;
        }

        while (i <= W) {
            System.out.print("a");
            i = i + 1;
        }
        System.out.println();
        i = i - W;

        while (i <= W) {
            System.out.print("b");
            i = i + 1;
        }
        System.out.println();
        i = i - W;
        while (i <= W) {
            System.out.print("c");
            i = i + 1;
        }
        System.out.println();
        i = i - W;

        while (i <= W) {
            System.out.print("d");
            i = i + 1;
        }
        System.out.println();
        i = i - W;
        while (i <= W) {
            System.out.print("e");
            i = i + 1;
        }
        System.out.println();
        i = i - W;
        while (i <= W) {
            System.out.print("f");
            i = i + 1;
        }
        System.out.println();
        i = i - W;
        while (i <= W) {
            System.out.print("g");
            i = i + 1;
        }
        System.out.println();
        i = i - W;
        while (i <= W) {
            System.out.print("h");
            i = i + 1;
        }
        System.out.println();
        i = i - W;
    }


}