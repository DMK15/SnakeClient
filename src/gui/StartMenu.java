package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class StartMenu extends JPanel {

    private JTextField txtSnake;
    private JTextField txtMenu;
    private JButton btnLogin;
    private JButton btnHighscore;

    public StartMenu(){
        setLayout(null);
        setSize(600, 500);
        setBackground(new Color(152, 251, 152));

        txtSnake = new JTextField();
        txtSnake.setBackground(new Color(152, 251, 152));
        txtSnake.setFont(new Font("Myanmar MN", Font.BOLD, 19));
        txtSnake.setHorizontalAlignment(SwingConstants.CENTER);
        txtSnake.setText("SNAKE");
        txtSnake.setBounds(67, 28, 278, 36);
        add(txtSnake);
        txtSnake.setColumns(10);

        txtMenu = new JTextField();
        txtMenu.setBackground(new Color(152, 251, 152));
        txtMenu.setHorizontalAlignment(SwingConstants.CENTER);
        txtMenu.setFont(new Font("Lucida Grande", Font.BOLD, 17));
        txtMenu.setText("MENU");
        txtMenu.setBounds(144, 118, 117, 26);
        add(txtMenu);
        txtMenu.setColumns(10);

        btnLogin = new JButton("LOGIN");
        btnLogin.setBackground(SystemColor.window);

        btnLogin.setBounds(144, 186, 117, 29);
        add(btnLogin);

        btnHighscore = new JButton("HIGHSCORE");
        btnHighscore.setBackground(SystemColor.window);
        btnHighscore.setBounds(144, 250, 117, 29);
        add(btnHighscore);

        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon("/Users/davidmyrup/Desktop/Snake-icon1.png"));
        lblNewLabel.setBounds(27, 291, 263, 181);
        add(lblNewLabel);
    }

    public void addActionListener(ActionListener ac){
        btnLogin.addActionListener(ac);
        btnHighscore.addActionListener(ac);
    }

}
