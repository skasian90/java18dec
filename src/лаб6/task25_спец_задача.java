package лаб6;

import java.util.Scanner;

public class task25_спец_задача {
    public static void main(String[] args) {
        //

        Scanner s = new Scanner(System.in);


        int H;// высота лесенки
        H = s.nextInt();
        int i;//счетчик символов в строке
        i = 0;
        int n;//счетчик количества строк
        n = 0;
        int k;// ограничение символов в строке
        k = 0;

        // Задача была в том чтобы вывести две строки символов, в первой строке 6 а во второй на два больше

        if (H < 0) {
            System.out.print("Значение H должно быть неотрицательно");
            return;
        }
        k = H;


        while (i < k) {
            System.out.print("#");
            i = i + 1;
        }
        System.out.println();
        i = 0;//          сбросил счетчик
        k = k + 2;//        увеличил ограничение на два
        System.out.println();
        System.out.print(H);
        while (i < k) {
            System.out.print("#");
            n = n + 1;
            i = i + 1;
        }
        System.out.println();
        i = 0;
        k = k + 2;
        System.out.print(k);
        while (i < k) {
            System.out.print("#");
            n = n + 1;
            i = i + 1;
        }
        // нужно написать новый цикл, у него будет новые счетчик и ограничение
        // в теле нового цикла нужно выполнять действия которые повторялись ранее
        // в теле нового цикла нужно повторить вывод строки решеток
        i = 0;
        k = 10;
        n = 0;
        while (i < k) {
            n = 0;
            k = k + 2;
            while (n < k) {
                System.out.print("#");
                n = n + 1;

            }

            i = i + 1;
            System.out.println();
        }
    }
}