package лаб7;

import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String data = s.nextLine();
        int M = s.nextInt();
        int t = 0;

        String[] arr = data.split(" ");

        int[]num = new int[arr.length]; // подготавливаем массив для сохранения значений от пользователя в виде чисел
// во вторых кв скобках пишем размер нового массива

        while (t < arr.length) {
            num[t] = Integer.parseInt(arr[t]);
            t = t + 1;
        }

        t = 0;


        while (t < arr.length) {
            System.out.print(num[t] * M);
            t = t + 1;
            System.out.print(" ");
        }
        }
    }
