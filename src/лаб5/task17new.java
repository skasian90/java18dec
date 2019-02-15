package лаб5;

import java.util.Scanner;

public class task17new {
    public static void main(String[] args) {
        //обьявление данных
        double redA, redB, greenA, greenB;
        //получение данных
        Scanner s = new Scanner(System.in);
        redA = s.nextDouble();
        redB = s.nextDouble();
        greenA = s.nextDouble();
        greenB = s.nextDouble();

        //условие
        if (redA > redB || greenA > greenB) {
            System.out.printf("Некорректный интервал. Левая граница должна быть меньше правой.");
            return;//немедленное завершение программы
        }
        //логика программы
        if (redA < greenA && redA < greenB && redB < greenA && redB < greenB) {
            System.out.printf("не пересекаются");
        }}}