package лаб6;

public class task1 {
    public static void main(String[] args) {
    //
    int i; //обьявляем переменную - счетчик
    i = 1; //записываем в нее значение из первого фрагмента
    int n; //обьявляем переменную ограничение
    n = 7;
    System.out.println("Предисловие");//Один раз перед циклом
    while (i <= n) {// счетчик сравниваем с ограничением. Повторяем пока истинно.
        System.out.println("Глава " + i);
        i = i + 1; // изменияем по закономерности
    }
    System.out.println("Послесловие"); //Один раз после цикла
}}