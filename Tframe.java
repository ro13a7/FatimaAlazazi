import javax.swing.*;
    public  class Tframe {
        public static void main(String[] args) {
            JFrame frame = new JFrame();
            frame.setSize(10000, 10000);
            frame.setVisible(true);
            Traffic trf =new Traffic();
            frame.add(trf);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        }}
