package графика;

/**
 * Created by adm on 16.04.2019.
 */
public class зигЗаг {
    public static void main(String[] args) {
        Pen pen = Pen.prepare();

        pen.right();
        pen.right();
        pen.down();
        pen.down();

        pen.start();

        int i = 0;
        int n = 6;
        while (i < n) {
            pen.right();
            pen.up();
            pen.right();
            pen.down();
            i = i + 1;

        }
        pen.right();


}}
