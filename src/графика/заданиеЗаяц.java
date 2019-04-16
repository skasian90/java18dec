package графика;

/**
 * Created by adm on 16.04.2019.
 */
public class заданиеЗаяц {
    public static void main(String[] args) {
        Pen pen = Pen.prepare();

        pen.right();
        pen.down();
        pen.start();
        pen.right();
        pen.down();
        pen.down();
        pen.down();
        pen.right();

        pen.right();
        pen.down();
        pen.down();
        pen.left();
        pen.down();

        pen.down();
        pen.right();
        pen.right();
        pen.right();
        pen.down();

        pen.down();
        pen.down();
        pen.left();
        pen.up();
        pen.left();

        pen.down();
        pen.down();
        pen.right();
        pen.down();
        pen.down();

        pen.right();
        pen.right();
        pen.down();
        pen.left();
        pen.left();

        pen.left();
        pen.left();
        pen.left();
        pen.left();
        pen.up();
        pen.left();
        pen.up();
        pen.right();

        int i = 0;
        int n = 12;
        while (i < n) {
            pen.up();
            i = i + 1;
        }


    }
}
