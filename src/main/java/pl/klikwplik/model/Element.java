
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
    "chance_of_playing_next_round",
    "chance_of_playing_this_round",
    "code",
    "cost_change_event",
    "cost_change_event_fall",
    "cost_change_start",
    "cost_change_start_fall",
    "dreamteam_count",
    "element_type",
    "ep_next",
    "ep_this",
    "event_points",
    "first_name",
    "form",
    "id",
    "in_dreamteam",
    "news",
    "news_added",
    "now_cost",
    "photo",
    "points_per_game",
    "second_name",
    "selected_by_percent",
    "special",
    "squad_number",
    "status",
    "team",
    "team_code",
    "total_points",
    "transfers_in",
    "transfers_in_event",
    "transfers_out",
    "transfers_out_event",
    "value_form",
    "value_season",
    "web_name",
    "minutes",
    "goals_scored",
    "assists",
    "clean_sheets",
    "goals_conceded",
    "own_goals",
    "penalties_saved",
    "penalties_missed",
    "yellow_cards",
    "red_cards",
    "saves",
    "bonus",
    "bps",
    "influence",
    "creativity",
    "threat",
    "ict_index",
    "influence_rank",
    "influence_rank_type",
    "creativity_rank",
    "creativity_rank_type",
    "threat_rank",
    "threat_rank_type",
    "ict_index_rank",
    "ict_index_rank_type",
    "corners_and_indirect_freekicks_order",
    "corners_and_indirect_freekicks_text",
    "direct_freekicks_order",
    "direct_freekicks_text",
    "penalties_order",
    "penalties_text",
    "now_cost_rank",
    "now_cost_rank_type",
    "form_rank",
    "form_rank_type",
    "points_per_game_rank",
    "points_per_game_rank_type",
    "selected_rank",
    "selected_rank_type"
})
@Generated("jsonschema2pojo")
public class Element {

    @JsonProperty("chance_of_playing_next_round")
    private Integer chanceOfPlayingNextRound;
    @JsonProperty("chance_of_playing_this_round")
    private Integer chanceOfPlayingThisRound;
    @JsonProperty("code")
    private Integer code;
    @JsonProperty("cost_change_event")
    private Integer costChangeEvent;
    @JsonProperty("cost_change_event_fall")
    private Integer costChangeEventFall;
    @JsonProperty("cost_change_start")
    private Integer costChangeStart;
    @JsonProperty("cost_change_start_fall")
    private Integer costChangeStartFall;
    @JsonProperty("dreamteam_count")
    private Integer dreamteamCount;
    @JsonProperty("element_type")
    private Integer elementType;
    @JsonProperty("ep_next")
    private String epNext;
    @JsonProperty("ep_this")
    private String epThis;
    @JsonProperty("event_points")
    private Integer eventPoints;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("form")
    private String form;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("in_dreamteam")
    private Boolean inDreamteam;
    @JsonProperty("news")
    private String news;
    @JsonProperty("news_added")
    private String newsAdded;
    @JsonProperty("now_cost")
    private Integer nowCost;
    @JsonProperty("photo")
    private String photo;
    @JsonProperty("points_per_game")
    private String pointsPerGame;
    @JsonProperty("second_name")
    private String secondName;
    @JsonProperty("selected_by_percent")
    private String selectedByPercent;
    @JsonProperty("special")
    private Boolean special;
    @JsonProperty("squad_number")
    private Object squadNumber;
    @JsonProperty("status")
    private String status;
    @JsonProperty("team")
    private Integer team;
    @JsonProperty("team_code")
    private Integer teamCode;
    @JsonProperty("total_points")
    private Integer totalPoints;
    @JsonProperty("transfers_in")
    private Integer transfersIn;
    @JsonProperty("transfers_in_event")
    private Integer transfersInEvent;
    @JsonProperty("transfers_out")
    private Integer transfersOut;
    @JsonProperty("transfers_out_event")
    private Integer transfersOutEvent;
    @JsonProperty("value_form")
    private String valueForm;
    @JsonProperty("value_season")
    private String valueSeason;
    @JsonProperty("web_name")
    private String webName;
    @JsonProperty("minutes")
    private Integer minutes;
    @JsonProperty("goals_scored")
    private Integer goalsScored;
    @JsonProperty("assists")
    private Integer assists;
    @JsonProperty("clean_sheets")
    private Integer cleanSheets;
    @JsonProperty("goals_conceded")
    private Integer goalsConceded;
    @JsonProperty("own_goals")
    private Integer ownGoals;
    @JsonProperty("penalties_saved")
    private Integer penaltiesSaved;
    @JsonProperty("penalties_missed")
    private Integer penaltiesMissed;
    @JsonProperty("yellow_cards")
    private Integer yellowCards;
    @JsonProperty("red_cards")
    private Integer redCards;
    @JsonProperty("saves")
    private Integer saves;
    @JsonProperty("bonus")
    private Integer bonus;
    @JsonProperty("bps")
    private Integer bps;
    @JsonProperty("influence")
    private String influence;
    @JsonProperty("creativity")
    private String creativity;
    @JsonProperty("threat")
    private String threat;
    @JsonProperty("ict_index")
    private String ictIndex;
    @JsonProperty("influence_rank")
    private Integer influenceRank;
    @JsonProperty("influence_rank_type")
    private Integer influenceRankType;
    @JsonProperty("creativity_rank")
    private Integer creativityRank;
    @JsonProperty("creativity_rank_type")
    private Integer creativityRankType;
    @JsonProperty("threat_rank")
    private Integer threatRank;
    @JsonProperty("threat_rank_type")
    private Integer threatRankType;
    @JsonProperty("ict_index_rank")
    private Integer ictIndexRank;
    @JsonProperty("ict_index_rank_type")
    private Integer ictIndexRankType;
    @JsonProperty("corners_and_indirect_freekicks_order")
    private Object cornersAndIndirectFreekicksOrder;
    @JsonProperty("corners_and_indirect_freekicks_text")
    private String cornersAndIndirectFreekicksText;
    @JsonProperty("direct_freekicks_order")
    private Object directFreekicksOrder;
    @JsonProperty("direct_freekicks_text")
    private String directFreekicksText;
    @JsonProperty("penalties_order")
    private Object penaltiesOrder;
    @JsonProperty("penalties_text")
    private String penaltiesText;
    @JsonProperty("now_cost_rank")
    private Integer nowCostRank;
    @JsonProperty("now_cost_rank_type")
    private Integer nowCostRankType;
    @JsonProperty("form_rank")
    private Integer formRank;
    @JsonProperty("form_rank_type")
    private Integer formRankType;
    @JsonProperty("points_per_game_rank")
    private Integer pointsPerGameRank;
    @JsonProperty("points_per_game_rank_type")
    private Integer pointsPerGameRankType;
    @JsonProperty("selected_rank")
    private Integer selectedRank;
    @JsonProperty("selected_rank_type")
    private Integer selectedRankType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("chance_of_playing_next_round")
    public Integer getChanceOfPlayingNextRound() {
        return chanceOfPlayingNextRound;
    }

    @JsonProperty("chance_of_playing_next_round")
    public void setChanceOfPlayingNextRound(Integer chanceOfPlayingNextRound) {
        this.chanceOfPlayingNextRound = chanceOfPlayingNextRound;
    }

    public Element withChanceOfPlayingNextRound(Integer chanceOfPlayingNextRound) {
        this.chanceOfPlayingNextRound = chanceOfPlayingNextRound;
        return this;
    }

    @JsonProperty("chance_of_playing_this_round")
    public Integer getChanceOfPlayingThisRound() {
        return chanceOfPlayingThisRound;
    }

    @JsonProperty("chance_of_playing_this_round")
    public void setChanceOfPlayingThisRound(Integer chanceOfPlayingThisRound) {
        this.chanceOfPlayingThisRound = chanceOfPlayingThisRound;
    }

