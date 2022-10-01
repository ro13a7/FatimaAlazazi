import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
    public class Traffic extends JComponent{
            public void paintComponent (Graphics g){
                Graphics2D g2 =(Graphics2D) g;
                Rectangle rec=new Rectangle(150,150,50,150);
                g2.fill(rec);
                g2.draw(rec);
                Ellipse2D.Double n3=new Ellipse2D.Double(155,155,40,40);
                g2.setColor(Color.green);
                g2.fill(n3);
                g2.draw(n3);
                Ellipse2D.Double n2=new Ellipse2D.Double(155,205,40,40);
                g2.setColor(Color.yellow);
                g2.fill(n2);
                g2.draw(n2);
                Ellipse2D.Double n1=new Ellipse2D.Double(155,255,40,40);
                g2.setColor(Color.red);
                g2.fill(n1);
                g2.draw(n1);
            }
        }




