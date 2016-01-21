package gui;

import java.awt.Color;

import javax.swing.JFrame;

public class Frame extends JFrame {

    ContentPanel contentPanel;

    public Frame(){

        contentPanel = new ContentPanel();
        add(contentPanel);

        setBackground(new Color(152, 251, 152));
        setVisible(true);
        setTitle("Davids snake spil");

        setBounds(200, 200, 600, 500);
    }

    public ContentPanel getContentPanel() {
        return contentPanel;
    }



}
