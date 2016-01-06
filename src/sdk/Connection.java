package sdk;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientHandlerException;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

/**
 * Created by davidmyrup on 17/11/2015.
 */
public class Connection {

    public static Client client = Client.create();
    public static ClientResponse clientResponse;

    public static ClientResponse get(String path){
        try{
            WebResource webResource = client.resource("http://localhost:8888/api/" + path);
            clientResponse = webResource.accept("application/json").get(ClientResponse.class);
        } catch (ClientHandlerException e){
            e.printStackTrace();
        }
        return clientResponse;
    }

    public static ClientResponse post(String path, String json) {
        try {
            WebResource webResource = client.resource("http://localhost:8888/api/" + path);
            clientResponse = webResource.accept("application/json").post(ClientResponse.class, json);
        } catch (ClientHandlerException e ) {
            e.printStackTrace();
        }
        return clientResponse;
    }

    public static ClientResponse put(String path, String json) {
        try {
            WebResource webResource = client.resource("http://localhost:8888/api/"+ path);

            clientResponse = webResource.accept("application/json").put(ClientResponse.class, json);

        } catch (ClientHandlerException e) {
            e.printStackTrace();
        }
        return clientResponse;

    }

    public static ClientResponse delete(String path) {
        try {
            WebResource webResource = client.resource("http://localhost:8888/api/"+ path);

            clientResponse = webResource.accept("application/json").delete(ClientResponse.class);
        } catch (ClientHandlerException e) {
            e.printStackTrace();
        }
        return clientResponse;
    }
}
