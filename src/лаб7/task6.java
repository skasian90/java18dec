package лаб7;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String data = s.nextLine();
        int B = s.nextInt();
        int E = s.nextInt();


        String[] arr = data.split(" ");

        if (B < 0) {
            System.out.print("Число B должно быть в интервале [0, размер массива))");
            return;
        }
        if (B >= arr.length) {
            System.out.print("Число B должно быть в интервале [0, размер массива))");
            return;
        }
        if (E >= arr.length) {
            System.out.print("Число E должно быть в интервале [0, размер массива)))");
            return;
        }
        if (E < 0) {
            System.out.print("Число E должно быть в интервале [0, размер массива))");
            return;
        }

        if (B < E) {
            while (B <= E) {
                System.out.print(arr[B]);
                B = B + 1;
            }
        } else {
            while (B >= E) {
                System.out.print(arr[E]);
                E = E + 1;

            }}}}
