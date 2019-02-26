package лаб6;

import java.util.Scanner;

/**
 * Created by adm on 26.02.2019.
 */
public class task22 {
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
            System.out.print("1");
            i = i + 1;
        }

        System.out.println();
        i = i - W;
        while (i <= W) {
            System.out.print("2");
            i = i + 1;
        }
        System.out.println();
        i = i - W;

        while (i <= W) {
            System.out.print("3");
            i = i + 1;
        }
        System.out.println();
        i = i - W;
        while (i <= W) {
            System.out.print("4");
            i = i + 1;
        }
        System.out.println();
        i = i - W;
        while (i <= W) {
            System.out.print("5");
            i = i + 1;
        }
        System.out.println();
        i = i - W;
        while (i <= W) {
            System.out.print("6");
            i = i + 1;
        }
        System.out.println();
        i = i - W;
        while (i <= W) {
            System.out.print("7");
            i = i + 1;
        }
        System.out.println();
        i = i - W;

        while (i <= W) {
            System.out.print("8");
            i = i + 1;
        }

        System.out.println();
        i = i - W;
        while (i <= W) {
            System.out.print("9");
            i = i + 1;
        }
        System.out.println();
        i = i - W;
    }
}
