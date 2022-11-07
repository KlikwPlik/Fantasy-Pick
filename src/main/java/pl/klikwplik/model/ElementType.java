
package pl.klikwplik.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "plural_name",
    "plural_name_short",
    "singular_name",
    "singular_name_short",
    "squad_select",
    "squad_min_play",
    "squad_max_play",
    "ui_shirt_specific",
    "sub_positions_locked",
    "element_count"
})
@Generated("jsonschema2pojo")
public class ElementType {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("plural_name")
    private String pluralName;
    @JsonProperty("plural_name_short")
    private String pluralNameShort;
    @JsonProperty("singular_name")
    private String singularName;
    @JsonProperty("singular_name_short")
    private String singularNameShort;
    @JsonProperty("squad_select")
    private Integer squadSelect;
    @JsonProperty("squad_min_play")
    private Integer squadMinPlay;
    @JsonProperty("squad_max_play")
    private Integer squadMaxPlay;
    @JsonProperty("ui_shirt_specific")
    private Boolean uiShirtSpecific;
    @JsonProperty("sub_positions_locked")
    private List<Integer> subPositionsLocked = new ArrayList<Integer>();
    @JsonProperty("element_count")
    private Integer elementCount;
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

    public ElementType withId(Integer id) {
        this.id = id;
        return this;
    }

    @JsonProperty("plural_name")
    public String getPluralName() {
        return pluralName;
    }

    @JsonProperty("plural_name")
    public void setPluralName(String pluralName) {
        this.pluralName = pluralName;
    }

    public ElementType withPluralName(String pluralName) {
        this.pluralName = pluralName;
        return this;
    }

    @JsonProperty("plural_name_short")
    public String getPluralNameShort() {
        return pluralNameShort;
    }

    @JsonProperty("plural_name_short")
    public void setPluralNameShort(String pluralNameShort) {
        this.pluralNameShort = pluralNameShort;
    }

    public ElementType withPluralNameShort(String pluralNameShort) {
        this.pluralNameShort = pluralNameShort;
        return this;
    }

    @JsonProperty("singular_name")
    public String getSingularName() {
        return singularName;
    }

    @JsonProperty("singular_name")
    public void setSingularName(String singularName) {
        this.singularName = singularName;
    }

    public ElementType withSingularName(String singularName) {
        this.singularName = singularName;
        return this;
    }

    @JsonProperty("singular_name_short")
    public String getSingularNameShort() {
        return singularNameShort;
    }

    @JsonProperty("singular_name_short")
    public void setSingularNameShort(String singularNameShort) {
        this.singularNameShort = singularNameShort;
    }

    public ElementType withSingularNameShort(String singularNameShort) {
        this.singularNameShort = singularNameShort;
        return this;
    }

    @JsonProperty("squad_select")
    public Integer getSquadSelect() {
        return squadSelect;
    }

    @JsonProperty("squad_select")
    public void setSquadSelect(Integer squadSelect) {
        this.squadSelect = squadSelect;
    }

    public ElementType withSquadSelect(Integer squadSelect) {
        this.squadSelect = squadSelect;
        return this;
    }

    @JsonProperty("squad_min_play")
    public Integer getSquadMinPlay() {
        return squadMinPlay;
    }

    @JsonProperty("squad_min_play")
    public void setSquadMinPlay(Integer squadMinPlay) {
        this.squadMinPlay = squadMinPlay;
    }

    public ElementType withSquadMinPlay(Integer squadMinPlay) {
        this.squadMinPlay = squadMinPlay;
        return this;
    }

    @JsonProperty("squad_max_play")
    public Integer getSquadMaxPlay() {
        return squadMaxPlay;
    }

    @JsonProperty("squad_max_play")
    public void setSquadMaxPlay(Integer squadMaxPlay) {
        this.squadMaxPlay = squadMaxPlay;
    }

    public ElementType withSquadMaxPlay(Integer squadMaxPlay) {
        this.squadMaxPlay = squadMaxPlay;
        return this;
    }

    @JsonProperty("ui_shirt_specific")
    public Boolean getUiShirtSpecific() {
        return uiShirtSpecific;
    }

    @JsonProperty("ui_shirt_specific")
    public void setUiShirtSpecific(Boolean uiShirtSpecific) {
        this.uiShirtSpecific = uiShirtSpecific;
    }

    public ElementType withUiShirtSpecific(Boolean uiShirtSpecific) {
        this.uiShirtSpecific = uiShirtSpecific;
        return this;
    }

    @JsonProperty("sub_positions_locked")
    public List<Integer> getSubPositionsLocked() {
        return subPositionsLocked;
    }

    @JsonProperty("sub_positions_locked")
    public void setSubPositionsLocked(List<Integer> subPositionsLocked) {
        this.subPositionsLocked = subPositionsLocked;
    }

