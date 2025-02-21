package content.POO.drawinggg.app;

import java.awt.Graphics;

import javax.swing.*;

public class DrawFun {

    public static void main ( String[] args ) {

        drawingPanel panel = new drawingPanel();

        JFrame app = new JFrame();

        app.add( panel );

        app.setSize( 500, 500 );

        app.setVisible( true );

    }

    private static class drawingPanel extends JPanel {

        public void paintComponent ( Graphics graphics ) {

            super.paintComponent( graphics );

            int width = getWidth();

            int height = getHeight();

            int x = 200;

            int y = 100;

            graphics.drawLine(x, y, width, height);

        }

    }

}
