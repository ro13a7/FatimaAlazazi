import javax.swing.*;

public class Ex7 {
    public static void main(String[] args) {


        JFrame frame= new JFrame("My Frame");
        frame.setSize(500,500);
        frame.setVisible(true);
        Sub7.MEADOW d=new Sub7.MEADOW();
        frame.add(d);
        //Sub7.MEADOW d1=new Sub7.MEADOW();
        //frame.add(d1);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }}


