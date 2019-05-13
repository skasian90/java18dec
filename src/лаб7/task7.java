package лаб7;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String data = s.nextLine();
        int P;
        int Q;
        int a;
        String t;

        P = s.nextInt();
        Q = s.nextInt();

        String[] arr = data.split(" ");


        t = arr[P];
        arr[P] = arr[Q];
        arr[P] = t;


        a = 0;

        while ( a <= arr.length) {

            System.out.print(arr[a]);
            a = a + 1;
        }
        System.out.print(arr[a]);
        }
    }
