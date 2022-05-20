public class Weather {
    private double temp_c;
    private double temp_f;
    private String url;
    private String condition;

    public Weather(double temp_c, double temp_f, String url, String condition){
        this.condition = condition;
        this.url = url;
        this.temp_c = temp_c;
        this.temp_f = temp_f;
    }

    public double getTemp_c() {
        return temp_c;
    }

    public double getTemp_f() {
        return temp_f;
    }

    public String getCondition() {
        return condition;
    }

    public String getUrl() {
        return url;
    }
}
