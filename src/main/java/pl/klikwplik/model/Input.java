
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
    "events",
    "game_settings",
    "phases",
    "teams",
    "total_players",
    "elements",
    "element_stats",
    "element_types"
})
@Generated("jsonschema2pojo")
public class Input {

    @JsonProperty("events")
    private List<Event> events = new ArrayList<Event>();
    @JsonProperty("game_settings")
    private GameSettings gameSettings;
    @JsonProperty("phases")
    private List<Phase> phases = new ArrayList<Phase>();
    @JsonProperty("teams")
    private List<Team> teams = new ArrayList<Team>();
    @JsonProperty("total_players")
    private Integer totalPlayers;
    @JsonProperty("elements")
    private List<Element> elements = new ArrayList<Element>();
    @JsonProperty("element_stats")
    private List<ElementStat> elementStats = new ArrayList<ElementStat>();
    @JsonProperty("element_types")
    private List<ElementType> elementTypes = new ArrayList<ElementType>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("events")
    public List<Event> getEvents() {
        return events;
    }

    @JsonProperty("events")
    public void setEvents(List<Event> events) {
        this.events = events;
    }

    public Input withEvents(List<Event> events) {
        this.events = events;
        return this;
    }

    @JsonProperty("game_settings")
    public GameSettings getGameSettings() {
        return gameSettings;
    }

    @JsonProperty("game_settings")
    public void setGameSettings(GameSettings gameSettings) {
        this.gameSettings = gameSettings;
    }

    public Input withGameSettings(GameSettings gameSettings) {
        this.gameSettings = gameSettings;
        return this;
    }

    @JsonProperty("phases")
    public List<Phase> getPhases() {
        return phases;
    }

    @JsonProperty("phases")
    public void setPhases(List<Phase> phases) {
        this.phases = phases;
    }

    public Input withPhases(List<Phase> phases) {
        this.phases = phases;
        return this;
    }

    @JsonProperty("teams")
    public List<Team> getTeams() {
        return teams;
    }

    @JsonProperty("teams")
    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

    public Input withTeams(List<Team> teams) {
        this.teams = teams;
        return this;
    }

    @JsonProperty("total_players")
    public Integer getTotalPlayers() {
        return totalPlayers;
    }

    @JsonProperty("total_players")
    public void setTotalPlayers(Integer totalPlayers) {
        this.totalPlayers = totalPlayers;
    }

    public Input withTotalPlayers(Integer totalPlayers) {
        this.totalPlayers = totalPlayers;
        return this;
    }

    @JsonProperty("elements")
    public List<Element> getElements() {
        return elements;
    }

    @JsonProperty("elements")
    public void setElements(List<Element> elements) {
        this.elements = elements;
    }

    public Input withElements(List<Element> elements) {
        this.elements = elements;
        return this;
    }

    @JsonProperty("element_stats")
    public List<ElementStat> getElementStats() {
        return elementStats;
    }

    @JsonProperty("element_stats")
    public void setElementStats(List<ElementStat> elementStats) {
        this.elementStats = elementStats;
    }

    public Input withElementStats(List<ElementStat> elementStats) {
        this.elementStats = elementStats;
        return this;
    }

    @JsonProperty("element_types")
    public List<ElementType> getElementTypes() {
        return elementTypes;
    }

    @JsonProperty("element_types")
    public void setElementTypes(List<ElementType> elementTypes) {
        this.elementTypes = elementTypes;
    }

    public Input withElementTypes(List<ElementType> elementTypes) {
        this.elementTypes = elementTypes;
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

    public Input withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Input.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("events");
        sb.append('=');
        sb.append(((this.events == null)?"<null>":this.events));
        sb.append(',');
        sb.append("gameSettings");
        sb.append('=');
        sb.append(((this.gameSettings == null)?"<null>":this.gameSettings));
        sb.append(',');
        sb.append("phases");
        sb.append('=');
        sb.append(((this.phases == null)?"<null>":this.phases));
        sb.append(',');
        sb.append("teams");
        sb.append('=');
        sb.append(((this.teams == null)?"<null>":this.teams));
        sb.append(',');
        sb.append("totalPlayers");
        sb.append('=');
        sb.append(((this.totalPlayers == null)?"<null>":this.totalPlayers));
        sb.append(',');
        sb.append("elements");
        sb.append('=');
        sb.append(((this.elements == null)?"<null>":this.elements));
        sb.append(',');
        sb.append("elementStats");
        sb.append('=');
        sb.append(((this.elementStats == null)?"<null>":this.elementStats));
        sb.append(',');
        sb.append("elementTypes");
        sb.append('=');
        sb.append(((this.elementTypes == null)?"<null>":this.elementTypes));
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
        result = ((result* 31)+((this.elementTypes == null)? 0 :this.elementTypes.hashCode()));
        result = ((result* 31)+((this.teams == null)? 0 :this.teams.hashCode()));
        result = ((result* 31)+((this.totalPlayers == null)? 0 :this.totalPlayers.hashCode()));
        result = ((result* 31)+((this.gameSettings == null)? 0 :this.gameSettings.hashCode()));
        result = ((result* 31)+((this.elements == null)? 0 :this.elements.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.events == null)? 0 :this.events.hashCode()));
        result = ((result* 31)+((this.phases == null)? 0 :this.phases.hashCode()));
        result = ((result* 31)+((this.elementStats == null)? 0 :this.elementStats.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Input) == false) {
            return false;
        }
        Input rhs = ((Input) other);
        return ((((((((((this.elementTypes == rhs.elementTypes)||((this.elementTypes!= null)&&this.elementTypes.equals(rhs.elementTypes)))&&((this.teams == rhs.teams)||((this.teams!= null)&&this.teams.equals(rhs.teams))))&&((this.totalPlayers == rhs.totalPlayers)||((this.totalPlayers!= null)&&this.totalPlayers.equals(rhs.totalPlayers))))&&((this.gameSettings == rhs.gameSettings)||((this.gameSettings!= null)&&this.gameSettings.equals(rhs.gameSettings))))&&((this.elements == rhs.elements)||((this.elements!= null)&&this.elements.equals(rhs.elements))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.events == rhs.events)||((this.events!= null)&&this.events.equals(rhs.events))))&&((this.phases == rhs.phases)||((this.phases!= null)&&this.phases.equals(rhs.phases))))&&((this.elementStats == rhs.elementStats)||((this.elementStats!= null)&&this.elementStats.equals(rhs.elementStats))));
    }

}
