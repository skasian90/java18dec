package лаб6;

import java.util.Scanner;

public class task25 {
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


        while (i < k) { //                                     первый цикл
            System.out.print("#");
            i = i + 1;
        }
        System.out.println();
        i = 0;//          сбросил счетчик
        k = k + 1;//        увеличил ограничение на два
        while (i < k) { //                                     второй цикл
            System.out.print("#");
            n = n + 1;
            i = i + 1;
        }
        System.out.println();
        i = 0;
        k = k + 1;
        while (i < k) { //                                     третий цикл
            System.out.print("#");
            n = n + 1;
            i = i + 1;
        }
        // нужно написать новый цикл, у него будет новые счетчик и ограничение
        // в теле нового цикла нужно выполнять действия которые повторялись ранее
        // в теле нового цикла нужно повторить вывод строки решеток
        i = 0;
        k = k + 1;
        while (n < k) {  //                                     четвертый цикл
            n = n + 1;
            while (i < k) {  //                                  пятый цикл
                System.out.print("#");

                n = 0;
                k = k + 1;

            }

            n = n + 1;
            System.out.println();
        }
    }
}