    public ElementType withSubPositionsLocked(List<Integer> subPositionsLocked) {
        this.subPositionsLocked = subPositionsLocked;
        return this;
    }

    @JsonProperty("element_count")
    public Integer getElementCount() {
        return elementCount;
    }

    @JsonProperty("element_count")
    public void setElementCount(Integer elementCount) {
        this.elementCount = elementCount;
    }

    public ElementType withElementCount(Integer elementCount) {
        this.elementCount = elementCount;
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

    public ElementType withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ElementType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("pluralName");
        sb.append('=');
        sb.append(((this.pluralName == null)?"<null>":this.pluralName));
        sb.append(',');
        sb.append("pluralNameShort");
        sb.append('=');
        sb.append(((this.pluralNameShort == null)?"<null>":this.pluralNameShort));
        sb.append(',');
        sb.append("singularName");
        sb.append('=');
        sb.append(((this.singularName == null)?"<null>":this.singularName));
        sb.append(',');
        sb.append("singularNameShort");
        sb.append('=');
        sb.append(((this.singularNameShort == null)?"<null>":this.singularNameShort));
        sb.append(',');
        sb.append("squadSelect");
        sb.append('=');
        sb.append(((this.squadSelect == null)?"<null>":this.squadSelect));
        sb.append(',');
        sb.append("squadMinPlay");
        sb.append('=');
        sb.append(((this.squadMinPlay == null)?"<null>":this.squadMinPlay));
        sb.append(',');
        sb.append("squadMaxPlay");
        sb.append('=');
        sb.append(((this.squadMaxPlay == null)?"<null>":this.squadMaxPlay));
        sb.append(',');
        sb.append("uiShirtSpecific");
        sb.append('=');
        sb.append(((this.uiShirtSpecific == null)?"<null>":this.uiShirtSpecific));
        sb.append(',');
        sb.append("subPositionsLocked");
        sb.append('=');
        sb.append(((this.subPositionsLocked == null)?"<null>":this.subPositionsLocked));
        sb.append(',');
        sb.append("elementCount");
        sb.append('=');
        sb.append(((this.elementCount == null)?"<null>":this.elementCount));
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
        result = ((result* 31)+((this.pluralName == null)? 0 :this.pluralName.hashCode()));
        result = ((result* 31)+((this.squadSelect == null)? 0 :this.squadSelect.hashCode()));
        result = ((result* 31)+((this.squadMaxPlay == null)? 0 :this.squadMaxPlay.hashCode()));
        result = ((result* 31)+((this.singularName == null)? 0 :this.singularName.hashCode()));
        result = ((result* 31)+((this.pluralNameShort == null)? 0 :this.pluralNameShort.hashCode()));
        result = ((result* 31)+((this.uiShirtSpecific == null)? 0 :this.uiShirtSpecific.hashCode()));
        result = ((result* 31)+((this.squadMinPlay == null)? 0 :this.squadMinPlay.hashCode()));
        result = ((result* 31)+((this.elementCount == null)? 0 :this.elementCount.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.singularNameShort == null)? 0 :this.singularNameShort.hashCode()));
        result = ((result* 31)+((this.subPositionsLocked == null)? 0 :this.subPositionsLocked.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ElementType) == false) {
            return false;
        }
        ElementType rhs = ((ElementType) other);
        return (((((((((((((this.pluralName == rhs.pluralName)||((this.pluralName!= null)&&this.pluralName.equals(rhs.pluralName)))&&((this.squadSelect == rhs.squadSelect)||((this.squadSelect!= null)&&this.squadSelect.equals(rhs.squadSelect))))&&((this.squadMaxPlay == rhs.squadMaxPlay)||((this.squadMaxPlay!= null)&&this.squadMaxPlay.equals(rhs.squadMaxPlay))))&&((this.singularName == rhs.singularName)||((this.singularName!= null)&&this.singularName.equals(rhs.singularName))))&&((this.pluralNameShort == rhs.pluralNameShort)||((this.pluralNameShort!= null)&&this.pluralNameShort.equals(rhs.pluralNameShort))))&&((this.uiShirtSpecific == rhs.uiShirtSpecific)||((this.uiShirtSpecific!= null)&&this.uiShirtSpecific.equals(rhs.uiShirtSpecific))))&&((this.squadMinPlay == rhs.squadMinPlay)||((this.squadMinPlay!= null)&&this.squadMinPlay.equals(rhs.squadMinPlay))))&&((this.elementCount == rhs.elementCount)||((this.elementCount!= null)&&this.elementCount.equals(rhs.elementCount))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.singularNameShort == rhs.singularNameShort)||((this.singularNameShort!= null)&&this.singularNameShort.equals(rhs.singularNameShort))))&&((this.subPositionsLocked == rhs.subPositionsLocked)||((this.subPositionsLocked!= null)&&this.subPositionsLocked.equals(rhs.subPositionsLocked))));
    }

}
