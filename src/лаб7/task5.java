package лаб7;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String data = s.nextLine();
        int a;

        String[] arr = data.split(",");


        a = (arr.length-1);



        while (0 <= a && a <= arr.length) {

            System.out.print(arr[a]);
            a = a - 1;

        }
    }}