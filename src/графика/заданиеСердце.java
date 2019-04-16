package графика;

/**
 * Created by adm on 16.04.2019.
 */
public class заданиеСердце {
    public static void main(String[] args) {
        Pen pen = Pen.prepare();

        pen.right();
        pen.right();
        pen.right();
        pen.right();
        pen.down();

        pen.start();

        pen.down();
        pen.right();
        pen.down();
        pen.right();
        pen.up();

        pen.right();
        pen.up();
        pen.right();
        pen.right();
        pen.down();

        pen.right();
        pen.down();
        pen.down();




        int i = 0;
        int n = 5;
        while (i < n) {
            pen.down();
            i = i + 1;
            pen.left();
        }

         i = 0;
         n = 4;
        while (i < n) {
            pen.up();
            i = i + 1;
            pen.left();
        }
        pen.up();
        pen.up();
        pen.up();
        pen.right();

        pen.up();
        pen.right();
        pen.right();

    }}
