package TP3.TP3HamzaELACHHAB.model;


import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "city",
        "update",
        "forecast"
})
@Generated("jsonschema2pojo")
public class MeteoResponse {

    @JsonProperty("city")
    private City city;
    @JsonProperty("update")
    private String update;
    @JsonProperty("forecast")
    private List<Forecast> forecast = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("city")
    public City getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(City city) {
        this.city = city;
    }

    @JsonProperty("update")
    public String getUpdate() {
        return update;
    }

    @JsonProperty("update")
    public void setUpdate(String update) {
        this.update = update;
    }

    @JsonProperty("forecast")
    public List<Forecast> getForecast() {
        return forecast;
    }

    @JsonProperty("forecast")
    public void setForecast(List<Forecast> forecast) {
        this.forecast = forecast;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}