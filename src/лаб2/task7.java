package лаб2;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        double aRad; double aDeg;
        aDeg= s.nextDouble();
        double result;
        aRad=aDeg*Math.PI/180;
        System.out.printf("%.4f", aRad);
}}
