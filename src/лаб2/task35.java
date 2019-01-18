package лаб2;

import java.util.Scanner;

public class task35 {
    public static void main  (String[] args) {
        //обьявление данных
        double xDeg;
        double xRad;
        double result;
        //получение данных
        Scanner s=new Scanner(System.in);
        xDeg= s.nextInt();
        //вычисления
        xRad=xDeg*Math.PI/180;
        result = Math.sqrt(1-Math.sin(xRad)*Math.sin(xRad));
        //вывод результата
        System.out.printf("%.4f",result);
    }
}
