
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
    "code",
    "draw",
    "form",
    "id",
    "loss",
    "name",
    "played",
    "points",
    "position",
    "short_name",
    "strength",
    "team_division",
    "unavailable",
    "win",
    "strength_overall_home",
    "strength_overall_away",
    "strength_attack_home",
    "strength_attack_away",
    "strength_defence_home",
    "strength_defence_away",
    "pulse_id"
})
@Generated("jsonschema2pojo")
public class Team {

    @JsonProperty("code")
    private Integer code;
    @JsonProperty("draw")
    private Integer draw;
    @JsonProperty("form")
    private Object form;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("loss")
    private Integer loss;
    @JsonProperty("name")
    private String name;
    @JsonProperty("played")
    private Integer played;
    @JsonProperty("points")
    private Integer points;
    @JsonProperty("position")
    private Integer position;
    @JsonProperty("short_name")
    private String shortName;
    @JsonProperty("strength")
    private Integer strength;
    @JsonProperty("team_division")
    private Object teamDivision;
    @JsonProperty("unavailable")
    private Boolean unavailable;
    @JsonProperty("win")
    private Integer win;
    @JsonProperty("strength_overall_home")
    private Integer strengthOverallHome;
    @JsonProperty("strength_overall_away")
    private Integer strengthOverallAway;
    @JsonProperty("strength_attack_home")
    private Integer strengthAttackHome;
    @JsonProperty("strength_attack_away")
    private Integer strengthAttackAway;
    @JsonProperty("strength_defence_home")
    private Integer strengthDefenceHome;
    @JsonProperty("strength_defence_away")
    private Integer strengthDefenceAway;
    @JsonProperty("pulse_id")
    private Integer pulseId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("code")
    public Integer getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(Integer code) {
        this.code = code;
    }

    public Team withCode(Integer code) {
        this.code = code;
        return this;
    }

    @JsonProperty("draw")
    public Integer getDraw() {
        return draw;
    }

    @JsonProperty("draw")
    public void setDraw(Integer draw) {
        this.draw = draw;
    }

    public Team withDraw(Integer draw) {
        this.draw = draw;
        return this;
    }

    @JsonProperty("form")
    public Object getForm() {
        return form;
    }

    @JsonProperty("form")
    public void setForm(Object form) {
        this.form = form;
    }

