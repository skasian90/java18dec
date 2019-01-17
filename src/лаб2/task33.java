package лаб2;

import java.util.Scanner;

public class task33 {
    public static void main  (String[] args) {
        //обьявление данных
        double a;
        double b;
        double cInDeg;
        double cInRad;
        double result;
        //получение данных
        Scanner s=new Scanner(System.in);
        a= s.nextInt();
        b= s.nextInt();
        cInDeg= s.nextInt();
        //вычисления
        cInRad=cInDeg*Math.PI/180;
        result = Math.sqrt((a*a)+(b*b)-2*Math.cos(a*b)*(cInRad));
        //вывод результата
        System.out.printf("%.4f",result);
    }}
