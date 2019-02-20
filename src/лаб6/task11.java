package лаб6;

import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();// ограничение
        int B = s.nextInt();// счетчик
        int i; // ограничение левого и правого столбца
        int S; // счетик строк






        if (A == B) {
            System.out.print(A);
            System.out.print(" ");
            System.out.print(B);
            System.out.println();
            System.out.print("Всего строк 1");
        }
        if ( A > B ) {
            System.out.println();
            i = A;
            S = A - B + 1;
            while (B <= i) {
                System.out.print(A);
                System.out.print(" ");
                A = A - 1;
                System.out.print(B);
                B = B + 1;
                System.out.println();
            }
            System.out.print("Всего строк " + S + "");

        } else {
            i = B;
            S = B - A + 1;
            while (A <= i) {

                System.out.print(A);
                A = A + 1;
                System.out.print(" ");
                System.out.print(B);
                B = B - 1;
                System.out.println();
            }
            System.out.print("Всего строк  "+ S +"");
        }}}