package logik;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import model.Game;
import model.Gamer;
import model.Score;
import model.User;
import sdk.RequestBuilder;

import java.util.ArrayList;

/**
 * Created by davidmyrup on 17/11/2015.
 */
public class Controller {
    public static void main(String[] args) {
        //SIMULATE A LOGIN
        User userLogin = new User();
        userLogin.setUsername("david");
        userLogin.setPassword("1234");
        int result = RequestBuilder.authorizeUser(userLogin);
        System.out.println(result);

/*
        //Print all USERS
        String json = RequestBuilder.getUsers();
        if(json == null){
            System.out.println("connection error");
        }
        else{
            ArrayList<User> users = new Gson().fromJson(json, new TypeToken<ArrayList<User>>(){}.getType());
            for (User user: users) {
                System.out.println(user.getUsername());
            }
        }
        */

        /*
        //CREATING A GAME TO START GAME
        Game game = new Game();
        Gamer host  = new Gamer();
        host.setId(1);//Id på bruger som er logget ind
        game.setHost(host);

        game.setName("TestGame");
        host.setControls("asdwaa");
        game.setMapSize(8);

        int testgame = RequestBuilder.newGame(game);
        System.out.println(testgame);
*/

        //STARTING A GAME
        Game startGame = new Game();
        startGame.setGameId(5);
        Gamer opponent = new Gamer();
        opponent.setId(3);
        opponent.setControls("dasdas");
        startGame.setOpponent(opponent);

        int resultgame = RequestBuilder.startGame(startGame);
        System.out.println(resultgame);

        RequestBuilder.deleteData(10);


        String json = RequestBuilder.getGames();
        if(json == null){
            System.out.println("connection error");
        }
        else{
            ArrayList<Game> games = new Gson().fromJson(json, new TypeToken<ArrayList<Game>>(){}.getType());
            for (Game game: games) {
                System.out.println(game.getStatus());
            }
        }

        String jsonScores = RequestBuilder.getScores();
        ArrayList<Score> scores = new Gson().fromJson(jsonScores, new TypeToken<ArrayList<Score>>(){}.getType());
        for (Score score: scores) {
            System.out.println(score.getId());
        }
    }




        }


