package лаб6;

import java.util.Scanner;

public class task23 {
    public static void main(String[] args) {
        //

        Scanner s = new Scanner(System.in);

        int W;// ширина прямоугольника
        W = s.nextInt();
        int H;// высота прямоугольника
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


        while (i <= W) {

            while (n <= H) {
                System.out.print("#");
                n = n + 1;
            }
            System.out.println();
            i = i + 1;
            n = 0;
        }

    }}
