package лаб2;

import java.util.Scanner;

public class task19 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        double X;
        X= s.nextDouble();
        if (X >61) {
            System.out.println("Подкоренное выражение должно быть неотрицательным");
            return;//немедленное завершение программы
        }

        double result;
        result = 3*Math.sqrt(61-X);
        System.out.printf("%.4f", result);
    }

}
