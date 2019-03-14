package лаб6;

import java.util.Scanner;

public class task333 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();// число вводимое пользователем
        int B = s.nextInt();// число вводимое пользователем
        int n;
        n = A;

        if (A < B) {
            while (A <= B) {
                System.out.print(A);
                A = A + 1;
            }
        } else {
            while (A >= B) {
                System.out.print(A);
                A = A - 1;

            }

        }
        A = A - B;
        System.out.println();
        if (B > n) {
            while (B >= n) {
                System.out.print(B);
                B = B - 1;
            }
        } else {
            while (B <= n) {
                System.out.print(B);
                B = B + 1;
            }


        }
    }
}