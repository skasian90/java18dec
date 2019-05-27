package лаб7;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String data = s.nextLine();
        int a = 0;
        String t;

        String[] arr = data.split(" ");

        t = arr[5];
        arr[1] = arr[2];
        arr[2] = arr[3];
        arr[3] = arr[4];
        arr[4] = arr[5];
        arr[5] = t;


        while (a < arr.length) {
            System.out.print(arr[a] + " ");
            a = a + 1;

        }
        }
    }
