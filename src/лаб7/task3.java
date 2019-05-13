package лаб7;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String data = s.nextLine();


        if (data.isEmpty()) {
            System.out.println("Элемент на индексе 5 отсутствует");
            return;
        }
        String[] arr = data.split(",");

        System.out.println(arr[0]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[5]);
    }
}
