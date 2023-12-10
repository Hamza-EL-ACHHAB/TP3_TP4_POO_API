package TP3.TP3HamzaELACHHAB.model;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "insee",
        "cp",
        "latitude",
        "longitude",
        "day",
        "datetime",
        "wind10m",
        "gust10m",
        "dirwind10m",
        "rr10",
        "rr1",
        "probarain",
        "weather",
        "tmin",
        "tmax",
        "sun_hours",
        "etp",
        "probafrost",
        "probafog",
        "probawind70",
        "probawind100",
        "gustx"
})
@Generated("jsonschema2pojo")
public class Forecast {

    @JsonProperty("insee")
    private String insee;
    @JsonProperty("cp")
    private Integer cp;
    @JsonProperty("latitude")
    private Double latitude;
    @JsonProperty("longitude")
    private Double longitude;
    @JsonProperty("day")
    private Integer day;
    @JsonProperty("datetime")
    private String datetime;
    @JsonProperty("wind10m")
    private Integer wind10m;
    @JsonProperty("gust10m")
    private Integer gust10m;
    @JsonProperty("dirwind10m")
    private Integer dirwind10m;
    @JsonProperty("rr10")
    private Double rr10;
    @JsonProperty("rr1")
    private Double rr1;
    @JsonProperty("probarain")
    private Integer probarain;
    @JsonProperty("weather")
    private Integer weather;
    @JsonProperty("tmin")
    private Integer tmin;
    @JsonProperty("tmax")
    private Integer tmax;
    @JsonProperty("sun_hours")
    private Integer sunHours;
    @JsonProperty("etp")
    private Integer etp;
    @JsonProperty("probafrost")
    private Integer probafrost;
    @JsonProperty("probafog")
    private Integer probafog;
    @JsonProperty("probawind70")
    private Integer probawind70;
    @JsonProperty("probawind100")
    private Integer probawind100;
    @JsonProperty("gustx")
    private Integer gustx;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("insee")
    public String getInsee() {
        return insee;
    }

    @JsonProperty("insee")
    public void setInsee(String insee) {
        this.insee = insee;
    }

    @JsonProperty("cp")
    public Integer getCp() {
        return cp;
    }

    @JsonProperty("cp")
    public void setCp(Integer cp) {
        this.cp = cp;
    }

    @JsonProperty("latitude")
    public Double getLatitude() {
        return latitude;
    }

    @JsonProperty("latitude")
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    @JsonProperty("longitude")
    public Double getLongitude() {
        return longitude;
    }

    @JsonProperty("longitude")
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    @JsonProperty("day")
    public Integer getDay() {
        return day;
    }

    @JsonProperty("day")
    public void setDay(Integer day) {
        this.day = day;
    }

    @JsonProperty("datetime")
    public String getDatetime() {
        return datetime;
    }

    @JsonProperty("datetime")
    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    @JsonProperty("wind10m")
    public Integer getWind10m() {
        return wind10m;
    }

    @JsonProperty("wind10m")
    public void setWind10m(Integer wind10m) {
        this.wind10m = wind10m;
    }

    @JsonProperty("gust10m")
    public Integer getGust10m() {
        return gust10m;
    }

    @JsonProperty("gust10m")
    public void setGust10m(Integer gust10m) {
        this.gust10m = gust10m;
    }

    @JsonProperty("dirwind10m")
    public Integer getDirwind10m() {
        return dirwind10m;
    }

    @JsonProperty("dirwind10m")
    public void setDirwind10m(Integer dirwind10m) {
        this.dirwind10m = dirwind10m;
    }

    @JsonProperty("rr10")
    public Double getRr10() {
        return rr10;
    }

    @JsonProperty("rr10")
    public void setRr10(Double rr10) {
        this.rr10 = rr10;
    }

    @JsonProperty("rr1")
    public Double getRr1() {
        return rr1;
    }

    @JsonProperty("rr1")
    public void setRr1(Double rr1) {
        this.rr1 = rr1;
    }

    @JsonProperty("probarain")
    public Integer getProbarain() {
        return probarain;
    }

    @JsonProperty("probarain")
    public void setProbarain(Integer probarain) {
        this.probarain = probarain;
    }

    @JsonProperty("weather")
    public Integer getWeather() {
        return weather;
    }

    @JsonProperty("weather")
    public void setWeather(Integer weather) {
        this.weather = weather;
    }

    @JsonProperty("tmin")
    public Integer getTmin() {
        return tmin;
    }

    @JsonProperty("tmin")
    public void setTmin(Integer tmin) {
        this.tmin = tmin;
    }

    @JsonProperty("tmax")
    public Integer getTmax() {
        return tmax;
    }

    @JsonProperty("tmax")
    public void setTmax(Integer tmax) {
        this.tmax = tmax;
    }

    @JsonProperty("sun_hours")
    public Integer getSunHours() {
        return sunHours;
    }

    @JsonProperty("sun_hours")
    public void setSunHours(Integer sunHours) {
        this.sunHours = sunHours;
    }

    @JsonProperty("etp")
    public Integer getEtp() {
        return etp;
    }

    @JsonProperty("etp")
    public void setEtp(Integer etp) {
        this.etp = etp;
    }

    @JsonProperty("probafrost")
    public Integer getProbafrost() {
        return probafrost;
    }

    @JsonProperty("probafrost")
    public void setProbafrost(Integer probafrost) {
        this.probafrost = probafrost;
    }

    @JsonProperty("probafog")
    public Integer getProbafog() {
        return probafog;
    }

    @JsonProperty("probafog")
    public void setProbafog(Integer probafog) {
        this.probafog = probafog;
    }

    @JsonProperty("probawind70")
    public Integer getProbawind70() {
        return probawind70;
    }

    @JsonProperty("probawind70")
    public void setProbawind70(Integer probawind70) {
        this.probawind70 = probawind70;
    }

    @JsonProperty("probawind100")
    public Integer getProbawind100() {
        return probawind100;
    }

    @JsonProperty("probawind100")
    public void setProbawind100(Integer probawind100) {
        this.probawind100 = probawind100;
    }

    @JsonProperty("gustx")
    public Integer getGustx() {
        return gustx;
    }

    @JsonProperty("gustx")
    public void setGustx(Integer gustx) {
        this.gustx = gustx;
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