package лаб7;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String data = s.nextLine();

        String[] arr = data.split(",");


        System.out.println(arr[0]);

        if (arr.length > 2) {
            System.out.println(arr[2]);
        } else {
            System.out.println("Элемент на индексе 2 отсутствует");
        }


        if (arr.length > 3) {
            System.out.println(arr[3]);
        } else {
            System.out.println("Элемент на индексе 3 отсутствует");
        }

        if (arr.length > 5) {
            System.out.println(arr[5]);
        } else {
            System.out.println("Элемент на индексе 5 отсутствует");


    }}}