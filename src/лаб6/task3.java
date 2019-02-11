package лаб6;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        //
        String X;
        Scanner s=new Scanner(System.in);
        X = s.nextLine();
        int i; //счетчик шагов
        i = 1;
        int n; //ограничение
        n = 7;
        System.out.print("\"");

        while (i <= n ) {
            System.out.print(X);
            i = i + 1;
        }
        System.out.print("\"");
    }}