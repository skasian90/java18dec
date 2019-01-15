package лаб2;

import java.util.Scanner;

public class task22 {

        public static void main  (String[] args) {
            //обьявление данных
            int totalM;
            int partCm;
            int product;
            int meters;
            //получение данных
            Scanner s=new Scanner(System.in);
            totalM= s.nextInt();
            partCm= s.nextInt();
            //вычисления
            product = (totalM*100)/partCm;
            meters=(totalM*100)%partCm;
            //вывод результата
            System.out.println(product);
            System.out.println(meters);


}}
