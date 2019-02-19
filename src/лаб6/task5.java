package лаб6;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        //
        int v; // вводимая переменная
        int i; //счетчик шагов
        int n; // n - ограничение шагов
        int p; // результат
        Scanner s=new Scanner(System.in);
        v = s.nextInt();
        i = 0;
        n = 8;

        System.out.println("Таблица умножения на "+ v +""); //Один раз перед циклом
        while (i <= n) {// счетчик сравниваем с ограничением. Повторяем пока истинно.

            i = i + 1;
            p = i * v;

            System.out.printf(""+i+" * "+v+" = "+p+"");
            System.out.println();

        }}}