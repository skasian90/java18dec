package лаб5;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        //обьявление данных
        double a;
        double b;
        double c;
        double discriminant;
        //получение данных
        Scanner s = new Scanner(System.in);
        a = s.nextDouble();
        b = s.nextDouble();
        c = s.nextDouble();

        //логика программы
        //условие
        if (a==0) {
            // вывод результата
            System.out.printf("Данное уравнение не является квадратным");
            return;//немедленное завершение программы
        }
        //вычисления
        discriminant = (b*b)-(4*a*c);
        //проверка исходных данных
        if (discriminant < 0) {
            System.out.println("Вещественных корней уравнения "+a+"x*x"+2+"x"+c+" нет");
            return; }
        if (discriminant > 0) {
            System.out.println("У уравнения "+a+"x*x"+2+"x"+c+" два вещественных корня");
            return; }
        if (discriminant == 0) {
            System.out.println("Уравнение "+a+"x*x"+2+"x"+c+" имеет один корень");
            return; }



    }}
