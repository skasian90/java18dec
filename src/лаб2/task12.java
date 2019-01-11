package лаб2;

import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        double edge, area;
        edge= s.nextDouble();
        if (edge <= 0){
            System.out.println("значение edge должно быть положительным");
            return;//немедленное завершение программы
        }
        area=6*(edge*edge);
        System.out.printf("%.4f", area);
    }}

