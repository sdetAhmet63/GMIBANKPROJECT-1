package pojos;
import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true) // senin icinde bulunan objectin problem veriyorsa ignore (yoksay) et alma elinde olani oku deriz

public class States {
    /* pojo ureten site http://www.jsonschema2pojo.org/
    {
        "id": 19240,
        "name": "Koblenz", gerekli
        "tpcountry": null
    },
     */

    @JsonIgnore // bildigim kesin bir eksik olabilecek hata varsa gorme elinde olani oku deriz
    private Integer id;

    @JsonProperty("name")
    private String name;

    @JsonIgnore // bildigim kesin bir eksik olabilecek hata varsa gorme elinde olani oku deriz
    private Object tpcountry;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public States() {
    }

    public States(Integer id, String name, Object tpcountry) {
        this.id = id;
        this.name = name;
        this.tpcountry = tpcountry;
    }


    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("tpcountry")
    public Object getTpcountry() {
        return tpcountry;
    }

    @JsonProperty("tpcountry")
    public void setTpcountry(Object tpcountry) {
        this.tpcountry = tpcountry;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "States{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tpcountry=" + tpcountry +
                '}';
    }
}
