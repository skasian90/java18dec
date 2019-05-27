package лаб7;

import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String data = s.nextLine();
        int M = s.nextInt();

        String[] arr = data.split(" ");


        int n = arr.length;
        int[]num = new int[n];
        num[0] = Integer.parseInt(arr[0]);
        num[1] = Integer.parseInt(arr[1]);

        System.out.println(num[0] * M);
        System.out.println(num[1] * M);

        }
    }
