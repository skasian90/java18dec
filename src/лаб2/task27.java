package лаб2;

import java.util.Scanner;

public class task27 {
    public static void main  (String[] args) {
        //обьявление данных
        double initialVelocity;
        double time;
        double acceleration;
        double distance;
        //получение данных
        Scanner s=new Scanner(System.in);
        initialVelocity= s.nextInt();
        time= s.nextInt();
        acceleration= s.nextInt();
        //условие
        if (time <=0) {
            // вывод результата
            System.out.println("Время должно быть положительным");
            return;//немедленное завершение программы
        }
        if (initialVelocity <=0) {
            // вывод результата
            System.out.println("Начальная скорость должна быть неотрицательна");
            return;//немедленное завершение программы
        }
        //вычисления
        distance = initialVelocity*time+(acceleration*(time*time)/2);
        //вывод результата
        System.out.println(distance);
}}
