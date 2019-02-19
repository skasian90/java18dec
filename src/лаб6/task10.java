package лаб6;

import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();// ограничение
        int B = s.nextInt();// счетчик


        if ( A < B ) {
            System.out.print("По возрастанию");
            System.out.println();
            while (A <= B) {
                System.out.print(A);
                A = A + 1;
                System.out.print(" ");
            }
        } else {
        System.out.println("По убыванию");
        while ( B <= A ) {
        System.out.print(A);
        A = A - 1;
        System.out.print(" ");
        }}}}