package лаб2;

import java.util.Scanner;

public class task37 {
    public static void main  (String[] args) {
        //обьявление данных
        double x;
        double R;
        //получение данных
        Scanner s=new Scanner(System.in);
        x= s.nextInt();
        //условие
        if (x <0) {
            // вывод результата
            System.out.println("Подкоренное выражение должно быть неотрицательным");
            return;//немедленное завершение программы
        }
        //вычисления
        R = (Math.sqrt(x+5)+Math.sqrt(x-5))/(2*Math.sqrt(x));
        //вывод результата
        System.out.printf("%.6f",R);
    }
}
