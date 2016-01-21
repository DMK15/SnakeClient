package gui;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Highscore extends JPanel {

    private JFrame frame;
    private JTextField txtHighscore;

    /**
     * Initialize the contents of the frame.
     */
    private void Highscore() {
        setBackground(new Color(152, 251, 152));
        setLayout(null);

        txtHighscore = new JTextField();
        txtHighscore.setBackground(new Color(152, 251, 152));
        txtHighscore.setHorizontalAlignment(SwingConstants.CENTER);
        txtHighscore.setFont(new Font("Lucida Grande", Font.BOLD, 16));
        txtHighscore.setText("HIGHSCORE");
        txtHighscore.setBounds(154, 44, 130, 26);
        add(txtHighscore);
        txtHighscore.setColumns(10);
    }
}
