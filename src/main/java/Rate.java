import com.fasterxml.jackson.annotation.JsonProperty;

public class Rate {
    public String date;
    public Type type;
    public State state;
    public Business business;
    @JsonProperty("rate")
    public RateInstitution rateInstitution;
}
