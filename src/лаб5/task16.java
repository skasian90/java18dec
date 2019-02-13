package лаб5;

import java.util.Scanner;

public class task16 {
    public static void main(String[] args) {
        //обьявление данных
        double redA, redB, greenA, greenB;
        //получение данных
        Scanner s = new Scanner(System.in);
        redA = s.nextDouble();
        redB = s.nextDouble();
        greenA = s.nextDouble();
        greenB = s.nextDouble();

        //логика программы
        if (redA > redB || greenA > greenB) {
            System.out.printf("Некорректный интервал. Левая граница должна быть меньше правой");
            return;//немедленное завершение программы
        }
        if (redA/2 + redB/2 < greenA/2 + greenB/2) {
            System.out.printf("Красный слева, зеленый справа");
        }
        if ((redA/2 + redB/2) == (greenA/2 + greenB/2)) {
            System.out.printf("Середины интервалов совпадают");
        }
        if (redA + redB > greenA + greenB) {
            System.out.printf("Зеленый слева, красный справа");
        }}}
