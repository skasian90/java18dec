package лаб5;

import java.util.Scanner;

public class task27 {
    public static void main(String[] args) {
        //обьявление данных
        double Xt, Yt;
        //получение данных
        Scanner s = new Scanner(System.in);
        Xt = s.nextDouble();
        Yt = s.nextDouble();


        //условие
        if (Xt < 0) {
            // вывод результата
            System.out.printf("Координата X должна быть неотрицательной");
        }
        if (Yt < 0) {
            // вывод результата
            System.out.printf("Координата Y должна быть неотрицательной");
        }
        if (100 <= Xt >= 190 || Yt <= 100 || Yt >= 170) {
            // вывод результата
            System.out.printf("Точка внутри");
        } else {
            System.out.println("Точка снаружи");
        }}}
