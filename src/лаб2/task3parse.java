package лаб2;

import java.util.Scanner;

public class task3parse {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String x;
        Double dx;
        x = s.nextLine();
        dx = Double.parseDouble(x);

        double result;
        result = dx + 7;
        System.out.printf("%.4f", result);
    }}

