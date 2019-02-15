package лаб6;

import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();// ограничение
        int B = s.nextInt();// счетчик

        if (A == B) {
            System.out.println("Границы равны");
            System.out.print(A);
        }
        if ( A < B ) {
            System.out.print("От A до B");
            System.out.println();
            while (A <= B) {
                System.out.print(A);
                A = A + 1;
                System.out.print(" ");
            }}
         if ( B < A ) {
             while ( B <= A ) {
            System.out.print(B);
            B = B + 1;
            System.out.print(" ");
        }}}}