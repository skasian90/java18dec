package лаб2;

import java.util.Scanner;

public class task19 {
    public static void main(String[] args) {
        //обьявление данных
        Scanner s= new Scanner(System.in);
        double X;
        //получение данных
        X= s.nextDouble();
        //проверка исходных данных
        if (X >61) {
            // вывод результата
            System.out.println("Подкоренное выражение должно быть неотрицательным");
            return;//немедленное завершение программы
        }

        double result;
        //вычисления
        result = 3*Math.sqrt(61-X);
        //вывод результата
        System.out.printf("%.4f", result);
    }

}
