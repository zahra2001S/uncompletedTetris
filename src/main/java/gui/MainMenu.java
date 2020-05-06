package gui;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JFrame {
    private JButton newGame, continueGame, exit, scoreBord;
    private JPanel panel ;

    public MainMenu(){
        super("Tetris");
        setSize(new Dimension());
        setMinimumSize(new Dimension(600, 600));
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBackground(Color.gray);

        Font font = new Font("Helvetica", Font.BOLD, 20);

        ///////////////////initialize newGame
        newGame = new JButton("New Game");
        newGame.setFont(font);
        newGame.setBackground(Color.pink);
        newGame.setBounds(200,140,200,80);
        add(newGame);
        newGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Tetris tetris = Tetris.getInstance();
            }
        });

        ///////////////////initialize continue
        continueGame =  new JButton("Continue");
        continueGame.setFont(font);
        continueGame.setBackground(Color.pink);
        continueGame.setBounds(200, 220,200,80);
        add(continueGame);
        continueGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        ///////////////////initialize exit
        exit = new JButton("Exit");
        exit.setFont(font);
        exit.setBackground(Color.pink);
        exit.setBounds(200, 300,200,80);
        add(exit);
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        ///////////////////initialize exit
        scoreBord = new JButton("ScoreBoard");
        scoreBord.setFont(font);
        scoreBord.setBackground(Color.pink);
        scoreBord.setBounds(200, 380,200,80);
        add(scoreBord);


        panel = new JPanel();
        panel.setSize(300,350);
        panel.setFont(font);
        Border innerBorder = BorderFactory.createTitledBorder("Menu");
        Border outerBorder = BorderFactory.createEmptyBorder(75, 125, 75, 125);
        panel.setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));
        add(panel);
        setVisible(true);
    }



}
