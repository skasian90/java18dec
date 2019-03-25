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


        if (H < 0) {
            System.out.print("Значение H должно быть неотрицательно");
            return;
        }


        while (n < H) {

            while (i < H) {
                System.out.println("#");
                i = i + 1;
            }
            System.out.println();
            n = n + 1;
        }

    }}
