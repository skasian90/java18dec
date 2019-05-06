package лаб7;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String data = s.nextLine();
        int a = 0;


        if (data.isEmpty()) {
            System.out.println("Исходная строка пуста");
            return;
        }






        String[] arr = data.split(" ");

        while (a < arr.length) {
            System.out.println(arr[a] + " " + a);
            a = a + 1;

        }



    }
}
