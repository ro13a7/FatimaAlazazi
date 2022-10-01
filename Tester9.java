import javax.swing.*;
import java.awt.Graphics;
import java.awt.Color;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Tester9 {
    public static void main(String args[]) {
        Ex9.CheckerBoard check = new Ex9.CheckerBoard();
        check.setTitle("CheckerBoard");
        check.setSize(180, 200);
        check.setDefaultCloseOperation(EXIT_ON_CLOSE);
        check.setVisible(true);
    }
}

