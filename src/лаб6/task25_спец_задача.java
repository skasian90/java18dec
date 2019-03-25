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
        k = 6;

   // Задача была в том чтобы вывести две строки символов, в первой строке 6 а во второй на два больше

        if (H < 0) {
            System.out.print("Значение H должно быть неотрицательно");
            return;
        }



        while (i < k ) {
            System.out.print("#");
            i = i + 1;
        }
        System.out.println();
        i = 0;//          сбросил счетчик
        k = k + 2;//        увеличил ограничение на два
        System.out.println();
        while (i < k ) {
            System.out.print("#");
            n = n + 1;
            i = i + 1;


        }}}