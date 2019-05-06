package лаб7;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String data = s.nextLine();
        int a = s.nextInt();

        if (data.isEmpty()) {
            System.out.println("Строка пуста");
            return;
        }

        if (a < 0) {
            System.out.print("Число A должно быть в интервале [0, размер массива)");
            return;
        }



        //разбираем строку на части, различая элементы по пробелу
        //было :  "q w e r t y"
        //станет : "q" "w" "e" "r" "t" "y"
        String[] arr = data.split(" ");
        if (a > arr.length) {
            System.out.print("Число A должно быть в интервале [0, размер массива)");
            return;
        }
        System.out.println(arr[0]);
        System.out.println(arr[a]);
        System.out.println(arr.length);




    }
}
