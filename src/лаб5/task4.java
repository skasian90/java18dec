package лаб5;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        //обьявление данных
        int A;
        double result;
        //получение данных
        Scanner s = new Scanner(System.in);
        A = s.nextInt();
        //логика программы
        if (A < 0) {
            result = A * (-1);
        } else {
            result = A;
        }
        System.out.println(result);
    }
}
