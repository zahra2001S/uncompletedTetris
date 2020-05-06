package gui;

import javax.swing.*;
import javax.swing.border.Border;

public class Tetris extends JFrame {
    private static Tetris tetris = new Tetris();
    private JPanel information;

    public static Tetris getInstance() {
        return tetris;
    }
    private Tetris(){
        super();
        setSize(600,600);
        information = new JPanel();
        information.setBounds(300,0,300,600);
        add(information);
        Border innerBorder = BorderFactory.createTitledBorder("Menu");
        Border outerBorder = BorderFactory.createEmptyBorder(0, 300, 0, 0);
        information.setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));
        setResizable(false);
        setVisible(true);
    }
}
