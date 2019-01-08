package лаб2;

import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        double xDeg, xRad;
        xDeg= s.nextDouble();
        double yRad;
        yRad = xDeg*Math.PI/180;
        double result;
        result = Math.cos(yRad)*5;
        System.out.printf("%.4f", result);
}}
