package лаб2;

import java.util.Scanner;

public class task32 {
    public static void main  (String[] args) {
        //обьявление данных
        double mass1;
        double mass2;
        double distance;
        double force;
        //получение данных
        Scanner s=new Scanner(System.in);
        mass1= s.nextInt();
        mass2= s.nextInt();
        distance= s.nextInt();
        //условие
        if (distance <=0) {
            // вывод результата
            System.out.println("Дистанция должна быть неотрицательной");
            return;//немедленное завершение программы
        }
        if (mass1 <=0) {
            // вывод результата
            System.out.println("Масса должна быть неотрицательной");
            return;//немедленное завершение программы
        }
        if (mass2 <=0) {
            // вывод результата
            System.out.println("Масса должна быть неотрицательной");
            return;//немедленное завершение программы
        }
        //вычисления
        force = 9.8067*(mass1*mass2)/(distance*distance);
        //вывод результата
        System.out.printf("%.4f",force);
    }}
