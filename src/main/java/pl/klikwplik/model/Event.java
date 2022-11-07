
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
    "name",
    "deadline_time",
    "average_entry_score",
    "finished",
    "data_checked",
    "highest_scoring_entry",
    "deadline_time_epoch",
    "deadline_time_game_offset",
    "highest_score",
    "is_previous",
    "is_current",
    "is_next",
    "cup_leagues_created",
    "h2h_ko_matches_created",
    "chip_plays",
    "most_selected",
    "most_transferred_in",
    "top_element",
    "top_element_info",
    "transfers_made",
    "most_captained",
    "most_vice_captained"
})
@Generated("jsonschema2pojo")
public class Event {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("deadline_time")
    private String deadlineTime;
    @JsonProperty("average_entry_score")
    private Integer averageEntryScore;
    @JsonProperty("finished")
    private Boolean finished;
    @JsonProperty("data_checked")
    private Boolean dataChecked;
    @JsonProperty("highest_scoring_entry")
    private Object highestScoringEntry;
    @JsonProperty("deadline_time_epoch")
    private Integer deadlineTimeEpoch;
    @JsonProperty("deadline_time_game_offset")
    private Integer deadlineTimeGameOffset;
    @JsonProperty("highest_score")
    private Object highestScore;
    @JsonProperty("is_previous")
    private Boolean isPrevious;
    @JsonProperty("is_current")
    private Boolean isCurrent;
    @JsonProperty("is_next")
    private Boolean isNext;
    @JsonProperty("cup_leagues_created")
    private Boolean cupLeaguesCreated;
    @JsonProperty("h2h_ko_matches_created")
    private Boolean h2hKoMatchesCreated;
    @JsonProperty("chip_plays")
    private List<ChipPlay> chipPlays = new ArrayList<ChipPlay>();
    @JsonProperty("most_selected")
    private Object mostSelected;
    @JsonProperty("most_transferred_in")
    private Object mostTransferredIn;
    @JsonProperty("top_element")
    private Object topElement;
    @JsonProperty("top_element_info")
    private Object topElementInfo;
    @JsonProperty("transfers_made")
    private Integer transfersMade;
    @JsonProperty("most_captained")
    private Object mostCaptained;
    @JsonProperty("most_vice_captained")
    private Object mostViceCaptained;
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

