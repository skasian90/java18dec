package лаб2;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        double xDeg, xRad;
        xDeg= s.nextDouble();
        xRad = xDeg*Math.PI/180;
        System.out.printf("%.4f\n", xRad);
        double result;
        result = Math.sin(xRad);
        System.out.printf("%.4f", result);
}}
