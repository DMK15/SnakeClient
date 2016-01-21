package gui;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import java.awt.SystemColor;
import java.awt.event.ActionListener;

import javax.swing.JPasswordField;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;

public class Login extends JPanel {
    private JTextField txtUsername;
    private JTextField txtPassword;
    private JPasswordField passwordField;
    private JButton btnOk;
    private JTextField usernameField;

    /**
     * Create the panel.
     */
    public Login() {
        setLayout(null);
        setSize(600, 500);
        setBackground(new Color(152, 251, 152));

        txtUsername = new JTextField();
        txtUsername.setFont(new Font("Lucida Grande", Font.BOLD, 14));
        txtUsername.setBackground(new Color(152, 251, 152));
        txtUsername.setText("Username");
        txtUsername.setBounds(61, 72, 84, 42);
        add(txtUsername);
        txtUsername.setColumns(10);

        txtPassword = new JTextField();
        txtPassword.setFont(new Font("Lucida Grande", Font.BOLD, 14));
        txtPassword.setText("Password");
        txtPassword.setColumns(10);
        txtPassword.setBackground(new Color(152, 251, 152));
        txtPassword.setBounds(61, 149, 84, 42);
        add(txtPassword);

        passwordField = new JPasswordField();
        passwordField.setBounds(197, 147, 220, 46);
        add(passwordField);

        btnOk = new JButton("OK");
        btnOk.setBounds(40, 233, 117, 29);
        add(btnOk);

        usernameField = new JTextField();
        usernameField.setBounds(197, 72, 220, 42);
        add(usernameField);
        usernameField.setColumns(10);

    }

    public String getUsernameField() {
        return usernameField.getText();
    }

    public String getPasswordField() {
        return new String(passwordField.getPassword());
    }



    public void addActionListener(ActionListener ac) {
        btnOk.addActionListener(ac);
    }
}
