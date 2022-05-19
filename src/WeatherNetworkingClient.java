import org.json.JSONArray;
import org.json.JSONObject;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class WeatherNetworkingClient {

    private String APIKey;
    private String baseUrl;

    public WeatherNetworkingClient(){
        APIKey = "de66cf8e594d433dbfc173342221605";
        baseUrl = "http://api.weatherapi.com/v1";
    }

    public String makeAPICallForCurrentForcast(String zipCode){

        String endPoint = "/current.json";
        String url = baseUrl + endPoint + "?key=" + APIKey + "&q=" + zipCode + "api=no";

        try {
            URI myURI = URI.create(url);
            HttpRequest request = HttpRequest.newBuilder().uri(myURI).build();
            HttpClient client = HttpClient.newHttpClient();
            HttpResponse<String> response = client.send(request,HttpResponse.BodyHandlers.ofString());
            return response.body();
        } catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    public void parseCurrent(String json){

        JSONObject jsonObj = new JSONObject(json);

    }
}

