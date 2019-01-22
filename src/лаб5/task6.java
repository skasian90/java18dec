package лаб5;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        //обьявление данных
        double shipKmH;
        double cometMS;
        //получение данных
        Scanner s = new Scanner(System.in);
        shipKmH = s.nextDouble();
        cometMS = s.nextDouble();
        //логика программы
        if (shipKmH > (cometMS * 3.6)) {
            System.out.println("Корабль догонит комету. Скорость кометы " + cometMS + " меньше скорости корабля " + shipKmH + "");
        }
        if (shipKmH < (cometMS * 3.6)) {
            System.out.println("Комета улетит от корабля. Скорость корабля " + shipKmH + " меньше скорости кометы " + cometMS + "");
        }
        if (shipKmH < 0) {
            System.out.println("Скорость корабля должна быть неотрицательна");
            return; }
        if (cometMS < 0) {
            System.out.println("Скорость кометы должна быть неотрицательна");
            return; }

    }}
