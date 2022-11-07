
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
    "chip_name",
    "num_played"
})
@Generated("jsonschema2pojo")
public class ChipPlay {

    @JsonProperty("chip_name")
    private String chipName;
    @JsonProperty("num_played")
    private Integer numPlayed;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("chip_name")
    public String getChipName() {
        return chipName;
    }

    @JsonProperty("chip_name")
    public void setChipName(String chipName) {
        this.chipName = chipName;
    }

    public ChipPlay withChipName(String chipName) {
        this.chipName = chipName;
        return this;
    }

    @JsonProperty("num_played")
    public Integer getNumPlayed() {
        return numPlayed;
    }

    @JsonProperty("num_played")
    public void setNumPlayed(Integer numPlayed) {
        this.numPlayed = numPlayed;
    }

    public ChipPlay withNumPlayed(Integer numPlayed) {
        this.numPlayed = numPlayed;
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

    public ChipPlay withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ChipPlay.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("chipName");
        sb.append('=');
        sb.append(((this.chipName == null)?"<null>":this.chipName));
        sb.append(',');
        sb.append("numPlayed");
        sb.append('=');
        sb.append(((this.numPlayed == null)?"<null>":this.numPlayed));
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
        result = ((result* 31)+((this.numPlayed == null)? 0 :this.numPlayed.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.chipName == null)? 0 :this.chipName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ChipPlay) == false) {
            return false;
        }
        ChipPlay rhs = ((ChipPlay) other);
        return ((((this.numPlayed == rhs.numPlayed)||((this.numPlayed!= null)&&this.numPlayed.equals(rhs.numPlayed)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.chipName == rhs.chipName)||((this.chipName!= null)&&this.chipName.equals(rhs.chipName))));
    }

}
