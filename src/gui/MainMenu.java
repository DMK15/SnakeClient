package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class MainMenu extends JPanel{

    private JTextField txtTheSnakeGame;
    private JButton btnStartNewGame;
    private JButton btnGames;
    private JButton btnLogOut;

    /**
     * Initialize the contents of the frame.
     */
    public MainMenu() {
        setLayout(null);
        setSize(600, 500);
        setBackground(new Color(152, 251, 152));

        txtTheSnakeGame = new JTextField();
        txtTheSnakeGame.setFont(new Font("Myanmar MN", Font.BOLD, 17));
        txtTheSnakeGame.setHorizontalAlignment(SwingConstants.CENTER);
        txtTheSnakeGame.setText("THE SNAKE GAME");
        txtTheSnakeGame.setBounds(171, 18, 319, 54);
        add(txtTheSnakeGame);
        txtTheSnakeGame.setColumns(10);

        btnStartNewGame = new JButton("START NEW GAME");
        btnStartNewGame.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        btnStartNewGame.setBounds(25, 99, 117, 29);
        add(btnStartNewGame);

        btnGames = new JButton("GAMES");
        btnGames.setBounds(25, 145, 117, 29);
        add(btnGames);

        btnLogOut = new JButton("LOG OUT");
        btnLogOut.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        btnLogOut.setBounds(25, 186, 117, 29);
        add(btnLogOut);
    }

    public void addActionListener(ActionListener ac){
        btnStartNewGame.addActionListener(ac);
        btnGames.addActionListener(ac);
        btnLogOut.addActionListener(ac);
    }
}

