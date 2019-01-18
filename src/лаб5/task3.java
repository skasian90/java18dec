package лаб5;

import java.util.Scanner;

public class task3 {
    public static void main  (String[] args) {
        //обьявление данных
        int k;
        double result;
        //получение данных
        Scanner s=new Scanner(System.in);
        k= s.nextInt();
        //логика программы
        if (k>0) {
           result = Math.sqrt(k);
        } else {
            result = k * k;}
            System.out.println(result);
        }}
