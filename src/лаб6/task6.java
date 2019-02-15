package лаб6;

        import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        //
        int X;
        int n; // n - ограничение
        Scanner s=new Scanner(System.in);
        X = s.nextInt();
        int i; //счетчик шагов
        i = 0;
        n = 10;

        while (i <= n ) {
            System.out.print(" ");
            System.out.print(X);
            i = i + 1;
            X = X + 3;
        }}}