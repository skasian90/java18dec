package лаб2;

import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        double aDeg, bDeg;
        aDeg= s.nextDouble();
        bDeg= s.nextDouble();
        double aRad;
        aRad = aDeg*Math.PI/180;
        double bRad;
        bRad = bDeg*Math.PI/180;
        double result;
        result = 3*Math.sin(2*aRad)*Math.cos(3*bRad);
        System.out.printf("%.4f", result);
    }}