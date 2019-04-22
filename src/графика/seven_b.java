package графика;

public class seven_b {
    public static void main(String[] args) {
        Pen pen = Pen.prepare();

        pen.right();
        pen.right();
        pen.down();
        pen.down();

        pen.start();

        pen.right();

        int k = 0;
        int t = 6;
        while (k < t) {
            k = k + 1;
            pen.down();
            pen.down();
            pen.down();
            pen.down();
            pen.down();
            pen.up();
            pen.up();
            pen.up();
            pen.up();
            pen.up();
            pen.right();
        }}}
