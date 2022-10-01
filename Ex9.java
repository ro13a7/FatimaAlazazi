import java.awt.*;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.Color;

public class Ex9 {
    public static class CheckerBoard extends JFrame
    {
    public void paint(Graphics g)
    {
        int row;
        int col;
        int x;
        int y;

        for ( row = 0;  row < 9;  row++ )
        {
            for ( col = 0;  col < 8;  col++)
            {
                x = col * 22;
                y = row * 22;
                if ( (row % 2) == (col % 2) )
                    g.setColor(Color.WHITE);
                else
                    g.setColor(Color.BLACK);

                g.fillRect(x, y, 22, 22);
            }
        }
    }}


    }

