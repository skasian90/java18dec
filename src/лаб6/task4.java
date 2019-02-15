package лаб6;

        import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        //
        int i; //обьявляем переменную - счетчик
        int g;
        i = 1; //записываем в нее значение из первого фрагмента
        int n; //обьявляем переменную ограничение
        n = 20;
        g = 453;
        System.out.println("фунт    грамм");//Один раз перед циклом
        while (i <= n) {// счетчик сравниваем с ограничением. Повторяем пока истинно.
            System.out.print(i);
            System.out.print("        ");
            System.out.print(g);
            System.out.println();

            i = i + 1; // изменияем по закономерности
            g = g + 453;
        }}}