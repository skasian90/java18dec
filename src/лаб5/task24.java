package лаб5;

import java.util.Scanner;

public class task24 {
    public static void main(String[] args) {

        //получение данных
        Scanner s = new Scanner(System.in);
        String X;
        X = s.nextLine();
        //логика программы
        if (X.equals("a")) {
            System.out.println("a");
        }
        else if (X.equals("b")) {
            System.out.println("ab");
        }
        else if (X.equals("d")) {
            System.out.println("abcd");
        }
        else if (X.equals("h")) {
            System.out.println("abcdefgh");
        }
        else {
            System.out.println("abcdefgh");
        }}}
