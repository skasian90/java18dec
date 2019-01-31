package лаб5;

import java.util.Scanner;

public class task17 {
    public static void main(String[] args) {
        //обьявление данных
        double leftA, leftB, rightA, rightB;
        //получение данных
        Scanner s = new Scanner(System.in);
        leftA = s.nextDouble();
        leftB = s.nextDouble();
        rightA = s.nextDouble();
        rightB = s.nextDouble();

        //условие
        if (leftB < rightA) {
            if (leftB < rightB) {
            } else {
                System.out.println();
            }
        } else {
            System.out.println("Не пересекаются");

        }}}



