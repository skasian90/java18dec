package лаб6;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();// ограничение
        int B = s.nextInt();// счетчик
        if ( A <= B ) {
            System.out.print("{");
            while (A <= B) {

                System.out.print(B);
                B = B - 1;
                System.out.print(" ");

            }
            System.out.print("}");
        } else {
            System.out.println("Значение A должно быть не больше значения B");
        }}}
