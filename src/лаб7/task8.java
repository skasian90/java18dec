package лаб7;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String data = s.nextLine();
        int a = 0;
        int b;
        String t;

        String[] arr = data.split(" ");

//        t = arr[5];
//        arr[5] = arr[4];
//        arr[4] = arr[3];
//        arr[3] = arr[2];
//        arr[2] = arr[1];
//        arr[1] = arr[0];
////        arr[0] = t;


        t = arr[arr.length - 1];

        b = (arr.length - 1);
        while (0 < b && b < arr.length) {

            arr[b] = (arr[b - 1]);
            b = b - 1;

        }
        arr[0] = t;

            while (a < arr.length) {
                System.out.print(arr[a] + " ");
                a = a + 1;

            }
        }
    }
