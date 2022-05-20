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

    public Weather parseCurrent(String json){

        JSONObject jsonObj = new JSONObject(json);
        JSONObject currentObj = jsonObj.getJSONObject("current");
        double tempF = currentObj.getDouble("temp_f");
        double tempC = currentObj.getDouble("temp_c");
        JSONObject conditionObj = currentObj.getJSONObject("condition");
        String url = conditionObj.getString("icon");
        String conD = conditionObj.getString("text");
        url = "https:" + url;

        Weather weather = new Weather(tempC, tempF, url, conD);
        return weather;
    }
}

