package logik;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import gui.ContentPanel;
import gui.Frame;
import model.Game;
import model.Gamer;
import sdk.RequestBuilder;

/**
 *
 */
public class MainMenuController implements ActionListener {

    Controller controller;
    Frame frame;

    public MainMenuController(Controller controller){
        this.controller = controller;
        frame = controller.getFrame();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        switch (e.getActionCommand()) {
            case "START NEW GAME":
                frame.getContentPanel().show(ContentPanel.GAME);
                break;
            case "GAMES":
                frame.getContentPanel().show(ContentPanel.GAMES);
                break;
            case "LOG OUT":
                frame.getContentPanel().show(ContentPanel.LOGIN);
                break;
            case "Go Back":
                frame.getContentPanel().show(ContentPanel.MAINMENU);
                break;
            case "Create":
                createGame();
        }


    }

    private void createGame() {
        if(frame.getContentPanel().getGame().getTextFieldGameName().equals("")){
            JOptionPane.showMessageDialog(frame, "Enter game name");
        }

        else if(frame.getContentPanel().getGame().getTextFieldMapSize().equals("")){
            JOptionPane.showMessageDialog(frame, "Enter mspsize");//Mapsize
        }

        else if(frame.getContentPanel().getGame().getTextFieldControls().equals("")){
            JOptionPane.showMessageDialog(frame, "Enter controls");//controls
        }

        else{
            Gamer host = new Gamer();
            host.setId(controller.getCurrentUser().getId());
            host.setControls(frame.getContentPanel().getGame().getTextFieldControls());
            Game game = new Game();
            game.setHost(host);
            game.setName(frame.getContentPanel().getGame().getTextFieldGameName());
            game.setMapSize(Integer.valueOf(frame.getContentPanel().getGame().getTextFieldMapSize()));

            int result = RequestBuilder.newGame(game);
            if(result == 1){
                JOptionPane.showMessageDialog(frame, "Congrats");
            }
            else if(result == 3){
                JOptionPane.showMessageDialog(frame, "Try again");//no server
            }

        }

    }


}