    public Element withChanceOfPlayingThisRound(Integer chanceOfPlayingThisRound) {
        this.chanceOfPlayingThisRound = chanceOfPlayingThisRound;
        return this;
    }

    @JsonProperty("code")
    public Integer getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(Integer code) {
        this.code = code;
    }

    public Element withCode(Integer code) {
        this.code = code;
        return this;
    }

    @JsonProperty("cost_change_event")
    public Integer getCostChangeEvent() {
        return costChangeEvent;
    }

    @JsonProperty("cost_change_event")
    public void setCostChangeEvent(Integer costChangeEvent) {
        this.costChangeEvent = costChangeEvent;
    }

    public Element withCostChangeEvent(Integer costChangeEvent) {
        this.costChangeEvent = costChangeEvent;
        return this;
    }

    @JsonProperty("cost_change_event_fall")
    public Integer getCostChangeEventFall() {
        return costChangeEventFall;
    }

    @JsonProperty("cost_change_event_fall")
    public void setCostChangeEventFall(Integer costChangeEventFall) {
        this.costChangeEventFall = costChangeEventFall;
    }

    public Element withCostChangeEventFall(Integer costChangeEventFall) {
        this.costChangeEventFall = costChangeEventFall;
        return this;
    }

    @JsonProperty("cost_change_start")
    public Integer getCostChangeStart() {
        return costChangeStart;
    }

    @JsonProperty("cost_change_start")
    public void setCostChangeStart(Integer costChangeStart) {
        this.costChangeStart = costChangeStart;
    }

    public Element withCostChangeStart(Integer costChangeStart) {
        this.costChangeStart = costChangeStart;
        return this;
    }

    @JsonProperty("cost_change_start_fall")
    public Integer getCostChangeStartFall() {
        return costChangeStartFall;
    }

    @JsonProperty("cost_change_start_fall")
    public void setCostChangeStartFall(Integer costChangeStartFall) {
        this.costChangeStartFall = costChangeStartFall;
    }

    public Element withCostChangeStartFall(Integer costChangeStartFall) {
        this.costChangeStartFall = costChangeStartFall;
        return this;
    }

    @JsonProperty("dreamteam_count")
    public Integer getDreamteamCount() {
        return dreamteamCount;
    }

    @JsonProperty("dreamteam_count")
    public void setDreamteamCount(Integer dreamteamCount) {
        this.dreamteamCount = dreamteamCount;
    }

    public Element withDreamteamCount(Integer dreamteamCount) {
        this.dreamteamCount = dreamteamCount;
        return this;
    }

    @JsonProperty("element_type")
    public Integer getElementType() {
        return elementType;
    }

    @JsonProperty("element_type")
    public void setElementType(Integer elementType) {
        this.elementType = elementType;
    }

    public Element withElementType(Integer elementType) {
        this.elementType = elementType;
        return this;
    }

    @JsonProperty("ep_next")
    public String getEpNext() {
        return epNext;
    }

    @JsonProperty("ep_next")
    public void setEpNext(String epNext) {
        this.epNext = epNext;
    }

    public Element withEpNext(String epNext) {
        this.epNext = epNext;
        return this;
    }

    @JsonProperty("ep_this")
    public String getEpThis() {
        return epThis;
    }

    @JsonProperty("ep_this")
    public void setEpThis(String epThis) {
        this.epThis = epThis;
    }

    public Element withEpThis(String epThis) {
        this.epThis = epThis;
        return this;
    }

    @JsonProperty("event_points")
    public Integer getEventPoints() {
        return eventPoints;
    }

    @JsonProperty("event_points")
    public void setEventPoints(Integer eventPoints) {
        this.eventPoints = eventPoints;
    }

    public Element withEventPoints(Integer eventPoints) {
        this.eventPoints = eventPoints;
        return this;
    }

    @JsonProperty("first_name")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("first_name")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Element withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @JsonProperty("form")
    public String getForm() {
        return form;
    }

    @JsonProperty("form")
    public void setForm(String form) {
        this.form = form;
    }