    public Team withForm(Object form) {
        this.form = form;
        return this;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    public Team withId(Integer id) {
        this.id = id;
        return this;
    }

    @JsonProperty("loss")
    public Integer getLoss() {
        return loss;
    }

    @JsonProperty("loss")
    public void setLoss(Integer loss) {
        this.loss = loss;
    }

    public Team withLoss(Integer loss) {
        this.loss = loss;
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

    public Team withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("played")
    public Integer getPlayed() {
        return played;
    }

    @JsonProperty("played")
    public void setPlayed(Integer played) {
        this.played = played;
    }

    public Team withPlayed(Integer played) {
        this.played = played;
        return this;
    }

    @JsonProperty("points")
    public Integer getPoints() {
        return points;
    }

    @JsonProperty("points")
    public void setPoints(Integer points) {
        this.points = points;
    }

    public Team withPoints(Integer points) {
        this.points = points;
        return this;
    }

    @JsonProperty("position")
    public Integer getPosition() {
        return position;
    }

    @JsonProperty("position")
    public void setPosition(Integer position) {
        this.position = position;
    }

    public Team withPosition(Integer position) {
        this.position = position;
        return this;
    }

    @JsonProperty("short_name")
    public String getShortName() {
        return shortName;
    }

    @JsonProperty("short_name")
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public Team withShortName(String shortName) {
        this.shortName = shortName;
        return this;
    }

    @JsonProperty("strength")
    public Integer getStrength() {
        return strength;
    }

    @JsonProperty("strength")
    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    public Team withStrength(Integer strength) {
        this.strength = strength;
        return this;
    }

    @JsonProperty("team_division")
    public Object getTeamDivision() {
        return teamDivision;
    }

    @JsonProperty("team_division")
    public void setTeamDivision(Object teamDivision) {
        this.teamDivision = teamDivision;
    }

    public Team withTeamDivision(Object teamDivision) {
        this.teamDivision = teamDivision;
        return this;
    }

    @JsonProperty("unavailable")
    public Boolean getUnavailable() {
        return unavailable;
    }

    @JsonProperty("unavailable")
    public void setUnavailable(Boolean unavailable) {
        this.unavailable = unavailable;
    }

    public Team withUnavailable(Boolean unavailable) {
        this.unavailable = unavailable;
        return this;
    }

    @JsonProperty("win")
    public Integer getWin() {
        return win;
    }

    @JsonProperty("win")
    public void setWin(Integer win) {
        this.win = win;
    }

    public Team withWin(Integer win) {
        this.win = win;
        return this;
    }

    @JsonProperty("strength_overall_home")
    public Integer getStrengthOverallHome() {
        return strengthOverallHome;
    }

    @JsonProperty("strength_overall_home")
    public void setStrengthOverallHome(Integer strengthOverallHome) {
        this.strengthOverallHome = strengthOverallHome;
    }

    public Team withStrengthOverallHome(Integer strengthOverallHome) {
        this.strengthOverallHome = strengthOverallHome;
        return this;
    }

    @JsonProperty("strength_overall_away")
    public Integer getStrengthOverallAway() {
        return strengthOverallAway;
    }

    @JsonProperty("strength_overall_away")
    public void setStrengthOverallAway(Integer strengthOverallAway) {
        this.strengthOverallAway = strengthOverallAway;
    }

    public Team withStrengthOverallAway(Integer strengthOverallAway) {
        this.strengthOverallAway = strengthOverallAway;
        return this;
    }

    @JsonProperty("strength_attack_home")
    public Integer getStrengthAttackHome() {
        return strengthAttackHome;
    }

    @JsonProperty("strength_attack_home")
    public void setStrengthAttackHome(Integer strengthAttackHome) {
        this.strengthAttackHome = strengthAttackHome;
    }

    public Team withStrengthAttackHome(Integer strengthAttackHome) {
        this.strengthAttackHome = strengthAttackHome;
        return this;
    }

    @JsonProperty("strength_attack_away")
    public Integer getStrengthAttackAway() {
        return strengthAttackAway;
    }

    @JsonProperty("strength_attack_away")
    public void setStrengthAttackAway(Integer strengthAttackAway) {
        this.strengthAttackAway = strengthAttackAway;
    }

    public Team withStrengthAttackAway(Integer strengthAttackAway) {
        this.strengthAttackAway = strengthAttackAway;
        return this;
    }

    @JsonProperty("strength_defence_home")
    public Integer getStrengthDefenceHome() {
        return strengthDefenceHome;
    }

    @JsonProperty("strength_defence_home")
    public void setStrengthDefenceHome(Integer strengthDefenceHome) {
        this.strengthDefenceHome = strengthDefenceHome;
    }

    public Team withStrengthDefenceHome(Integer strengthDefenceHome) {
        this.strengthDefenceHome = strengthDefenceHome;
        return this;
    }

    @JsonProperty("strength_defence_away")
    public Integer getStrengthDefenceAway() {
        return strengthDefenceAway;
    }

    @JsonProperty("strength_defence_away")
    public void setStrengthDefenceAway(Integer strengthDefenceAway) {
        this.strengthDefenceAway = strengthDefenceAway;
    }

    public Team withStrengthDefenceAway(Integer strengthDefenceAway) {
        this.strengthDefenceAway = strengthDefenceAway;
        return this;
    }

    @JsonProperty("pulse_id")
    public Integer getPulseId() {
        return pulseId;
    }

    @JsonProperty("pulse_id")
    public void setPulseId(Integer pulseId) {
        this.pulseId = pulseId;
    }

    public Team withPulseId(Integer pulseId) {
        this.pulseId = pulseId;
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

    public Team withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Team.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("draw");
        sb.append('=');
        sb.append(((this.draw == null)?"<null>":this.draw));
        sb.append(',');
        sb.append("form");
        sb.append('=');
        sb.append(((this.form == null)?"<null>":this.form));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("loss");
        sb.append('=');
        sb.append(((this.loss == null)?"<null>":this.loss));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("played");
        sb.append('=');
        sb.append(((this.played == null)?"<null>":this.played));
        sb.append(',');
        sb.append("points");
        sb.append('=');
        sb.append(((this.points == null)?"<null>":this.points));
        sb.append(',');
        sb.append("position");
        sb.append('=');
        sb.append(((this.position == null)?"<null>":this.position));
        sb.append(',');
        sb.append("shortName");
        sb.append('=');
        sb.append(((this.shortName == null)?"<null>":this.shortName));
        sb.append(',');
        sb.append("strength");
        sb.append('=');
        sb.append(((this.strength == null)?"<null>":this.strength));
        sb.append(',');
        sb.append("teamDivision");
        sb.append('=');
        sb.append(((this.teamDivision == null)?"<null>":this.teamDivision));
        sb.append(',');
        sb.append("unavailable");
        sb.append('=');
        sb.append(((this.unavailable == null)?"<null>":this.unavailable));
        sb.append(',');
        sb.append("win");
        sb.append('=');
        sb.append(((this.win == null)?"<null>":this.win));
        sb.append(',');
        sb.append("strengthOverallHome");
        sb.append('=');
        sb.append(((this.strengthOverallHome == null)?"<null>":this.strengthOverallHome));
        sb.append(',');
        sb.append("strengthOverallAway");
        sb.append('=');
        sb.append(((this.strengthOverallAway == null)?"<null>":this.strengthOverallAway));
        sb.append(',');
        sb.append("strengthAttackHome");
        sb.append('=');
        sb.append(((this.strengthAttackHome == null)?"<null>":this.strengthAttackHome));
        sb.append(',');
        sb.append("strengthAttackAway");
        sb.append('=');
        sb.append(((this.strengthAttackAway == null)?"<null>":this.strengthAttackAway));
        sb.append(',');
        sb.append("strengthDefenceHome");
        sb.append('=');
        sb.append(((this.strengthDefenceHome == null)?"<null>":this.strengthDefenceHome));
        sb.append(',');
        sb.append("strengthDefenceAway");
        sb.append('=');
        sb.append(((this.strengthDefenceAway == null)?"<null>":this.strengthDefenceAway));
        sb.append(',');
        sb.append("pulseId");
        sb.append('=');
        sb.append(((this.pulseId == null)?"<null>":this.pulseId));
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
        result = ((result* 31)+((this.teamDivision == null)? 0 :this.teamDivision.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.strength == null)? 0 :this.strength.hashCode()));
        result = ((result* 31)+((this.unavailable == null)? 0 :this.unavailable.hashCode()));
        result = ((result* 31)+((this.strengthAttackAway == null)? 0 :this.strengthAttackAway.hashCode()));
        result = ((result* 31)+((this.strengthDefenceHome == null)? 0 :this.strengthDefenceHome.hashCode()));
        result = ((result* 31)+((this.draw == null)? 0 :this.draw.hashCode()));
        result = ((result* 31)+((this.played == null)? 0 :this.played.hashCode()));
        result = ((result* 31)+((this.points == null)? 0 :this.points.hashCode()));
        result = ((result* 31)+((this.loss == null)? 0 :this.loss.hashCode()));
        result = ((result* 31)+((this.form == null)? 0 :this.form.hashCode()));
        result = ((result* 31)+((this.strengthOverallAway == null)? 0 :this.strengthOverallAway.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.strengthOverallHome == null)? 0 :this.strengthOverallHome.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.position == null)? 0 :this.position.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.shortName == null)? 0 :this.shortName.hashCode()));
        result = ((result* 31)+((this.pulseId == null)? 0 :this.pulseId.hashCode()));
        result = ((result* 31)+((this.win == null)? 0 :this.win.hashCode()));
        result = ((result* 31)+((this.strengthAttackHome == null)? 0 :this.strengthAttackHome.hashCode()));
        result = ((result* 31)+((this.strengthDefenceAway == null)? 0 :this.strengthDefenceAway.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Team) == false) {
            return false;
        }
        Team rhs = ((Team) other);
        return (((((((((((((((((((((((this.teamDivision == rhs.teamDivision)||((this.teamDivision!= null)&&this.teamDivision.equals(rhs.teamDivision)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.strength == rhs.strength)||((this.strength!= null)&&this.strength.equals(rhs.strength))))&&((this.unavailable == rhs.unavailable)||((this.unavailable!= null)&&this.unavailable.equals(rhs.unavailable))))&&((this.strengthAttackAway == rhs.strengthAttackAway)||((this.strengthAttackAway!= null)&&this.strengthAttackAway.equals(rhs.strengthAttackAway))))&&((this.strengthDefenceHome == rhs.strengthDefenceHome)||((this.strengthDefenceHome!= null)&&this.strengthDefenceHome.equals(rhs.strengthDefenceHome))))&&((this.draw == rhs.draw)||((this.draw!= null)&&this.draw.equals(rhs.draw))))&&((this.played == rhs.played)||((this.played!= null)&&this.played.equals(rhs.played))))&&((this.points == rhs.points)||((this.points!= null)&&this.points.equals(rhs.points))))&&((this.loss == rhs.loss)||((this.loss!= null)&&this.loss.equals(rhs.loss))))&&((this.form == rhs.form)||((this.form!= null)&&this.form.equals(rhs.form))))&&((this.strengthOverallAway == rhs.strengthOverallAway)||((this.strengthOverallAway!= null)&&this.strengthOverallAway.equals(rhs.strengthOverallAway))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.strengthOverallHome == rhs.strengthOverallHome)||((this.strengthOverallHome!= null)&&this.strengthOverallHome.equals(rhs.strengthOverallHome))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.position == rhs.position)||((this.position!= null)&&this.position.equals(rhs.position))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.shortName == rhs.shortName)||((this.shortName!= null)&&this.shortName.equals(rhs.shortName))))&&((this.pulseId == rhs.pulseId)||((this.pulseId!= null)&&this.pulseId.equals(rhs.pulseId))))&&((this.win == rhs.win)||((this.win!= null)&&this.win.equals(rhs.win))))&&((this.strengthAttackHome == rhs.strengthAttackHome)||((this.strengthAttackHome!= null)&&this.strengthAttackHome.equals(rhs.strengthAttackHome))))&&((this.strengthDefenceAway == rhs.strengthDefenceAway)||((this.strengthDefenceAway!= null)&&this.strengthDefenceAway.equals(rhs.strengthDefenceAway))));
    }

}
