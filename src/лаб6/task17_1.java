package лаб6;

import java.util.Scanner;

/**
 * Created by adm on 26.02.2019.
 */
public class task17_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //определить является ли A  делителем B (при делении нацело)
        int a = s.nextInt();
        int b = s.nextInt();
        int remainder;
        remainder = b % a; // остаток от деления B на A
        if (remainder == 0) {
            System.out.println("является");
        }
    }

}
