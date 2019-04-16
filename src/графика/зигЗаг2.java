package графика;

/**
 * Created by adm on 16.04.2019.
 */
public class зигЗаг2 {
    public static void main(String[] args) {
        Pen pen = Pen.prepare();

        pen.right();
        pen.right();
        pen.down();
        pen.down();

        pen.start();

        int i = 0;
        int n = 4;
        while (i < n) {

            pen.right();
            pen.down();
            pen.down();
            pen.right();
            pen.up();
            pen.right();
            pen.up();

            i = i + 1;

        }
        pen.right();


    }}
