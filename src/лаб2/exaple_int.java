package лаб2;

import java.util.Scanner;

public class exaple_int {
    public static void main  (String[] args) {
        //объявляем переменную для целых чисел
        int a;
        //пример преведения из double a int
        //потому что a=(int) Math.sqrt(8) но без int выдает ошибку "Error:(11, 21) java: incompatible types: possible
        // lossy conversion from double to int"
        a= (int) Math.sqrt(8);
        double b;
        b=Math.sqrt(8);
        System.out.println(a);
        System.out.println(b);
        a=19%7;
        //нахождение остатка от деления одного остатка от другого 19%7=5
        b=1234%11;
        System.out.println(a);
        System.out.println(b);

        Scanner s=new Scanner(System.in);
                a= s.nextInt();
                //команда ввода одного целого числа
        System.out.println(a);
    }
}
