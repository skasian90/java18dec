package лаб6;

import java.util.Scanner;

/**
 * Created by adm on 26.02.2019.
 */
public class task22_2 {
    public static void main(String[] args) {
        //
        int i;//счетчик цифр в строке
        i = 0;
        int n;
        n = 0;//счетчик строк
        int W;//ограничение цифр в строке
        Scanner s = new Scanner(System.in);
        W = s.nextInt();
        int q;//ограничение по строкам
        q = 9;


        if (W < 0) {
            System.out.print("Значение W должно быть в интервале [0, 20]");
            return;
        }
        if (W > 20) {
            System.out.print("Значение W должно быть в интервале [0, 20]");
            return;
        }
        while (n <= q) {

            while (i < W) {
                System.out.print(n);
                i = i + 1;
            }
            System.out.println();
            n = n + 1;
            i = 0;
        }

    }}