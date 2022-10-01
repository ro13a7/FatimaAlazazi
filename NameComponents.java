import javax.swing.*;
import java.awt.*;

    public class NameComponents extends JComponent {
        public void paintComponent(Graphics g)
        {
            String name ="Rofaida";
            Graphics2D g2=(Graphics2D) g;
            Rectangle rect=new Rectangle(380,300,100,100);
            g2.setColor(Color.blue);
            g2.fill(rect);
            g2.setColor(Color.red);
            g2.drawString(name,405,350);

        }
    }

