package main.java.ru.mai.is.tmp.students.example.data;

import java.applet.Applet;
import java.awt.*;

/**
 * @author dbardin
 */
public class HilbertCurve  extends Applet {

    private GraphicsWrapper sg=null;
    private int dist0;
    private int dist;

    public void init() {
        dist0 = 712;
        dist=dist0;
        resize ( dist0, dist0 );
        sg = new GraphicsWrapper(getGraphics());
    }

    public void paint(Graphics g) {
        int level=5;
        dist=dist0;
        for (int i=level;i>0;i--) dist /= 2;
        sg.goToXY ( dist/2, dist/2 );
        HilbertUp(level); // start recursion
    }

    private void HilbertUp (int level) {
        if (level > 0) {
            HilbertRight(level-1);
            sg.lineUp(0,dist);
            HilbertUp(level-1);
            sg.lineRight(dist,0);
            HilbertUp(level-1);
            sg.lineDown(0,-dist);
            HilbertDown(level-1);
        }
    }

    private void HilbertRight (int level) {
        if (level > 0) {
            HilbertUp(level-1);
            sg.lineUp(dist,0);
            HilbertRight(level-1);
            sg.lineUp(0,dist);
            HilbertRight(level-1);
            sg.lineUp(-dist,0);
            HilbertLeft(level-1);
        }
    }

    private void HilbertDown (int level) {
        if (level > 0) {
            HilbertLeft(level-1);
            sg.lineUp(-dist,0);
            HilbertDown(level-1);
            sg.lineUp(0,-dist);
            HilbertDown(level-1);
            sg.lineUp(dist,0);
            HilbertUp(level-1);
        }
    }

    private void HilbertLeft (int level) {
        if (level > 0) {
            HilbertDown(level-1);
            sg.lineUp(0,-dist);
            HilbertLeft(level-1);
            sg.lineUp(-dist,0);
            HilbertLeft(level-1);
            sg.lineUp(0,dist);
            HilbertRight(level-1);
        }
    }

    class GraphicsWrapper {

        private Graphics g = null;
        private int x = 0;
        private int y = 0;

        public GraphicsWrapper(Graphics g) {
            this.g = g;
        }
        public void goToXY(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void lineUp(int deltaX, int deltaY) {
            drawLine(deltaX,deltaY);
        }

        public void lineDown(int deltaX, int deltaY) {
            drawLine(deltaX,deltaY);
        }

        public void lineLeft(int deltaX, int deltaY) {
            drawLine(deltaX,deltaY);
        }

        public void lineRight(int deltaX, int deltaY) {
            drawLine(deltaX,deltaY);
        }

        public void drawLine(int deltaX, int deltaY){
            g.drawLine ( x, y, x+deltaX, y+deltaY );
            x += deltaX;
            y += deltaY;
        }
    }
}
