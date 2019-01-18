package лаб5;

import java.util.Scanner;

public class task1 {
    public static void main  (String[] args) {
        //обьявление данных
        int a;
        int b;
        //получение данных
        Scanner s=new Scanner(System.in);
        a= s.nextInt();
        b= s.nextInt();
        //логика программы
        if (a<b) {
            //например в случае когда a=5, b=6
            System.out.println("второе");
        } else {
            //например когда a=11, b=7
            System.out.println("Первое");
        }}}
