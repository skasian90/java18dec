package графика;

/**
 * Created by adm on 16.04.2019.
 */
public class зигЗаг5 {
    public static void main(String[] args) {
        Pen pen = Pen.prepare();

        pen.right();
        pen.right();
        pen.down();
        pen.down();

        pen.start();

        int k = 0;
        int t = 6;
        while (k < t) {
            k = k + 1;
            pen.down();
        }
        int i = 0;
        int n = 4;
        while (i < n) {

            pen.right();

            k = 0;
            t = 6;
            while (k < t) {
                k = k + 1;
                pen.up();
            }
            pen.right();

            k = 0;
            t = 6;
            while (k < t) {
                k = k + 1;
                pen.down();
            }
            i = i + 1;
        }
        }
    }

