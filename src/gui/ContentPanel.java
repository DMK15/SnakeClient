package gui;

import java.awt.CardLayout;

import javax.swing.JPanel;

public class ContentPanel extends JPanel {

    public static final String STARTMENU = "startMenu";
    public static final String LOGIN = "login";
    public static final String MAINMENU = "mainMenu";
    public static final String GAME = "game";
    public static final String GAMES = "games";
    public static final String HIGHSCORE = "highscore";

    ContentPanel content;
    CardLayout layout;

    StartMenu startMenu;
    Login login;
    MainMenu mainMenu;
    Game game;
    Games games;
    Highscore highscore;


    public ContentPanel(){
        this.setLayout(new CardLayout());
        content = this;

        startMenu = new StartMenu();
        add(startMenu, STARTMENU);

        login = new Login();
        add(login, LOGIN);

        mainMenu = new MainMenu();
        add(mainMenu, MAINMENU);

		game = new Game();
		add(game, GAME);

		games = new Games();
		add(games, GAMES);

		highscore = new Highscore();
		add(highscore, HIGHSCORE);

        show(STARTMENU);
    }

    public void show(String panel){
        layout = (CardLayout) this.getLayout();
        layout.show(content, panel);
    }

    public StartMenu getStartMenu(){
        return startMenu;
    }

    public Login getLogin(){
        return login;
    }

    public MainMenu getMainMenu(){
        return mainMenu;
    }

    public Game getGame(){
        return game;
    }

    public Games getGames(){
        return games;
    }

    public Highscore getHighscore(){
        return highscore;
    }
}