    public Event withId(Integer id) {
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

    public Event withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("deadline_time")
    public String getDeadlineTime() {
        return deadlineTime;
    }

    @JsonProperty("deadline_time")
    public void setDeadlineTime(String deadlineTime) {
        this.deadlineTime = deadlineTime;
    }

    public Event withDeadlineTime(String deadlineTime) {
        this.deadlineTime = deadlineTime;
        return this;
    }

    @JsonProperty("average_entry_score")
    public Integer getAverageEntryScore() {
        return averageEntryScore;
    }

    @JsonProperty("average_entry_score")
    public void setAverageEntryScore(Integer averageEntryScore) {
        this.averageEntryScore = averageEntryScore;
    }

    public Event withAverageEntryScore(Integer averageEntryScore) {
        this.averageEntryScore = averageEntryScore;
        return this;
    }

    @JsonProperty("finished")
    public Boolean getFinished() {
        return finished;
    }

    @JsonProperty("finished")
    public void setFinished(Boolean finished) {
        this.finished = finished;
    }

    public Event withFinished(Boolean finished) {
        this.finished = finished;
        return this;
    }

    @JsonProperty("data_checked")
    public Boolean getDataChecked() {
        return dataChecked;
    }

    @JsonProperty("data_checked")
    public void setDataChecked(Boolean dataChecked) {
        this.dataChecked = dataChecked;
    }

    public Event withDataChecked(Boolean dataChecked) {
        this.dataChecked = dataChecked;
        return this;
    }

    @JsonProperty("highest_scoring_entry")
    public Object getHighestScoringEntry() {
        return highestScoringEntry;
    }

    @JsonProperty("highest_scoring_entry")
    public void setHighestScoringEntry(Object highestScoringEntry) {
        this.highestScoringEntry = highestScoringEntry;
    }

    public Event withHighestScoringEntry(Object highestScoringEntry) {
        this.highestScoringEntry = highestScoringEntry;
        return this;
    }

    @JsonProperty("deadline_time_epoch")
    public Integer getDeadlineTimeEpoch() {
        return deadlineTimeEpoch;
    }

    @JsonProperty("deadline_time_epoch")
    public void setDeadlineTimeEpoch(Integer deadlineTimeEpoch) {
        this.deadlineTimeEpoch = deadlineTimeEpoch;
    }

    public Event withDeadlineTimeEpoch(Integer deadlineTimeEpoch) {
        this.deadlineTimeEpoch = deadlineTimeEpoch;
        return this;
    }

    @JsonProperty("deadline_time_game_offset")
    public Integer getDeadlineTimeGameOffset() {
        return deadlineTimeGameOffset;
    }

    @JsonProperty("deadline_time_game_offset")
    public void setDeadlineTimeGameOffset(Integer deadlineTimeGameOffset) {
        this.deadlineTimeGameOffset = deadlineTimeGameOffset;
    }

    public Event withDeadlineTimeGameOffset(Integer deadlineTimeGameOffset) {
        this.deadlineTimeGameOffset = deadlineTimeGameOffset;
        return this;
    }

    @JsonProperty("highest_score")
    public Object getHighestScore() {
        return highestScore;
    }

    @JsonProperty("highest_score")
    public void setHighestScore(Object highestScore) {
        this.highestScore = highestScore;
    }

    public Event withHighestScore(Object highestScore) {
        this.highestScore = highestScore;
        return this;
    }

    @JsonProperty("is_previous")
    public Boolean getIsPrevious() {
        return isPrevious;
    }

    @JsonProperty("is_previous")
    public void setIsPrevious(Boolean isPrevious) {
        this.isPrevious = isPrevious;
    }

    public Event withIsPrevious(Boolean isPrevious) {
        this.isPrevious = isPrevious;
        return this;
    }

    @JsonProperty("is_current")
    public Boolean getIsCurrent() {
        return isCurrent;
    }

    @JsonProperty("is_current")
    public void setIsCurrent(Boolean isCurrent) {
        this.isCurrent = isCurrent;
    }

    public Event withIsCurrent(Boolean isCurrent) {
        this.isCurrent = isCurrent;
        return this;
    }

    @JsonProperty("is_next")
    public Boolean getIsNext() {
        return isNext;
    }

    @JsonProperty("is_next")
    public void setIsNext(Boolean isNext) {
        this.isNext = isNext;
    }

    public Event withIsNext(Boolean isNext) {
        this.isNext = isNext;
        return this;
    }

    @JsonProperty("cup_leagues_created")
    public Boolean getCupLeaguesCreated() {
        return cupLeaguesCreated;
    }

    @JsonProperty("cup_leagues_created")
    public void setCupLeaguesCreated(Boolean cupLeaguesCreated) {
        this.cupLeaguesCreated = cupLeaguesCreated;
    }

    public Event withCupLeaguesCreated(Boolean cupLeaguesCreated) {
        this.cupLeaguesCreated = cupLeaguesCreated;
        return this;
    }

    @JsonProperty("h2h_ko_matches_created")
    public Boolean getH2hKoMatchesCreated() {
        return h2hKoMatchesCreated;
    }

    @JsonProperty("h2h_ko_matches_created")
    public void setH2hKoMatchesCreated(Boolean h2hKoMatchesCreated) {
        this.h2hKoMatchesCreated = h2hKoMatchesCreated;
    }

    public Event withH2hKoMatchesCreated(Boolean h2hKoMatchesCreated) {
        this.h2hKoMatchesCreated = h2hKoMatchesCreated;
        return this;
    }

    @JsonProperty("chip_plays")
    public List<ChipPlay> getChipPlays() {
        return chipPlays;
    }

    @JsonProperty("chip_plays")
    public void setChipPlays(List<ChipPlay> chipPlays) {
        this.chipPlays = chipPlays;
    }

    public Event withChipPlays(List<ChipPlay> chipPlays) {
        this.chipPlays = chipPlays;
        return this;
    }

    @JsonProperty("most_selected")
    public Object getMostSelected() {
        return mostSelected;
    }

    @JsonProperty("most_selected")
    public void setMostSelected(Object mostSelected) {
        this.mostSelected = mostSelected;
    }

    public Event withMostSelected(Object mostSelected) {
        this.mostSelected = mostSelected;
        return this;
    }

    @JsonProperty("most_transferred_in")
    public Object getMostTransferredIn() {
        return mostTransferredIn;
    }

    @JsonProperty("most_transferred_in")
    public void setMostTransferredIn(Object mostTransferredIn) {
        this.mostTransferredIn = mostTransferredIn;
    }

    public Event withMostTransferredIn(Object mostTransferredIn) {
        this.mostTransferredIn = mostTransferredIn;
        return this;
    }

    @JsonProperty("top_element")
    public Object getTopElement() {
        return topElement;
    }

    @JsonProperty("top_element")
    public void setTopElement(Object topElement) {
        this.topElement = topElement;
    }

    public Event withTopElement(Object topElement) {
        this.topElement = topElement;
        return this;
    }

    @JsonProperty("top_element_info")
    public Object getTopElementInfo() {
        return topElementInfo;
    }

    @JsonProperty("top_element_info")
    public void setTopElementInfo(Object topElementInfo) {
        this.topElementInfo = topElementInfo;
    }

    public Event withTopElementInfo(Object topElementInfo) {
        this.topElementInfo = topElementInfo;
        return this;
    }

    @JsonProperty("transfers_made")
    public Integer getTransfersMade() {
        return transfersMade;
    }

    @JsonProperty("transfers_made")
    public void setTransfersMade(Integer transfersMade) {
        this.transfersMade = transfersMade;
    }

    public Event withTransfersMade(Integer transfersMade) {
        this.transfersMade = transfersMade;
        return this;
    }

    @JsonProperty("most_captained")
    public Object getMostCaptained() {
        return mostCaptained;
    }

    @JsonProperty("most_captained")
    public void setMostCaptained(Object mostCaptained) {
        this.mostCaptained = mostCaptained;
    }

    public Event withMostCaptained(Object mostCaptained) {
        this.mostCaptained = mostCaptained;
        return this;
    }

    @JsonProperty("most_vice_captained")
    public Object getMostViceCaptained() {
        return mostViceCaptained;
    }

    @JsonProperty("most_vice_captained")
    public void setMostViceCaptained(Object mostViceCaptained) {
        this.mostViceCaptained = mostViceCaptained;
    }

    public Event withMostViceCaptained(Object mostViceCaptained) {
        this.mostViceCaptained = mostViceCaptained;
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

    public Event withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Event.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("deadlineTime");
        sb.append('=');
        sb.append(((this.deadlineTime == null)?"<null>":this.deadlineTime));
        sb.append(',');
        sb.append("averageEntryScore");
        sb.append('=');
        sb.append(((this.averageEntryScore == null)?"<null>":this.averageEntryScore));
        sb.append(',');
        sb.append("finished");
        sb.append('=');
        sb.append(((this.finished == null)?"<null>":this.finished));
        sb.append(',');
        sb.append("dataChecked");
        sb.append('=');
        sb.append(((this.dataChecked == null)?"<null>":this.dataChecked));
        sb.append(',');
        sb.append("highestScoringEntry");
        sb.append('=');
        sb.append(((this.highestScoringEntry == null)?"<null>":this.highestScoringEntry));
        sb.append(',');
        sb.append("deadlineTimeEpoch");
        sb.append('=');
        sb.append(((this.deadlineTimeEpoch == null)?"<null>":this.deadlineTimeEpoch));
        sb.append(',');
        sb.append("deadlineTimeGameOffset");
        sb.append('=');
        sb.append(((this.deadlineTimeGameOffset == null)?"<null>":this.deadlineTimeGameOffset));
        sb.append(',');
        sb.append("highestScore");
        sb.append('=');
        sb.append(((this.highestScore == null)?"<null>":this.highestScore));
        sb.append(',');
        sb.append("isPrevious");
        sb.append('=');
        sb.append(((this.isPrevious == null)?"<null>":this.isPrevious));
        sb.append(',');
        sb.append("isCurrent");
        sb.append('=');
        sb.append(((this.isCurrent == null)?"<null>":this.isCurrent));
        sb.append(',');
        sb.append("isNext");
        sb.append('=');
        sb.append(((this.isNext == null)?"<null>":this.isNext));
        sb.append(',');
        sb.append("cupLeaguesCreated");
        sb.append('=');
        sb.append(((this.cupLeaguesCreated == null)?"<null>":this.cupLeaguesCreated));
        sb.append(',');
        sb.append("h2hKoMatchesCreated");
        sb.append('=');
        sb.append(((this.h2hKoMatchesCreated == null)?"<null>":this.h2hKoMatchesCreated));
        sb.append(',');
        sb.append("chipPlays");
        sb.append('=');
        sb.append(((this.chipPlays == null)?"<null>":this.chipPlays));
        sb.append(',');
        sb.append("mostSelected");
        sb.append('=');
        sb.append(((this.mostSelected == null)?"<null>":this.mostSelected));
        sb.append(',');
        sb.append("mostTransferredIn");
        sb.append('=');
        sb.append(((this.mostTransferredIn == null)?"<null>":this.mostTransferredIn));
        sb.append(',');
        sb.append("topElement");
        sb.append('=');
        sb.append(((this.topElement == null)?"<null>":this.topElement));
        sb.append(',');
        sb.append("topElementInfo");
        sb.append('=');
        sb.append(((this.topElementInfo == null)?"<null>":this.topElementInfo));
        sb.append(',');
        sb.append("transfersMade");
        sb.append('=');
        sb.append(((this.transfersMade == null)?"<null>":this.transfersMade));
        sb.append(',');
        sb.append("mostCaptained");
        sb.append('=');
        sb.append(((this.mostCaptained == null)?"<null>":this.mostCaptained));
        sb.append(',');
        sb.append("mostViceCaptained");
        sb.append('=');
        sb.append(((this.mostViceCaptained == null)?"<null>":this.mostViceCaptained));
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
        result = ((result* 31)+((this.deadlineTime == null)? 0 :this.deadlineTime.hashCode()));
        result = ((result* 31)+((this.mostCaptained == null)? 0 :this.mostCaptained.hashCode()));
        result = ((result* 31)+((this.deadlineTimeEpoch == null)? 0 :this.deadlineTimeEpoch.hashCode()));
        result = ((result* 31)+((this.highestScoringEntry == null)? 0 :this.highestScoringEntry.hashCode()));
        result = ((result* 31)+((this.highestScore == null)? 0 :this.highestScore.hashCode()));
        result = ((result* 31)+((this.isPrevious == null)? 0 :this.isPrevious.hashCode()));
        result = ((result* 31)+((this.chipPlays == null)? 0 :this.chipPlays.hashCode()));
        result = ((result* 31)+((this.h2hKoMatchesCreated == null)? 0 :this.h2hKoMatchesCreated.hashCode()));
        result = ((result* 31)+((this.mostSelected == null)? 0 :this.mostSelected.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.isNext == null)? 0 :this.isNext.hashCode()));
        result = ((result* 31)+((this.transfersMade == null)? 0 :this.transfersMade.hashCode()));
        result = ((result* 31)+((this.deadlineTimeGameOffset == null)? 0 :this.deadlineTimeGameOffset.hashCode()));
        result = ((result* 31)+((this.topElementInfo == null)? 0 :this.topElementInfo.hashCode()));
        result = ((result* 31)+((this.dataChecked == null)? 0 :this.dataChecked.hashCode()));
        result = ((result* 31)+((this.finished == null)? 0 :this.finished.hashCode()));
        result = ((result* 31)+((this.isCurrent == null)? 0 :this.isCurrent.hashCode()));
        result = ((result* 31)+((this.mostTransferredIn == null)? 0 :this.mostTransferredIn.hashCode()));
        result = ((result* 31)+((this.topElement == null)? 0 :this.topElement.hashCode()));
        result = ((result* 31)+((this.mostViceCaptained == null)? 0 :this.mostViceCaptained.hashCode()));
        result = ((result* 31)+((this.cupLeaguesCreated == null)? 0 :this.cupLeaguesCreated.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.averageEntryScore == null)? 0 :this.averageEntryScore.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Event) == false) {
            return false;
        }
        Event rhs = ((Event) other);
        return (((((((((((((((((((((((((this.deadlineTime == rhs.deadlineTime)||((this.deadlineTime!= null)&&this.deadlineTime.equals(rhs.deadlineTime)))&&((this.mostCaptained == rhs.mostCaptained)||((this.mostCaptained!= null)&&this.mostCaptained.equals(rhs.mostCaptained))))&&((this.deadlineTimeEpoch == rhs.deadlineTimeEpoch)||((this.deadlineTimeEpoch!= null)&&this.deadlineTimeEpoch.equals(rhs.deadlineTimeEpoch))))&&((this.highestScoringEntry == rhs.highestScoringEntry)||((this.highestScoringEntry!= null)&&this.highestScoringEntry.equals(rhs.highestScoringEntry))))&&((this.highestScore == rhs.highestScore)||((this.highestScore!= null)&&this.highestScore.equals(rhs.highestScore))))&&((this.isPrevious == rhs.isPrevious)||((this.isPrevious!= null)&&this.isPrevious.equals(rhs.isPrevious))))&&((this.chipPlays == rhs.chipPlays)||((this.chipPlays!= null)&&this.chipPlays.equals(rhs.chipPlays))))&&((this.h2hKoMatchesCreated == rhs.h2hKoMatchesCreated)||((this.h2hKoMatchesCreated!= null)&&this.h2hKoMatchesCreated.equals(rhs.h2hKoMatchesCreated))))&&((this.mostSelected == rhs.mostSelected)||((this.mostSelected!= null)&&this.mostSelected.equals(rhs.mostSelected))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.isNext == rhs.isNext)||((this.isNext!= null)&&this.isNext.equals(rhs.isNext))))&&((this.transfersMade == rhs.transfersMade)||((this.transfersMade!= null)&&this.transfersMade.equals(rhs.transfersMade))))&&((this.deadlineTimeGameOffset == rhs.deadlineTimeGameOffset)||((this.deadlineTimeGameOffset!= null)&&this.deadlineTimeGameOffset.equals(rhs.deadlineTimeGameOffset))))&&((this.topElementInfo == rhs.topElementInfo)||((this.topElementInfo!= null)&&this.topElementInfo.equals(rhs.topElementInfo))))&&((this.dataChecked == rhs.dataChecked)||((this.dataChecked!= null)&&this.dataChecked.equals(rhs.dataChecked))))&&((this.finished == rhs.finished)||((this.finished!= null)&&this.finished.equals(rhs.finished))))&&((this.isCurrent == rhs.isCurrent)||((this.isCurrent!= null)&&this.isCurrent.equals(rhs.isCurrent))))&&((this.mostTransferredIn == rhs.mostTransferredIn)||((this.mostTransferredIn!= null)&&this.mostTransferredIn.equals(rhs.mostTransferredIn))))&&((this.topElement == rhs.topElement)||((this.topElement!= null)&&this.topElement.equals(rhs.topElement))))&&((this.mostViceCaptained == rhs.mostViceCaptained)||((this.mostViceCaptained!= null)&&this.mostViceCaptained.equals(rhs.mostViceCaptained))))&&((this.cupLeaguesCreated == rhs.cupLeaguesCreated)||((this.cupLeaguesCreated!= null)&&this.cupLeaguesCreated.equals(rhs.cupLeaguesCreated))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.averageEntryScore == rhs.averageEntryScore)||((this.averageEntryScore!= null)&&this.averageEntryScore.equals(rhs.averageEntryScore))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
