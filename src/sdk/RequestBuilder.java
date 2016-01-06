package sdk;

import com.google.gson.Gson;
import com.sun.jersey.api.client.ClientResponse;
import model.Game;
import model.User;

/**
 * Created by davidmyrup on 06/01/2016.
 */
public class RequestBuilder {

    /**
     *
     * @return 1 - authorize/ok, 2 - authorize/not approved, 3 - no response
     */
    public static int authorizeUser(User user){
        String credentials = new Gson().toJson(user);
        ClientResponse response = Connection.post("login", credentials);

        if(response == null){
            return 3;
        }
        else if(response.getStatus() == 200)
            return 1;
        else
            return 2;
    }

    public static String getUsers(){
        String responseString = null;
        ClientResponse response = Connection.get("users");

        if(response == null){
            responseString = null;
        }
        else if(response != null){
            responseString = response.getEntity(String.class);
        }

        return responseString;
    }


    public static int newGame(Game game){
        String json = new Gson().toJson(game);
        ClientResponse response = Connection.post("games", json);

        if(response == null){
            return 3;
        }
        else if(response.getStatus() == 201)
            return 1;
        else
            return 2;
    }


    public static int startGame(Game game){
        String json = new Gson().toJson(game);
        ClientResponse response = Connection.put("games/start", json);

        if(response == null){
            return 3;
        }
        else if(response.getStatus() == 201)
            return 1;
        else
            return 2;
    }

    public static boolean deleteData(int gameId){
        ClientResponse response = Connection.delete("games/" + gameId);
        return true;
    }

   public static String getGames() {
       String responseString = null;
       ClientResponse response = Connection.get("games/all");

       if(response == null){
           responseString = null;
       }
       else if(response != null){
           responseString = response.getEntity(String.class);
       }

       return responseString;
   }

    public static String getScores() {
        String responseString = null;
        ClientResponse response =Connection.get("scores");


            if(response == null){
                responseString = null;
            }
            else if(response != null){
                responseString = response.getEntity(String.class);
            }

            return responseString;
        }


}







