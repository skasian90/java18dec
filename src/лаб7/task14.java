package лаб7;

import java.util.Scanner;

public class task14 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String data = s.nextLine();
        String[] arr = data.split(" ");

        int[] num1 = new int[arr.length];

//        num1[0] = Integer.parseInt(arr[0]);
//        num1[1] = Integer.parseInt(arr[1]);
//        num1[2] = Integer.parseInt(arr[2]);
//        num1[3] = Integer.parseInt(arr[3]);
//        num1[4] = Integer.parseInt(arr[4]);

        int t = 0;
        int c = 0;
        while (t < arr.length) {
            num1[t] = Integer.parseInt(arr[t]);
            t = t + 1;
        }
        t = 0;

//        double d = (( num1[0] + num1[1] + num1[2] + num1[3] + num1[4]));
//        System.out.print(d/5);

//        System.out.print((num1[0] / 2));
//        System.out.print((num1[1] / 2));
//        System.out.print((num1[2] / 2));
//        System.out.print((num1[3] / 2));
//        System.out.print((num1[4] / 2));

        double d = 0;
//        d = (d + num1[0]);
//        d = (d + num1[1]);
//        d = (d + num1[2]);
//        d = (d + num1[3]);
//        d = (d + num1[4]);

        while ( c < arr.length) {
            d = (d + num1[c]);
            c = c + 1;
        }

        d = (d/arr.length);
        System.out.println(d);

        }}
