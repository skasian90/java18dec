package лаб2;

import java.util.Scanner;

public class task29 {
    public static void main  (String[] args) {
        //обьявление данных
        double R1;
        double R2;
        double result;
        //получение данных
        Scanner s=new Scanner(System.in);
        R1= s.nextInt();
        R2= s.nextInt();
        //условие
        if (R1 <0)  {
            // вывод результата
            System.out.println("Значение R1 должно быть не равно нулю");
            return;//немедленное завершение программы
        }
        if (R1 >0) {
            // вывод результата
            System.out.println("Значение R1 должно быть не равно нулю");
            return;//немедленное завершение программы
        }
        if (R2 <0)  {
            // вывод результата
            System.out.println("Значение R2 должно быть не равно нулю");
            return;//немедленное завершение программы
        }
        if (R2 >0) {
            // вывод результата
            System.out.println("Значение R2 должно быть не равно нулю");
            return;//немедленное завершение программы
        }
        //вычисления
        result = (1/R1)+(1/R2);
        //вывод результата
        System.out.println(result);
    }}
