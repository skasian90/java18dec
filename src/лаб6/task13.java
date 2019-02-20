package лаб6;

import java.util.Scanner;

public class task13 {
    public static void main(String[] args) {

        int k;// левый счетчик
        int i;// правый счетчик
        int n;// ограничение вводимое пользователем
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        i = 0;
        k = 0;

            if (n < 0){
            System.out.print("Значение N должно быть неотрицательным");
        return;
    }

        while (k <= n) {
            System.out.print(k);
            k = k + 1;
            System.out.print(" - ");
            System.out.println(i);
            i = i + 1;
            if (i == 4) {
                i = i - 4;
            }


        }
    }
}
