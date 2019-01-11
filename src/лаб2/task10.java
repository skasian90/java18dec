package лаб2;

import java.util.Scanner;

public class task10 {
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
        result = Math.sin(aRad)*Math.cos(bRad)+Math.cos(aRad)*Math.sin(bRad);
        System.out.printf("%.4f", result);
    }}

