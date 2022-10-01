import javax.swing.*;
import java.awt.*;
public class Ex10 {

    public static class FrameViewer {
        public static void main(String[] args) {
            JFrame frame = new JFrame();
            frame.setSize(200, 200);
            JLabel label = new JLabel("Hello, Rofaida!");
            label.setOpaque(true);
            label.setBackground(Color.green);
            frame.add(label);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            frame.add(new JLabel(new ImageIcon("C:\\Users\\PC\\IdeaProjects\\Tasks4\\b2.jpg")));
        }
    }}
