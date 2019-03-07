package лаб6;

import java.util.Scanner;

public class task19_1 {
    public static void main(String[] args) {


        int y;//
        Scanner s = new Scanner(System.in);
        y = s.nextInt();
        int i;
        i = 0; //счетчик по решеткам
        while (i < y) {
            System.out.print("#");
            i = i + 1;
        }
        int d; // ограничение по точкам
        d = 15 - y;
        int j = 0;// счетчик по точкам
        while (j < d) {
            System.out.print(".");
            j = j + 1;
        }}}
