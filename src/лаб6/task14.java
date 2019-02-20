package лаб6;

import java.util.Scanner;

public class task14 {
    public static void main(String[] args) {


        int i;//  счетчик символов
        int n;// ограничение вводимое пользователем
        int G;// счетчик количества выполненных шагов
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        i = 0;
        G = 0;


        if (n < 0){
            System.out.print("Значение N должно быть неотрицательным");
            return;
        }

        while (i < n) {
            i = i + 1;
            G = G + 1;
            System.out.print("!");
            if (G == 5){
                G = G - 5;
                System.out.print(" ");

            }

            }


        }
    }
