package лаб6;

import java.util.Scanner;

public class task111 {
    public static void main(String[] args) {


        int i;//  счетчик символов
        int A;// ограничение вводимое пользователем
        int B;// ограничение вводимое пользователем

        Scanner s = new Scanner(System.in);
        A = s.nextInt();
        B = s.nextInt();
        i = 0;

        while (i < A) {
            i = i + 1;
            System.out.print("+");
        }
        System.out.println();
        i = i - A;
        while (i < B){
            i = i + 1;
            System.out.print("#");
        }}}
