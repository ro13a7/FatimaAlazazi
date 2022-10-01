import javax.swing.*;
import java.awt.*;

public class Sub7 {
    public static class MEADOW extends JComponent {
        public void paintComponent(Graphics g)
        {
            Rectangle x= new Rectangle(200,200,100,100);
            Graphics2D g2= (Graphics2D) g;
            g2.setColor(Color.pink);
            g2.fill(x);
            Rectangle y= new Rectangle(200,400,100,100);
            g2.setColor(Color.pink.darker());
            g2.fill(y);
}}}
