package лаб5;

import java.util.Scanner;

public class task2 {
    public static void main  (String[] args) {
        //обьявление данных
        int P;
        int Q;
        //получение данных
        Scanner s=new Scanner(System.in);
        P= s.nextInt();
        Q= s.nextInt();
        //логика программы
        if (P<Q) {
            //например в случае когда Q=179, b=173
            System.out.println("Максимальное " + Q +", минимальное "+ P +"");
        } else {
            //например когда a=11, b=7
            System.out.println("Максимальное " + P +", минимальное "+ Q +"");
        }}}


