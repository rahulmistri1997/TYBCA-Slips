//slip 9 Q2. Write a Multithreading program in java using Runnable interface to move text on the frame as follow:

import java.applet.Applet;
import java.awt.*;

public class slip9_2 extends Applet implements Runnable {
    Thread t;
    int x, y, k;
    int counter = 0;

    public void init() {
        x = 10;
        k = 0;
        y = 200;
        t = new Thread(this);
        t.start();
    }

    public void run() {
        try {
            while (true) {
                repaint();
                Thread.sleep(1000);
                ++counter;
            }
        } catch (final Exception e) {
        }
    }

    public void paint(final Graphics g) {
        g.setFont(new Font("ariel", Font.BOLD, 30));
        final FontMetrics fm = g.getFontMetrics();
        final String s = "Venta Black";
        final Dimension d = getSize();
        g.drawString(s, x, y);
        if (k == 0) {
            x = 360;
            y = 25;
            k = 1;
        } else if (k == 1) {
            x = 700;
            y = 200;
            k = 2;
        } else if (k == 2) {
            x = 360;
            y = 400;
            k = 3;
        } else if (k == 3) {
            x = 10;
            y = 200;
            k = 0;
        }
    }
}