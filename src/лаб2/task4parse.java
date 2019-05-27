package лаб2;

import java.util.Scanner;

public class task4parse {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String x1; String x2; String x3;
        x1= s.nextLine();
        x2= s.nextLine();
        x3= s.nextLine();
        Double dx1;
        Double dx2;
        Double dx3;
        dx1 = Double.parseDouble(x1);
        dx2 = Double.parseDouble(x2);
        dx3 = Double.parseDouble(x3);
        double result;
        result = dx1*dx2+dx1*dx3+dx2*dx3;
        System.out.printf("%f", result);
    }
}
