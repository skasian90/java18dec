package лаб6;

import java.util.Scanner;

public class task333 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();// число вводимое пользователем
        int B = s.nextInt();// число вводимое пользователем

            while (A <= B) {
                System.out.print(A);
                A = A + 1;
            }
            A = A - B;
        System.out.println();
            while ( B >= A ) {
                System.out.print(B);
                B = B - 1;
            }}}