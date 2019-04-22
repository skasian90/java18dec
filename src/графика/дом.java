package графика;

public class дом {
    public static void main(String[] args) {
        Pen pen = Pen.prepare();

        int k = 0;
        int t = 5;
        while (k < t) {
            k = k + 1;
            pen.right();
        }

        k = 0;
        t = 15;
        while (k < t) {
            k = k + 1;
            pen.down();
        }

        pen.start();


        k = 0;
        t = 6;
        while (k < t) {
            k = k + 1;
            pen.right();
        }
        k = 0;
        t = 4;
        while (k < t) {
            k = k + 1;
            pen.up();
        }
        pen.right();
        k = 0;
        t = 5;
        while (k < t) {
            k = k + 1;
            pen.up();
            pen.left();
        }
        k = 0;
        t = 4;
        while (k < t) {
            k = k + 1;
            pen.down();
            pen.left();
        }
        pen.down();
        pen.right();
        pen.down();
        pen.down();
        pen.down();
        pen.down();
        pen.right();
        pen.up();
        pen.up();
        pen.up();
        pen.right();
        pen.right();
        pen.down();
        pen.down();
        pen.down();



    }
    }
