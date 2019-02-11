package лаб6;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        //
        int A;
        Scanner s=new Scanner(System.in);
        A = s.nextInt();
        int i; //счетчик шагов
        i = 0;
        int n; //ограничение
        n = 9;


        while (i <= n ) {
            System.out.println("---");
            System.out.println(A);
            A = A + 1;
            i = i + 1;
        }
        System.out.println("---");
    }}