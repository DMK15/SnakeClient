package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Game extends JPanel{
    private JTextField textFieldGameName;
    private JTextField textFieldControls;
    private JTextField textFieldMapSize;
    private JButton btnGoBack;
    private JButton btnCreate;

    /**
     * Initialize the contents of the frame.
     */
    public Game() {
        setLayout(null);
        setSize(346, 466);
        setBackground(new Color(152, 251, 152));

        JLabel lblCreateGame = new JLabel("Create game");
        lblCreateGame.setFont(new Font("Myanmar MN", Font.BOLD, 17));
        lblCreateGame.setBounds(131, 44, 120, 26);
        add(lblCreateGame);

        JLabel lblGamename = new JLabel("Game name:");
        lblGamename.setBounds(33, 226, 88, 16);
        add(lblGamename);

        textFieldGameName = new JTextField();
        textFieldGameName.setBounds(133, 226, 130, 26);
        add(textFieldGameName);
        textFieldGameName.setColumns(10);

        JLabel lblControls = new JLabel("Controls:");
        lblControls.setBounds(33, 131, 61, 16);
        add(lblControls);

        textFieldControls = new JTextField();
        textFieldControls.setBounds(133, 126, 130, 26);
        add(textFieldControls);
        textFieldControls.setColumns(10);

        JLabel lblMapSize = new JLabel("Map size");
        lblMapSize.setBounds(33, 185, 61, 16);
        add(lblMapSize);

        textFieldMapSize = new JTextField();
        textFieldMapSize.setBounds(133, 180, 130, 26);
        add(textFieldMapSize);
        textFieldMapSize.setColumns(10);

        btnGoBack = new JButton("Go Back");
        btnGoBack.setBounds(6, 403, 112, 35);
        add(btnGoBack);

        btnCreate = new JButton("Create");
        btnCreate.setBounds(133, 282, 129, 35);
        add(btnCreate);
    }

    public String getTextFieldGameName() {
        return textFieldGameName.getText();
    }

    public String getTextFieldControls() {
        return textFieldControls.getText();
    }

    public String getTextFieldMapSize() {
        return textFieldMapSize.getText();
    }

    public void addActionListener(ActionListener ac){
        btnGoBack.addActionListener(ac);
        btnCreate.addActionListener(ac);
    }
}
