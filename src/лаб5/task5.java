package лаб5;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        //обьявление данных
        double roadKm;
        double lenghtFeet;
        //получение данных
        Scanner s = new Scanner(System.in);
        roadKm = s.nextDouble();
        lenghtFeet = s.nextInt();
        //логика программы
        if (roadKm < 0) {
            System.out.println("Расстояние между деревнями должно быть неотрицательно");
            return;
        }
        if (lenghtFeet < 0) {
            System.out.println("Длинна кабеля должна быть неотрицательна");
            return;
        }
        if (roadKm * 1000 < lenghtFeet * 0.305) {
            System.out.println("Кабеля хватит. Расстояние меньше длинны кабеля");
        } else {
            System.out.println("Кабеля не хватит. Длинна кабеля меньше расстояния");
        }
    }}

