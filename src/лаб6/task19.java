package лаб6;

import java.util.Scanner;

public class task19 {
    public static void main(String[] args) {


        int i;//  начало интервала
        int Y;// число вводимое пользователем
        int n;// ограничитель интервала
        Scanner s = new Scanner(System.in);
        Y = s.nextInt();
        i = 1;
        n = 15;


        if (Y < 0 || Y > 15){
            System.out.print("Значение Y должно быть в интервале [0, 15]");
            return;
        }

        while (i <= n) {
            if (i <= Y) {
                System.out.print("#");
        } else {
            System.out.print(".");
        }
        i = i + 1; //увеличение счетчика


            }}}