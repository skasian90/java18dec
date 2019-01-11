package лаб2;

import java.util.Scanner;

public class task14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double X;
        X = s.nextDouble();
        if (X < 0) {
            System.out.println("Подкоренное выражение должно быть неотрицательным");
            return;//немедленное завершение программы
        }

        double result;
        result = Math.sqrt(X);
        System.out.printf("%.4f\n", result);
    }}
