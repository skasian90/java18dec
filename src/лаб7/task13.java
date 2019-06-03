package лаб7;

import java.util.Scanner;

public class task13 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String left = s.nextLine();
        String right = s.nextLine();

        String[] leftarr = left.split(" ");
        String[] rightarr = right.split(" ");

        int[] num1 = new int[leftarr.length];
        int[] num2 = new int[rightarr.length];
        int t = 0;

        while (t < leftarr.length) {
            num1[t] = Integer.parseInt(leftarr[t]);
            t = t + 1;
        }
//        System.out.print(num1[0]);
//        System.out.print(num1[1]);
//        System.out.print(num1[2]);
//        System.out.print(num1[3]);
//        System.out.print(num1[4]);

        System.out.println();

        t = 0;

        while (t < rightarr.length) {
            num2[t] = Integer.parseInt(rightarr[t]);
            t = t + 1;
        }
//        System.out.print(num2[0]);
//        System.out.print(num2[1]);
//        System.out.print(num2[2]);
//        System.out.print(num2[3]);
//        System.out.print(num2[4]);


//        num1 = Integer.parseInt(leftarr[t]);
        t = 0;
        while (t < leftarr.length) {
            System.out.print(num1[t] * num2[t]);
            t = t + 1;
            System.out.print(" ");
        }

    }
}
