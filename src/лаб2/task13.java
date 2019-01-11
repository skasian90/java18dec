package лаб2;

import java.util.Scanner;

public class task13 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        double Xa, Ya, distance, angleDeg;
        Xa= s.nextDouble();
        Ya= s.nextDouble();
        distance= s.nextDouble();
        angleDeg= s.nextDouble();
        if (distance <=0) {
            System.out.println("значение distance должно быть положительным");
            return;//немедленное завершение программы
        }
        if (angleDeg <=0) {
            System.out.println("значение angleDeg должно быть положительным");
            return;//немедленное завершение программы
        }
        double cos;
        double angleRad;
        angleRad = angleDeg*Math.PI/180;
        cos=Math.cos(angleRad);
        double Xb, Yb;
        Xb = Xa + distance * Math.cos(angleRad);
        Yb = Ya + distance * Math.sin(angleRad);
        System.out.printf("%.4f\n", Xb);
        System.out.printf("%.4f", Yb);
    }}

