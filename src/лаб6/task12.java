package лаб6;

import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        //
        int X;
        Scanner s = new Scanner(System.in);
        X = s.nextInt();
        int i; //счетчик шагов
        i = 10;
        int n; //ограничение
        n = 20;


        while (i <= n) {
            if (i == X) {
                System.out.print(i);
                System.out.println("+");
            } else {
                System.out.println(i);
            }
            i = i + 1; //увеличение счетчика

        }
    }
}
