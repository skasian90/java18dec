package лаб7;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String data = s.nextLine();


        if (data.isEmpty()) {
            System.out.println("Исходная строка пуста");
            return;
        }





        String[] arr = data.split(";");

        System.out.print(" Индекс: " + (arr.length-1)/2);
        int a = (arr.length-1)/2;
        System.out.println(", элемент: " + arr[a]);







    }
}
