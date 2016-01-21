package logik;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import gui.ContentPanel;
import gui.Frame;
import model.User;
import sdk.RequestBuilder;

import javax.swing.*;

public class Controller {

    Frame frame;
    MainMenuController mainMenuController;
    User currentUser;

    public Controller(){

        frame = new Frame();


        mainMenuController = new MainMenuController(this);
        frame.getContentPanel().getStartMenu().addActionListener(new StartMenuListener());
        frame.getContentPanel().getLogin().addActionListener(new LoginListener());
        frame.getContentPanel().getGame().addActionListener(mainMenuController);
        frame.getContentPanel().getMainMenu().addActionListener(mainMenuController);

    }

    private class StartMenuListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getActionCommand().equals("LOGIN")){
                frame.getContentPanel().show(ContentPanel.LOGIN);
            }
            else if(e.getActionCommand().equals("HIGHSCORE")){
                frame.getContentPanel().show(ContentPanel.HIGHSCORE);
            }

        }

    }

    private class LoginListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            if(e.getActionCommand().equals("OK")){
				User user = new User();
				user.setUsername(frame.getContentPanel().getLogin().getUsernameField());
				user.setPassword(frame.getContentPanel().getLogin().getPasswordField());
				int result = RequestBuilder.authorizeUser(user);
				if(result == 1){
                frame.getContentPanel().show(ContentPanel.MAINMENU);
                currentUser = user;

				}
				else if(result == 2){
					JOptionPane.showMessageDialog(frame, "Username or password is wrong");
				}
				else if (result == 3){
					JOptionPane.showMessageDialog(frame, "No connection to server");
				}
            }

        }

    }

    public User getCurrentUser(){
        return currentUser;
    }

    public Frame getFrame(){
        return frame;
    }

}
