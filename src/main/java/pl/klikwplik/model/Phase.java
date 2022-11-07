
package pl.klikwplik.model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "start_event",
    "stop_event"
})
@Generated("jsonschema2pojo")
public class Phase {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("start_event")
    private Integer startEvent;
    @JsonProperty("stop_event")
    private Integer stopEvent;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    public Phase withId(Integer id) {
        this.id = id;
        return this;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Phase withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("start_event")
    public Integer getStartEvent() {
        return startEvent;
    }

    @JsonProperty("start_event")
    public void setStartEvent(Integer startEvent) {
        this.startEvent = startEvent;
    }

    public Phase withStartEvent(Integer startEvent) {
        this.startEvent = startEvent;
        return this;
    }

    @JsonProperty("stop_event")
    public Integer getStopEvent() {
        return stopEvent;
    }

    @JsonProperty("stop_event")
    public void setStopEvent(Integer stopEvent) {
        this.stopEvent = stopEvent;
    }

    public Phase withStopEvent(Integer stopEvent) {
        this.stopEvent = stopEvent;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Phase withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Phase.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("startEvent");
        sb.append('=');
        sb.append(((this.startEvent == null)?"<null>":this.startEvent));
        sb.append(',');
        sb.append("stopEvent");
        sb.append('=');
        sb.append(((this.stopEvent == null)?"<null>":this.stopEvent));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.stopEvent == null)? 0 :this.stopEvent.hashCode()));
        result = ((result* 31)+((this.startEvent == null)? 0 :this.startEvent.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Phase) == false) {
            return false;
        }
        Phase rhs = ((Phase) other);
        return ((((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.stopEvent == rhs.stopEvent)||((this.stopEvent!= null)&&this.stopEvent.equals(rhs.stopEvent))))&&((this.startEvent == rhs.startEvent)||((this.startEvent!= null)&&this.startEvent.equals(rhs.startEvent))));
    }

}
