package лаб6;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();// счетчик
        int B = s.nextInt();// ограничение
        if ( A <= B ) {
            while (A <= B) {
                System.out.print(A);
                System.out.print(";");
                A = A + 1;
            }
            } else {
            System.out.println("Значение A должно быть не больше значения B");
        }}}