    public Element withForm(String form) {
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

    public Element withId(Integer id) {
        this.id = id;
        return this;
    }

    @JsonProperty("in_dreamteam")
    public Boolean getInDreamteam() {
        return inDreamteam;
    }

    @JsonProperty("in_dreamteam")
    public void setInDreamteam(Boolean inDreamteam) {
        this.inDreamteam = inDreamteam;
    }

    public Element withInDreamteam(Boolean inDreamteam) {
        this.inDreamteam = inDreamteam;
        return this;
    }

    @JsonProperty("news")
    public String getNews() {
        return news;
    }

    @JsonProperty("news")
    public void setNews(String news) {
        this.news = news;
    }

    public Element withNews(String news) {
        this.news = news;
        return this;
    }

    @JsonProperty("news_added")
    public String getNewsAdded() {
        return newsAdded;
    }

    @JsonProperty("news_added")
    public void setNewsAdded(String newsAdded) {
        this.newsAdded = newsAdded;
    }

    public Element withNewsAdded(String newsAdded) {
        this.newsAdded = newsAdded;
        return this;
    }

    @JsonProperty("now_cost")
    public Integer getNowCost() {
        return nowCost;
    }

    @JsonProperty("now_cost")
    public void setNowCost(Integer nowCost) {
        this.nowCost = nowCost;
    }

    public Element withNowCost(Integer nowCost) {
        this.nowCost = nowCost;
        return this;
    }

    @JsonProperty("photo")
    public String getPhoto() {
        return photo;
    }

    @JsonProperty("photo")
    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Element withPhoto(String photo) {
        this.photo = photo;
        return this;
    }

    @JsonProperty("points_per_game")
    public String getPointsPerGame() {
        return pointsPerGame;
    }

    @JsonProperty("points_per_game")
    public void setPointsPerGame(String pointsPerGame) {
        this.pointsPerGame = pointsPerGame;
    }

    public Element withPointsPerGame(String pointsPerGame) {
        this.pointsPerGame = pointsPerGame;
        return this;
    }

    @JsonProperty("second_name")
    public String getSecondName() {
        return secondName;
    }

    @JsonProperty("second_name")
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Element withSecondName(String secondName) {
        this.secondName = secondName;
        return this;
    }

    @JsonProperty("selected_by_percent")
    public String getSelectedByPercent() {
        return selectedByPercent;
    }

    @JsonProperty("selected_by_percent")
    public void setSelectedByPercent(String selectedByPercent) {
        this.selectedByPercent = selectedByPercent;
    }

    public Element withSelectedByPercent(String selectedByPercent) {
        this.selectedByPercent = selectedByPercent;
        return this;
    }

    @JsonProperty("special")
    public Boolean getSpecial() {
        return special;
    }

    @JsonProperty("special")
    public void setSpecial(Boolean special) {
        this.special = special;
    }

    public Element withSpecial(Boolean special) {
        this.special = special;
        return this;
    }

    @JsonProperty("squad_number")
    public Object getSquadNumber() {
        return squadNumber;
    }

    @JsonProperty("squad_number")
    public void setSquadNumber(Object squadNumber) {
        this.squadNumber = squadNumber;
    }

    public Element withSquadNumber(Object squadNumber) {
        this.squadNumber = squadNumber;
        return this;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    public Element withStatus(String status) {
        this.status = status;
        return this;
    }

    @JsonProperty("team")
    public Integer getTeam() {
        return team;
    }

    @JsonProperty("team")
    public void setTeam(Integer team) {
        this.team = team;
    }

    public Element withTeam(Integer team) {
        this.team = team;
        return this;
    }

    @JsonProperty("team_code")
    public Integer getTeamCode() {
        return teamCode;
    }

    @JsonProperty("team_code")
    public void setTeamCode(Integer teamCode) {
        this.teamCode = teamCode;
    }

    public Element withTeamCode(Integer teamCode) {
        this.teamCode = teamCode;
        return this;
    }

    @JsonProperty("total_points")
    public Integer getTotalPoints() {
        return totalPoints;
    }

    @JsonProperty("total_points")
    public void setTotalPoints(Integer totalPoints) {
        this.totalPoints = totalPoints;
    }

    public Element withTotalPoints(Integer totalPoints) {
        this.totalPoints = totalPoints;
        return this;
    }

    @JsonProperty("transfers_in")
    public Integer getTransfersIn() {
        return transfersIn;
    }

    @JsonProperty("transfers_in")
    public void setTransfersIn(Integer transfersIn) {
        this.transfersIn = transfersIn;
    }

    public Element withTransfersIn(Integer transfersIn) {
        this.transfersIn = transfersIn;
        return this;
    }

    @JsonProperty("transfers_in_event")
    public Integer getTransfersInEvent() {
        return transfersInEvent;
    }

    @JsonProperty("transfers_in_event")
    public void setTransfersInEvent(Integer transfersInEvent) {
        this.transfersInEvent = transfersInEvent;
    }

    public Element withTransfersInEvent(Integer transfersInEvent) {
        this.transfersInEvent = transfersInEvent;
        return this;
    }

    @JsonProperty("transfers_out")
    public Integer getTransfersOut() {
        return transfersOut;
    }

    @JsonProperty("transfers_out")
    public void setTransfersOut(Integer transfersOut) {
        this.transfersOut = transfersOut;
    }

    public Element withTransfersOut(Integer transfersOut) {
        this.transfersOut = transfersOut;
        return this;
    }

    @JsonProperty("transfers_out_event")
    public Integer getTransfersOutEvent() {
        return transfersOutEvent;
    }

    @JsonProperty("transfers_out_event")
    public void setTransfersOutEvent(Integer transfersOutEvent) {
        this.transfersOutEvent = transfersOutEvent;
    }

    public Element withTransfersOutEvent(Integer transfersOutEvent) {
        this.transfersOutEvent = transfersOutEvent;
        return this;
    }

    @JsonProperty("value_form")
    public String getValueForm() {
        return valueForm;
    }

    @JsonProperty("value_form")
    public void setValueForm(String valueForm) {
        this.valueForm = valueForm;
    }

    public Element withValueForm(String valueForm) {
        this.valueForm = valueForm;
        return this;
    }

    @JsonProperty("value_season")
    public String getValueSeason() {
        return valueSeason;
    }

    @JsonProperty("value_season")
    public void setValueSeason(String valueSeason) {
        this.valueSeason = valueSeason;
    }

    public Element withValueSeason(String valueSeason) {
        this.valueSeason = valueSeason;
        return this;
    }

    @JsonProperty("web_name")
    public String getWebName() {
        return webName;
    }

    @JsonProperty("web_name")
    public void setWebName(String webName) {
        this.webName = webName;
    }

    public Element withWebName(String webName) {
        this.webName = webName;
        return this;
    }

    @JsonProperty("minutes")
    public Integer getMinutes() {
        return minutes;
    }

    @JsonProperty("minutes")
    public void setMinutes(Integer minutes) {
        this.minutes = minutes;
    }

    public Element withMinutes(Integer minutes) {
        this.minutes = minutes;
        return this;
    }

    @JsonProperty("goals_scored")
    public Integer getGoalsScored() {
        return goalsScored;
    }

    @JsonProperty("goals_scored")
    public void setGoalsScored(Integer goalsScored) {
        this.goalsScored = goalsScored;
    }

    public Element withGoalsScored(Integer goalsScored) {
        this.goalsScored = goalsScored;
        return this;
    }

    @JsonProperty("assists")
    public Integer getAssists() {
        return assists;
    }

    @JsonProperty("assists")
    public void setAssists(Integer assists) {
        this.assists = assists;
    }

    public Element withAssists(Integer assists) {
        this.assists = assists;
        return this;
    }

    @JsonProperty("clean_sheets")
    public Integer getCleanSheets() {
        return cleanSheets;
    }

    @JsonProperty("clean_sheets")
    public void setCleanSheets(Integer cleanSheets) {
        this.cleanSheets = cleanSheets;
    }

    public Element withCleanSheets(Integer cleanSheets) {
        this.cleanSheets = cleanSheets;
        return this;
    }

    @JsonProperty("goals_conceded")
    public Integer getGoalsConceded() {
        return goalsConceded;
    }

    @JsonProperty("goals_conceded")
    public void setGoalsConceded(Integer goalsConceded) {
        this.goalsConceded = goalsConceded;
    }

    public Element withGoalsConceded(Integer goalsConceded) {
        this.goalsConceded = goalsConceded;
        return this;
    }

    @JsonProperty("own_goals")
    public Integer getOwnGoals() {
        return ownGoals;
    }

    @JsonProperty("own_goals")
    public void setOwnGoals(Integer ownGoals) {
        this.ownGoals = ownGoals;
    }

    public Element withOwnGoals(Integer ownGoals) {
        this.ownGoals = ownGoals;
        return this;
    }

    @JsonProperty("penalties_saved")
    public Integer getPenaltiesSaved() {
        return penaltiesSaved;
    }

    @JsonProperty("penalties_saved")
    public void setPenaltiesSaved(Integer penaltiesSaved) {
        this.penaltiesSaved = penaltiesSaved;
    }

    public Element withPenaltiesSaved(Integer penaltiesSaved) {
        this.penaltiesSaved = penaltiesSaved;
        return this;
    }

    @JsonProperty("penalties_missed")
    public Integer getPenaltiesMissed() {
        return penaltiesMissed;
    }

    @JsonProperty("penalties_missed")
    public void setPenaltiesMissed(Integer penaltiesMissed) {
        this.penaltiesMissed = penaltiesMissed;
    }

    public Element withPenaltiesMissed(Integer penaltiesMissed) {
        this.penaltiesMissed = penaltiesMissed;
        return this;
    }

    @JsonProperty("yellow_cards")
    public Integer getYellowCards() {
        return yellowCards;
    }

    @JsonProperty("yellow_cards")
    public void setYellowCards(Integer yellowCards) {
        this.yellowCards = yellowCards;
    }

    public Element withYellowCards(Integer yellowCards) {
        this.yellowCards = yellowCards;
        return this;
    }

    @JsonProperty("red_cards")
    public Integer getRedCards() {
        return redCards;
    }

    @JsonProperty("red_cards")
    public void setRedCards(Integer redCards) {
        this.redCards = redCards;
    }

    public Element withRedCards(Integer redCards) {
        this.redCards = redCards;
        return this;
    }

    @JsonProperty("saves")
    public Integer getSaves() {
        return saves;
    }

    @JsonProperty("saves")
    public void setSaves(Integer saves) {
        this.saves = saves;
    }

    public Element withSaves(Integer saves) {
        this.saves = saves;
        return this;
    }

    @JsonProperty("bonus")
    public Integer getBonus() {
        return bonus;
    }

    @JsonProperty("bonus")
    public void setBonus(Integer bonus) {
        this.bonus = bonus;
    }

    public Element withBonus(Integer bonus) {
        this.bonus = bonus;
        return this;
    }

    @JsonProperty("bps")
    public Integer getBps() {
        return bps;
    }

    @JsonProperty("bps")
    public void setBps(Integer bps) {
        this.bps = bps;
    }

    public Element withBps(Integer bps) {
        this.bps = bps;
        return this;
    }

    @JsonProperty("influence")
    public String getInfluence() {
        return influence;
    }

    @JsonProperty("influence")
    public void setInfluence(String influence) {
        this.influence = influence;
    }

    public Element withInfluence(String influence) {
        this.influence = influence;
        return this;
    }

    @JsonProperty("creativity")
    public String getCreativity() {
        return creativity;
    }

    @JsonProperty("creativity")
    public void setCreativity(String creativity) {
        this.creativity = creativity;
    }

    public Element withCreativity(String creativity) {
        this.creativity = creativity;
        return this;
    }

    @JsonProperty("threat")
    public String getThreat() {
        return threat;
    }

    @JsonProperty("threat")
    public void setThreat(String threat) {
        this.threat = threat;
    }

    public Element withThreat(String threat) {
        this.threat = threat;
        return this;
    }

    @JsonProperty("ict_index")
    public String getIctIndex() {
        return ictIndex;
    }

    @JsonProperty("ict_index")
    public void setIctIndex(String ictIndex) {
        this.ictIndex = ictIndex;
    }

    public Element withIctIndex(String ictIndex) {
        this.ictIndex = ictIndex;
        return this;
    }

    @JsonProperty("influence_rank")
    public Integer getInfluenceRank() {
        return influenceRank;
    }

    @JsonProperty("influence_rank")
    public void setInfluenceRank(Integer influenceRank) {
        this.influenceRank = influenceRank;
    }

    public Element withInfluenceRank(Integer influenceRank) {
        this.influenceRank = influenceRank;
        return this;
    }

    @JsonProperty("influence_rank_type")
    public Integer getInfluenceRankType() {
        return influenceRankType;
    }

    @JsonProperty("influence_rank_type")
    public void setInfluenceRankType(Integer influenceRankType) {
        this.influenceRankType = influenceRankType;
    }

    public Element withInfluenceRankType(Integer influenceRankType) {
        this.influenceRankType = influenceRankType;
        return this;
    }

    @JsonProperty("creativity_rank")
    public Integer getCreativityRank() {
        return creativityRank;
    }

    @JsonProperty("creativity_rank")
    public void setCreativityRank(Integer creativityRank) {
        this.creativityRank = creativityRank;
    }

    public Element withCreativityRank(Integer creativityRank) {
        this.creativityRank = creativityRank;
        return this;
    }

    @JsonProperty("creativity_rank_type")
    public Integer getCreativityRankType() {
        return creativityRankType;
    }

    @JsonProperty("creativity_rank_type")
    public void setCreativityRankType(Integer creativityRankType) {
        this.creativityRankType = creativityRankType;
    }

    public Element withCreativityRankType(Integer creativityRankType) {
        this.creativityRankType = creativityRankType;
        return this;
    }

    @JsonProperty("threat_rank")
    public Integer getThreatRank() {
        return threatRank;
    }

    @JsonProperty("threat_rank")
    public void setThreatRank(Integer threatRank) {
        this.threatRank = threatRank;
    }

    public Element withThreatRank(Integer threatRank) {
        this.threatRank = threatRank;
        return this;
    }

    @JsonProperty("threat_rank_type")
    public Integer getThreatRankType() {
        return threatRankType;
    }

    @JsonProperty("threat_rank_type")
    public void setThreatRankType(Integer threatRankType) {
        this.threatRankType = threatRankType;
    }

    public Element withThreatRankType(Integer threatRankType) {
        this.threatRankType = threatRankType;
        return this;
    }

    @JsonProperty("ict_index_rank")
    public Integer getIctIndexRank() {
        return ictIndexRank;
    }

    @JsonProperty("ict_index_rank")
    public void setIctIndexRank(Integer ictIndexRank) {
        this.ictIndexRank = ictIndexRank;
    }

    public Element withIctIndexRank(Integer ictIndexRank) {
        this.ictIndexRank = ictIndexRank;
        return this;
    }

    @JsonProperty("ict_index_rank_type")
    public Integer getIctIndexRankType() {
        return ictIndexRankType;
    }

    @JsonProperty("ict_index_rank_type")
    public void setIctIndexRankType(Integer ictIndexRankType) {
        this.ictIndexRankType = ictIndexRankType;
    }

    public Element withIctIndexRankType(Integer ictIndexRankType) {
        this.ictIndexRankType = ictIndexRankType;
        return this;
    }

    @JsonProperty("corners_and_indirect_freekicks_order")
    public Object getCornersAndIndirectFreekicksOrder() {
        return cornersAndIndirectFreekicksOrder;
    }

    @JsonProperty("corners_and_indirect_freekicks_order")
    public void setCornersAndIndirectFreekicksOrder(Object cornersAndIndirectFreekicksOrder) {
        this.cornersAndIndirectFreekicksOrder = cornersAndIndirectFreekicksOrder;
    }

    public Element withCornersAndIndirectFreekicksOrder(Object cornersAndIndirectFreekicksOrder) {
        this.cornersAndIndirectFreekicksOrder = cornersAndIndirectFreekicksOrder;
        return this;
    }

    @JsonProperty("corners_and_indirect_freekicks_text")
    public String getCornersAndIndirectFreekicksText() {
        return cornersAndIndirectFreekicksText;
    }

    @JsonProperty("corners_and_indirect_freekicks_text")
    public void setCornersAndIndirectFreekicksText(String cornersAndIndirectFreekicksText) {
        this.cornersAndIndirectFreekicksText = cornersAndIndirectFreekicksText;
    }

    public Element withCornersAndIndirectFreekicksText(String cornersAndIndirectFreekicksText) {
        this.cornersAndIndirectFreekicksText = cornersAndIndirectFreekicksText;
        return this;
    }

    @JsonProperty("direct_freekicks_order")
    public Object getDirectFreekicksOrder() {
        return directFreekicksOrder;
    }

    @JsonProperty("direct_freekicks_order")
    public void setDirectFreekicksOrder(Object directFreekicksOrder) {
        this.directFreekicksOrder = directFreekicksOrder;
    }

    public Element withDirectFreekicksOrder(Object directFreekicksOrder) {
        this.directFreekicksOrder = directFreekicksOrder;
        return this;
    }

    @JsonProperty("direct_freekicks_text")
    public String getDirectFreekicksText() {
        return directFreekicksText;
    }

    @JsonProperty("direct_freekicks_text")
    public void setDirectFreekicksText(String directFreekicksText) {
        this.directFreekicksText = directFreekicksText;
    }

    public Element withDirectFreekicksText(String directFreekicksText) {
        this.directFreekicksText = directFreekicksText;
        return this;
    }

    @JsonProperty("penalties_order")
    public Object getPenaltiesOrder() {
        return penaltiesOrder;
    }

    @JsonProperty("penalties_order")
    public void setPenaltiesOrder(Object penaltiesOrder) {
        this.penaltiesOrder = penaltiesOrder;
    }

    public Element withPenaltiesOrder(Object penaltiesOrder) {
        this.penaltiesOrder = penaltiesOrder;
        return this;
    }

    @JsonProperty("penalties_text")
    public String getPenaltiesText() {
        return penaltiesText;
    }

    @JsonProperty("penalties_text")
    public void setPenaltiesText(String penaltiesText) {
        this.penaltiesText = penaltiesText;
    }

    public Element withPenaltiesText(String penaltiesText) {
        this.penaltiesText = penaltiesText;
        return this;
    }

    @JsonProperty("now_cost_rank")
    public Integer getNowCostRank() {
        return nowCostRank;
    }

    @JsonProperty("now_cost_rank")
    public void setNowCostRank(Integer nowCostRank) {
        this.nowCostRank = nowCostRank;
    }

    public Element withNowCostRank(Integer nowCostRank) {
        this.nowCostRank = nowCostRank;
        return this;
    }

    @JsonProperty("now_cost_rank_type")
    public Integer getNowCostRankType() {
        return nowCostRankType;
    }

    @JsonProperty("now_cost_rank_type")
    public void setNowCostRankType(Integer nowCostRankType) {
        this.nowCostRankType = nowCostRankType;
    }

    public Element withNowCostRankType(Integer nowCostRankType) {
        this.nowCostRankType = nowCostRankType;
        return this;
    }

    @JsonProperty("form_rank")
    public Integer getFormRank() {
        return formRank;
    }

    @JsonProperty("form_rank")
    public void setFormRank(Integer formRank) {
        this.formRank = formRank;
    }

    public Element withFormRank(Integer formRank) {
        this.formRank = formRank;
        return this;
    }

    @JsonProperty("form_rank_type")
    public Integer getFormRankType() {
        return formRankType;
    }

    @JsonProperty("form_rank_type")
    public void setFormRankType(Integer formRankType) {
        this.formRankType = formRankType;
    }

    public Element withFormRankType(Integer formRankType) {
        this.formRankType = formRankType;
        return this;
    }

    @JsonProperty("points_per_game_rank")
    public Integer getPointsPerGameRank() {
        return pointsPerGameRank;
    }

    @JsonProperty("points_per_game_rank")
    public void setPointsPerGameRank(Integer pointsPerGameRank) {
        this.pointsPerGameRank = pointsPerGameRank;
    }

    public Element withPointsPerGameRank(Integer pointsPerGameRank) {
        this.pointsPerGameRank = pointsPerGameRank;
        return this;
    }

    @JsonProperty("points_per_game_rank_type")
    public Integer getPointsPerGameRankType() {
        return pointsPerGameRankType;
    }

    @JsonProperty("points_per_game_rank_type")
    public void setPointsPerGameRankType(Integer pointsPerGameRankType) {
        this.pointsPerGameRankType = pointsPerGameRankType;
    }

    public Element withPointsPerGameRankType(Integer pointsPerGameRankType) {
        this.pointsPerGameRankType = pointsPerGameRankType;
        return this;
    }

    @JsonProperty("selected_rank")
    public Integer getSelectedRank() {
        return selectedRank;
    }

    @JsonProperty("selected_rank")
    public void setSelectedRank(Integer selectedRank) {
        this.selectedRank = selectedRank;
    }

    public Element withSelectedRank(Integer selectedRank) {
        this.selectedRank = selectedRank;
        return this;
    }

    @JsonProperty("selected_rank_type")
    public Integer getSelectedRankType() {
        return selectedRankType;
    }

    @JsonProperty("selected_rank_type")
    public void setSelectedRankType(Integer selectedRankType) {
        this.selectedRankType = selectedRankType;
    }

    public Element withSelectedRankType(Integer selectedRankType) {
        this.selectedRankType = selectedRankType;
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

    public Element withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Element.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("chanceOfPlayingNextRound");
        sb.append('=');
        sb.append(((this.chanceOfPlayingNextRound == null)?"<null>":this.chanceOfPlayingNextRound));
        sb.append(',');
        sb.append("chanceOfPlayingThisRound");
        sb.append('=');
        sb.append(((this.chanceOfPlayingThisRound == null)?"<null>":this.chanceOfPlayingThisRound));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("costChangeEvent");
        sb.append('=');
        sb.append(((this.costChangeEvent == null)?"<null>":this.costChangeEvent));
        sb.append(',');
        sb.append("costChangeEventFall");
        sb.append('=');
        sb.append(((this.costChangeEventFall == null)?"<null>":this.costChangeEventFall));
        sb.append(',');
        sb.append("costChangeStart");
        sb.append('=');
        sb.append(((this.costChangeStart == null)?"<null>":this.costChangeStart));
        sb.append(',');
        sb.append("costChangeStartFall");
        sb.append('=');
        sb.append(((this.costChangeStartFall == null)?"<null>":this.costChangeStartFall));
        sb.append(',');
        sb.append("dreamteamCount");
        sb.append('=');
        sb.append(((this.dreamteamCount == null)?"<null>":this.dreamteamCount));
        sb.append(',');
        sb.append("elementType");
        sb.append('=');
        sb.append(((this.elementType == null)?"<null>":this.elementType));
        sb.append(',');
        sb.append("epNext");
        sb.append('=');
        sb.append(((this.epNext == null)?"<null>":this.epNext));
        sb.append(',');
        sb.append("epThis");
        sb.append('=');
        sb.append(((this.epThis == null)?"<null>":this.epThis));
        sb.append(',');
        sb.append("eventPoints");
        sb.append('=');
        sb.append(((this.eventPoints == null)?"<null>":this.eventPoints));
        sb.append(',');
        sb.append("firstName");
        sb.append('=');
        sb.append(((this.firstName == null)?"<null>":this.firstName));
        sb.append(',');
        sb.append("form");
        sb.append('=');
        sb.append(((this.form == null)?"<null>":this.form));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("inDreamteam");
        sb.append('=');
        sb.append(((this.inDreamteam == null)?"<null>":this.inDreamteam));
        sb.append(',');
        sb.append("news");
        sb.append('=');
        sb.append(((this.news == null)?"<null>":this.news));
        sb.append(',');
        sb.append("newsAdded");
        sb.append('=');
        sb.append(((this.newsAdded == null)?"<null>":this.newsAdded));
        sb.append(',');
        sb.append("nowCost");
        sb.append('=');
        sb.append(((this.nowCost == null)?"<null>":this.nowCost));
        sb.append(',');
        sb.append("photo");
        sb.append('=');
        sb.append(((this.photo == null)?"<null>":this.photo));
        sb.append(',');
        sb.append("pointsPerGame");
        sb.append('=');
        sb.append(((this.pointsPerGame == null)?"<null>":this.pointsPerGame));
        sb.append(',');
        sb.append("secondName");
        sb.append('=');
        sb.append(((this.secondName == null)?"<null>":this.secondName));
        sb.append(',');
        sb.append("selectedByPercent");
        sb.append('=');
        sb.append(((this.selectedByPercent == null)?"<null>":this.selectedByPercent));
        sb.append(',');
        sb.append("special");
        sb.append('=');
        sb.append(((this.special == null)?"<null>":this.special));
        sb.append(',');
        sb.append("squadNumber");
        sb.append('=');
        sb.append(((this.squadNumber == null)?"<null>":this.squadNumber));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("team");
        sb.append('=');
        sb.append(((this.team == null)?"<null>":this.team));
        sb.append(',');
        sb.append("teamCode");
        sb.append('=');
        sb.append(((this.teamCode == null)?"<null>":this.teamCode));
        sb.append(',');
        sb.append("totalPoints");
        sb.append('=');
        sb.append(((this.totalPoints == null)?"<null>":this.totalPoints));
        sb.append(',');
        sb.append("transfersIn");
        sb.append('=');
        sb.append(((this.transfersIn == null)?"<null>":this.transfersIn));
        sb.append(',');
        sb.append("transfersInEvent");
        sb.append('=');
        sb.append(((this.transfersInEvent == null)?"<null>":this.transfersInEvent));
        sb.append(',');
        sb.append("transfersOut");
        sb.append('=');
        sb.append(((this.transfersOut == null)?"<null>":this.transfersOut));
        sb.append(',');
        sb.append("transfersOutEvent");
        sb.append('=');
        sb.append(((this.transfersOutEvent == null)?"<null>":this.transfersOutEvent));
        sb.append(',');
        sb.append("valueForm");
        sb.append('=');
        sb.append(((this.valueForm == null)?"<null>":this.valueForm));
        sb.append(',');
        sb.append("valueSeason");
        sb.append('=');
        sb.append(((this.valueSeason == null)?"<null>":this.valueSeason));
        sb.append(',');
        sb.append("webName");
        sb.append('=');
        sb.append(((this.webName == null)?"<null>":this.webName));
        sb.append(',');
        sb.append("minutes");
        sb.append('=');
        sb.append(((this.minutes == null)?"<null>":this.minutes));
        sb.append(',');
        sb.append("goalsScored");
        sb.append('=');
        sb.append(((this.goalsScored == null)?"<null>":this.goalsScored));
        sb.append(',');
        sb.append("assists");
        sb.append('=');
        sb.append(((this.assists == null)?"<null>":this.assists));
        sb.append(',');
        sb.append("cleanSheets");
        sb.append('=');
        sb.append(((this.cleanSheets == null)?"<null>":this.cleanSheets));
        sb.append(',');
        sb.append("goalsConceded");
        sb.append('=');
        sb.append(((this.goalsConceded == null)?"<null>":this.goalsConceded));
        sb.append(',');
        sb.append("ownGoals");
        sb.append('=');
        sb.append(((this.ownGoals == null)?"<null>":this.ownGoals));
        sb.append(',');
        sb.append("penaltiesSaved");
        sb.append('=');
        sb.append(((this.penaltiesSaved == null)?"<null>":this.penaltiesSaved));
        sb.append(',');
        sb.append("penaltiesMissed");
        sb.append('=');
        sb.append(((this.penaltiesMissed == null)?"<null>":this.penaltiesMissed));
        sb.append(',');
        sb.append("yellowCards");
        sb.append('=');
        sb.append(((this.yellowCards == null)?"<null>":this.yellowCards));
        sb.append(',');
        sb.append("redCards");
        sb.append('=');
        sb.append(((this.redCards == null)?"<null>":this.redCards));
        sb.append(',');
        sb.append("saves");
        sb.append('=');
        sb.append(((this.saves == null)?"<null>":this.saves));
        sb.append(',');
        sb.append("bonus");
        sb.append('=');
        sb.append(((this.bonus == null)?"<null>":this.bonus));
        sb.append(',');
        sb.append("bps");
        sb.append('=');
        sb.append(((this.bps == null)?"<null>":this.bps));
        sb.append(',');
        sb.append("influence");
        sb.append('=');
        sb.append(((this.influence == null)?"<null>":this.influence));
        sb.append(',');
        sb.append("creativity");
        sb.append('=');
        sb.append(((this.creativity == null)?"<null>":this.creativity));
        sb.append(',');
        sb.append("threat");
        sb.append('=');
        sb.append(((this.threat == null)?"<null>":this.threat));
        sb.append(',');
        sb.append("ictIndex");
        sb.append('=');
        sb.append(((this.ictIndex == null)?"<null>":this.ictIndex));
        sb.append(',');
        sb.append("influenceRank");
        sb.append('=');
        sb.append(((this.influenceRank == null)?"<null>":this.influenceRank));
        sb.append(',');
        sb.append("influenceRankType");
        sb.append('=');
        sb.append(((this.influenceRankType == null)?"<null>":this.influenceRankType));
        sb.append(',');
        sb.append("creativityRank");
        sb.append('=');
        sb.append(((this.creativityRank == null)?"<null>":this.creativityRank));
        sb.append(',');
        sb.append("creativityRankType");
        sb.append('=');
        sb.append(((this.creativityRankType == null)?"<null>":this.creativityRankType));
        sb.append(',');
        sb.append("threatRank");
        sb.append('=');
        sb.append(((this.threatRank == null)?"<null>":this.threatRank));
        sb.append(',');
        sb.append("threatRankType");
        sb.append('=');
        sb.append(((this.threatRankType == null)?"<null>":this.threatRankType));
        sb.append(',');
        sb.append("ictIndexRank");
        sb.append('=');
        sb.append(((this.ictIndexRank == null)?"<null>":this.ictIndexRank));
        sb.append(',');
        sb.append("ictIndexRankType");
        sb.append('=');
        sb.append(((this.ictIndexRankType == null)?"<null>":this.ictIndexRankType));
        sb.append(',');
        sb.append("cornersAndIndirectFreekicksOrder");
        sb.append('=');
        sb.append(((this.cornersAndIndirectFreekicksOrder == null)?"<null>":this.cornersAndIndirectFreekicksOrder));
        sb.append(',');
        sb.append("cornersAndIndirectFreekicksText");
        sb.append('=');
        sb.append(((this.cornersAndIndirectFreekicksText == null)?"<null>":this.cornersAndIndirectFreekicksText));
        sb.append(',');
        sb.append("directFreekicksOrder");
        sb.append('=');
        sb.append(((this.directFreekicksOrder == null)?"<null>":this.directFreekicksOrder));
        sb.append(',');
        sb.append("directFreekicksText");
        sb.append('=');
        sb.append(((this.directFreekicksText == null)?"<null>":this.directFreekicksText));
        sb.append(',');
        sb.append("penaltiesOrder");
        sb.append('=');
        sb.append(((this.penaltiesOrder == null)?"<null>":this.penaltiesOrder));
        sb.append(',');
        sb.append("penaltiesText");
        sb.append('=');
        sb.append(((this.penaltiesText == null)?"<null>":this.penaltiesText));
        sb.append(',');
        sb.append("nowCostRank");
        sb.append('=');
        sb.append(((this.nowCostRank == null)?"<null>":this.nowCostRank));
        sb.append(',');
        sb.append("nowCostRankType");
        sb.append('=');
        sb.append(((this.nowCostRankType == null)?"<null>":this.nowCostRankType));
        sb.append(',');
        sb.append("formRank");
        sb.append('=');
        sb.append(((this.formRank == null)?"<null>":this.formRank));
        sb.append(',');
        sb.append("formRankType");
        sb.append('=');
        sb.append(((this.formRankType == null)?"<null>":this.formRankType));
        sb.append(',');
        sb.append("pointsPerGameRank");
        sb.append('=');
        sb.append(((this.pointsPerGameRank == null)?"<null>":this.pointsPerGameRank));
        sb.append(',');
        sb.append("pointsPerGameRankType");
        sb.append('=');
        sb.append(((this.pointsPerGameRankType == null)?"<null>":this.pointsPerGameRankType));
        sb.append(',');
        sb.append("selectedRank");
        sb.append('=');
        sb.append(((this.selectedRank == null)?"<null>":this.selectedRank));
        sb.append(',');
        sb.append("selectedRankType");
        sb.append('=');
        sb.append(((this.selectedRankType == null)?"<null>":this.selectedRankType));
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
        result = ((result* 31)+((this.valueForm == null)? 0 :this.valueForm.hashCode()));
        result = ((result* 31)+((this.directFreekicksOrder == null)? 0 :this.directFreekicksOrder.hashCode()));
        result = ((result* 31)+((this.penaltiesSaved == null)? 0 :this.penaltiesSaved.hashCode()));
        result = ((result* 31)+((this.costChangeEvent == null)? 0 :this.costChangeEvent.hashCode()));
        result = ((result* 31)+((this.influenceRankType == null)? 0 :this.influenceRankType.hashCode()));
        result = ((result* 31)+((this.bonus == null)? 0 :this.bonus.hashCode()));
        result = ((result* 31)+((this.costChangeStart == null)? 0 :this.costChangeStart.hashCode()));
        result = ((result* 31)+((this.chanceOfPlayingThisRound == null)? 0 :this.chanceOfPlayingThisRound.hashCode()));
        result = ((result* 31)+((this.transfersOut == null)? 0 :this.transfersOut.hashCode()));
        result = ((result* 31)+((this.formRankType == null)? 0 :this.formRankType.hashCode()));
        result = ((result* 31)+((this.selectedRank == null)? 0 :this.selectedRank.hashCode()));
        result = ((result* 31)+((this.costChangeEventFall == null)? 0 :this.costChangeEventFall.hashCode()));
        result = ((result* 31)+((this.goalsScored == null)? 0 :this.goalsScored.hashCode()));
        result = ((result* 31)+((this.valueSeason == null)? 0 :this.valueSeason.hashCode()));
        result = ((result* 31)+((this.influence == null)? 0 :this.influence.hashCode()));
        result = ((result* 31)+((this.cornersAndIndirectFreekicksOrder == null)? 0 :this.cornersAndIndirectFreekicksOrder.hashCode()));
        result = ((result* 31)+((this.pointsPerGameRankType == null)? 0 :this.pointsPerGameRankType.hashCode()));
        result = ((result* 31)+((this.saves == null)? 0 :this.saves.hashCode()));
        result = ((result* 31)+((this.epNext == null)? 0 :this.epNext.hashCode()));
        result = ((result* 31)+((this.penaltiesOrder == null)? 0 :this.penaltiesOrder.hashCode()));
        result = ((result* 31)+((this.webName == null)? 0 :this.webName.hashCode()));
        result = ((result* 31)+((this.penaltiesText == null)? 0 :this.penaltiesText.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.cornersAndIndirectFreekicksText == null)? 0 :this.cornersAndIndirectFreekicksText.hashCode()));
        result = ((result* 31)+((this.creativity == null)? 0 :this.creativity.hashCode()));
        result = ((result* 31)+((this.ictIndexRankType == null)? 0 :this.ictIndexRankType.hashCode()));
        result = ((result* 31)+((this.influenceRank == null)? 0 :this.influenceRank.hashCode()));
        result = ((result* 31)+((this.chanceOfPlayingNextRound == null)? 0 :this.chanceOfPlayingNextRound.hashCode()));
        result = ((result* 31)+((this.ownGoals == null)? 0 :this.ownGoals.hashCode()));
        result = ((result* 31)+((this.minutes == null)? 0 :this.minutes.hashCode()));
        result = ((result* 31)+((this.newsAdded == null)? 0 :this.newsAdded.hashCode()));
        result = ((result* 31)+((this.cleanSheets == null)? 0 :this.cleanSheets.hashCode()));
        result = ((result* 31)+((this.formRank == null)? 0 :this.formRank.hashCode()));
        result = ((result* 31)+((this.costChangeStartFall == null)? 0 :this.costChangeStartFall.hashCode()));
        result = ((result* 31)+((this.transfersOutEvent == null)? 0 :this.transfersOutEvent.hashCode()));
        result = ((result* 31)+((this.firstName == null)? 0 :this.firstName.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        result = ((result* 31)+((this.ictIndexRank == null)? 0 :this.ictIndexRank.hashCode()));
        result = ((result* 31)+((this.pointsPerGameRank == null)? 0 :this.pointsPerGameRank.hashCode()));
        result = ((result* 31)+((this.selectedRankType == null)? 0 :this.selectedRankType.hashCode()));
        result = ((result* 31)+((this.epThis == null)? 0 :this.epThis.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.threatRankType == null)? 0 :this.threatRankType.hashCode()));
        result = ((result* 31)+((this.selectedByPercent == null)? 0 :this.selectedByPercent.hashCode()));
        result = ((result* 31)+((this.goalsConceded == null)? 0 :this.goalsConceded.hashCode()));
        result = ((result* 31)+((this.directFreekicksText == null)? 0 :this.directFreekicksText.hashCode()));
        result = ((result* 31)+((this.nowCost == null)? 0 :this.nowCost.hashCode()));
        result = ((result* 31)+((this.squadNumber == null)? 0 :this.squadNumber.hashCode()));
        result = ((result* 31)+((this.redCards == null)? 0 :this.redCards.hashCode()));
        result = ((result* 31)+((this.assists == null)? 0 :this.assists.hashCode()));
        result = ((result* 31)+((this.ictIndex == null)? 0 :this.ictIndex.hashCode()));
        result = ((result* 31)+((this.threatRank == null)? 0 :this.threatRank.hashCode()));
        result = ((result* 31)+((this.inDreamteam == null)? 0 :this.inDreamteam.hashCode()));
        result = ((result* 31)+((this.pointsPerGame == null)? 0 :this.pointsPerGame.hashCode()));
        result = ((result* 31)+((this.secondName == null)? 0 :this.secondName.hashCode()));
        result = ((result* 31)+((this.news == null)? 0 :this.news.hashCode()));
        result = ((result* 31)+((this.eventPoints == null)? 0 :this.eventPoints.hashCode()));
        result = ((result* 31)+((this.bps == null)? 0 :this.bps.hashCode()));
        result = ((result* 31)+((this.transfersInEvent == null)? 0 :this.transfersInEvent.hashCode()));
        result = ((result* 31)+((this.photo == null)? 0 :this.photo.hashCode()));
        result = ((result* 31)+((this.teamCode == null)? 0 :this.teamCode.hashCode()));
        result = ((result* 31)+((this.transfersIn == null)? 0 :this.transfersIn.hashCode()));
        result = ((result* 31)+((this.team == null)? 0 :this.team.hashCode()));
        result = ((result* 31)+((this.creativityRank == null)? 0 :this.creativityRank.hashCode()));
        result = ((result* 31)+((this.special == null)? 0 :this.special.hashCode()));
        result = ((result* 31)+((this.form == null)? 0 :this.form.hashCode()));
        result = ((result* 31)+((this.nowCostRankType == null)? 0 :this.nowCostRankType.hashCode()));
        result = ((result* 31)+((this.dreamteamCount == null)? 0 :this.dreamteamCount.hashCode()));
        result = ((result* 31)+((this.penaltiesMissed == null)? 0 :this.penaltiesMissed.hashCode()));
        result = ((result* 31)+((this.creativityRankType == null)? 0 :this.creativityRankType.hashCode()));
        result = ((result* 31)+((this.totalPoints == null)? 0 :this.totalPoints.hashCode()));
        result = ((result* 31)+((this.nowCostRank == null)? 0 :this.nowCostRank.hashCode()));
        result = ((result* 31)+((this.threat == null)? 0 :this.threat.hashCode()));
        result = ((result* 31)+((this.elementType == null)? 0 :this.elementType.hashCode()));
        result = ((result* 31)+((this.yellowCards == null)? 0 :this.yellowCards.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Element) == false) {
            return false;
        }
        Element rhs = ((Element) other);
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.valueForm == rhs.valueForm)||((this.valueForm!= null)&&this.valueForm.equals(rhs.valueForm)))&&((this.directFreekicksOrder == rhs.directFreekicksOrder)||((this.directFreekicksOrder!= null)&&this.directFreekicksOrder.equals(rhs.directFreekicksOrder))))&&((this.penaltiesSaved == rhs.penaltiesSaved)||((this.penaltiesSaved!= null)&&this.penaltiesSaved.equals(rhs.penaltiesSaved))))&&((this.costChangeEvent == rhs.costChangeEvent)||((this.costChangeEvent!= null)&&this.costChangeEvent.equals(rhs.costChangeEvent))))&&((this.influenceRankType == rhs.influenceRankType)||((this.influenceRankType!= null)&&this.influenceRankType.equals(rhs.influenceRankType))))&&((this.bonus == rhs.bonus)||((this.bonus!= null)&&this.bonus.equals(rhs.bonus))))&&((this.costChangeStart == rhs.costChangeStart)||((this.costChangeStart!= null)&&this.costChangeStart.equals(rhs.costChangeStart))))&&((this.chanceOfPlayingThisRound == rhs.chanceOfPlayingThisRound)||((this.chanceOfPlayingThisRound!= null)&&this.chanceOfPlayingThisRound.equals(rhs.chanceOfPlayingThisRound))))&&((this.transfersOut == rhs.transfersOut)||((this.transfersOut!= null)&&this.transfersOut.equals(rhs.transfersOut))))&&((this.formRankType == rhs.formRankType)||((this.formRankType!= null)&&this.formRankType.equals(rhs.formRankType))))&&((this.selectedRank == rhs.selectedRank)||((this.selectedRank!= null)&&this.selectedRank.equals(rhs.selectedRank))))&&((this.costChangeEventFall == rhs.costChangeEventFall)||((this.costChangeEventFall!= null)&&this.costChangeEventFall.equals(rhs.costChangeEventFall))))&&((this.goalsScored == rhs.goalsScored)||((this.goalsScored!= null)&&this.goalsScored.equals(rhs.goalsScored))))&&((this.valueSeason == rhs.valueSeason)||((this.valueSeason!= null)&&this.valueSeason.equals(rhs.valueSeason))))&&((this.influence == rhs.influence)||((this.influence!= null)&&this.influence.equals(rhs.influence))))&&((this.cornersAndIndirectFreekicksOrder == rhs.cornersAndIndirectFreekicksOrder)||((this.cornersAndIndirectFreekicksOrder!= null)&&this.cornersAndIndirectFreekicksOrder.equals(rhs.cornersAndIndirectFreekicksOrder))))&&((this.pointsPerGameRankType == rhs.pointsPerGameRankType)||((this.pointsPerGameRankType!= null)&&this.pointsPerGameRankType.equals(rhs.pointsPerGameRankType))))&&((this.saves == rhs.saves)||((this.saves!= null)&&this.saves.equals(rhs.saves))))&&((this.epNext == rhs.epNext)||((this.epNext!= null)&&this.epNext.equals(rhs.epNext))))&&((this.penaltiesOrder == rhs.penaltiesOrder)||((this.penaltiesOrder!= null)&&this.penaltiesOrder.equals(rhs.penaltiesOrder))))&&((this.webName == rhs.webName)||((this.webName!= null)&&this.webName.equals(rhs.webName))))&&((this.penaltiesText == rhs.penaltiesText)||((this.penaltiesText!= null)&&this.penaltiesText.equals(rhs.penaltiesText))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.cornersAndIndirectFreekicksText == rhs.cornersAndIndirectFreekicksText)||((this.cornersAndIndirectFreekicksText!= null)&&this.cornersAndIndirectFreekicksText.equals(rhs.cornersAndIndirectFreekicksText))))&&((this.creativity == rhs.creativity)||((this.creativity!= null)&&this.creativity.equals(rhs.creativity))))&&((this.ictIndexRankType == rhs.ictIndexRankType)||((this.ictIndexRankType!= null)&&this.ictIndexRankType.equals(rhs.ictIndexRankType))))&&((this.influenceRank == rhs.influenceRank)||((this.influenceRank!= null)&&this.influenceRank.equals(rhs.influenceRank))))&&((this.chanceOfPlayingNextRound == rhs.chanceOfPlayingNextRound)||((this.chanceOfPlayingNextRound!= null)&&this.chanceOfPlayingNextRound.equals(rhs.chanceOfPlayingNextRound))))&&((this.ownGoals == rhs.ownGoals)||((this.ownGoals!= null)&&this.ownGoals.equals(rhs.ownGoals))))&&((this.minutes == rhs.minutes)||((this.minutes!= null)&&this.minutes.equals(rhs.minutes))))&&((this.newsAdded == rhs.newsAdded)||((this.newsAdded!= null)&&this.newsAdded.equals(rhs.newsAdded))))&&((this.cleanSheets == rhs.cleanSheets)||((this.cleanSheets!= null)&&this.cleanSheets.equals(rhs.cleanSheets))))&&((this.formRank == rhs.formRank)||((this.formRank!= null)&&this.formRank.equals(rhs.formRank))))&&((this.costChangeStartFall == rhs.costChangeStartFall)||((this.costChangeStartFall!= null)&&this.costChangeStartFall.equals(rhs.costChangeStartFall))))&&((this.transfersOutEvent == rhs.transfersOutEvent)||((this.transfersOutEvent!= null)&&this.transfersOutEvent.equals(rhs.transfersOutEvent))))&&((this.firstName == rhs.firstName)||((this.firstName!= null)&&this.firstName.equals(rhs.firstName))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))))&&((this.ictIndexRank == rhs.ictIndexRank)||((this.ictIndexRank!= null)&&this.ictIndexRank.equals(rhs.ictIndexRank))))&&((this.pointsPerGameRank == rhs.pointsPerGameRank)||((this.pointsPerGameRank!= null)&&this.pointsPerGameRank.equals(rhs.pointsPerGameRank))))&&((this.selectedRankType == rhs.selectedRankType)||((this.selectedRankType!= null)&&this.selectedRankType.equals(rhs.selectedRankType))))&&((this.epThis == rhs.epThis)||((this.epThis!= null)&&this.epThis.equals(rhs.epThis))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.threatRankType == rhs.threatRankType)||((this.threatRankType!= null)&&this.threatRankType.equals(rhs.threatRankType))))&&((this.selectedByPercent == rhs.selectedByPercent)||((this.selectedByPercent!= null)&&this.selectedByPercent.equals(rhs.selectedByPercent))))&&((this.goalsConceded == rhs.goalsConceded)||((this.goalsConceded!= null)&&this.goalsConceded.equals(rhs.goalsConceded))))&&((this.directFreekicksText == rhs.directFreekicksText)||((this.directFreekicksText!= null)&&this.directFreekicksText.equals(rhs.directFreekicksText))))&&((this.nowCost == rhs.nowCost)||((this.nowCost!= null)&&this.nowCost.equals(rhs.nowCost))))&&((this.squadNumber == rhs.squadNumber)||((this.squadNumber!= null)&&this.squadNumber.equals(rhs.squadNumber))))&&((this.redCards == rhs.redCards)||((this.redCards!= null)&&this.redCards.equals(rhs.redCards))))&&((this.assists == rhs.assists)||((this.assists!= null)&&this.assists.equals(rhs.assists))))&&((this.ictIndex == rhs.ictIndex)||((this.ictIndex!= null)&&this.ictIndex.equals(rhs.ictIndex))))&&((this.threatRank == rhs.threatRank)||((this.threatRank!= null)&&this.threatRank.equals(rhs.threatRank))))&&((this.inDreamteam == rhs.inDreamteam)||((this.inDreamteam!= null)&&this.inDreamteam.equals(rhs.inDreamteam))))&&((this.pointsPerGame == rhs.pointsPerGame)||((this.pointsPerGame!= null)&&this.pointsPerGame.equals(rhs.pointsPerGame))))&&((this.secondName == rhs.secondName)||((this.secondName!= null)&&this.secondName.equals(rhs.secondName))))&&((this.news == rhs.news)||((this.news!= null)&&this.news.equals(rhs.news))))&&((this.eventPoints == rhs.eventPoints)||((this.eventPoints!= null)&&this.eventPoints.equals(rhs.eventPoints))))&&((this.bps == rhs.bps)||((this.bps!= null)&&this.bps.equals(rhs.bps))))&&((this.transfersInEvent == rhs.transfersInEvent)||((this.transfersInEvent!= null)&&this.transfersInEvent.equals(rhs.transfersInEvent))))&&((this.photo == rhs.photo)||((this.photo!= null)&&this.photo.equals(rhs.photo))))&&((this.teamCode == rhs.teamCode)||((this.teamCode!= null)&&this.teamCode.equals(rhs.teamCode))))&&((this.transfersIn == rhs.transfersIn)||((this.transfersIn!= null)&&this.transfersIn.equals(rhs.transfersIn))))&&((this.team == rhs.team)||((this.team!= null)&&this.team.equals(rhs.team))))&&((this.creativityRank == rhs.creativityRank)||((this.creativityRank!= null)&&this.creativityRank.equals(rhs.creativityRank))))&&((this.special == rhs.special)||((this.special!= null)&&this.special.equals(rhs.special))))&&((this.form == rhs.form)||((this.form!= null)&&this.form.equals(rhs.form))))&&((this.nowCostRankType == rhs.nowCostRankType)||((this.nowCostRankType!= null)&&this.nowCostRankType.equals(rhs.nowCostRankType))))&&((this.dreamteamCount == rhs.dreamteamCount)||((this.dreamteamCount!= null)&&this.dreamteamCount.equals(rhs.dreamteamCount))))&&((this.penaltiesMissed == rhs.penaltiesMissed)||((this.penaltiesMissed!= null)&&this.penaltiesMissed.equals(rhs.penaltiesMissed))))&&((this.creativityRankType == rhs.creativityRankType)||((this.creativityRankType!= null)&&this.creativityRankType.equals(rhs.creativityRankType))))&&((this.totalPoints == rhs.totalPoints)||((this.totalPoints!= null)&&this.totalPoints.equals(rhs.totalPoints))))&&((this.nowCostRank == rhs.nowCostRank)||((this.nowCostRank!= null)&&this.nowCostRank.equals(rhs.nowCostRank))))&&((this.threat == rhs.threat)||((this.threat!= null)&&this.threat.equals(rhs.threat))))&&((this.elementType == rhs.elementType)||((this.elementType!= null)&&this.elementType.equals(rhs.elementType))))&&((this.yellowCards == rhs.yellowCards)||((this.yellowCards!= null)&&this.yellowCards.equals(rhs.yellowCards))));
    }

}
