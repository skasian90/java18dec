package лаб7;

import java.util.Scanner;

/**
 * Created by adm on 01.07.2019.
 */
public class task10 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String data = s.nextLine();
        int a = 0;
        String t;

        String[] arr = data.split(" ");

        t = arr[0];
        arr[0] = arr[5];
        arr[1] = arr[4];
        arr[2] = arr[3];

        arr[5] = t;

        t = arr[2];
        arr[3] = t;



        t = arr[2];
        arr[3] = t;




        while ( a < arr.length) {

            System.out.print(arr[a] + " ");
            a = a + 1;
        }}}
