
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
    "league_join_private_max",
    "league_join_public_max",
    "league_max_size_public_classic",
    "league_max_size_public_h2h",
    "league_max_size_private_h2h",
    "league_max_ko_rounds_private_h2h",
    "league_prefix_public",
    "league_points_h2h_win",
    "league_points_h2h_lose",
    "league_points_h2h_draw",
    "league_ko_first_instead_of_random",
    "cup_start_event_id",
    "cup_stop_event_id",
    "cup_qualifying_method",
    "cup_type",
    "squad_squadplay",
    "squad_squadsize",
    "squad_team_limit",
    "squad_total_spend",
    "ui_currency_multiplier",
    "ui_use_special_shirts",
    "ui_special_shirt_exclusions",
    "stats_form_days",
    "sys_vice_captain_enabled",
    "transfers_cap",
    "transfers_sell_on_fee",
    "league_h2h_tiebreak_stats",
    "timezone"
})
@Generated("jsonschema2pojo")
public class GameSettings {

    @JsonProperty("league_join_private_max")
    private Integer leagueJoinPrivateMax;
    @JsonProperty("league_join_public_max")
    private Integer leagueJoinPublicMax;
    @JsonProperty("league_max_size_public_classic")
    private Integer leagueMaxSizePublicClassic;
    @JsonProperty("league_max_size_public_h2h")
    private Integer leagueMaxSizePublicH2h;
    @JsonProperty("league_max_size_private_h2h")
    private Integer leagueMaxSizePrivateH2h;
    @JsonProperty("league_max_ko_rounds_private_h2h")
    private Integer leagueMaxKoRoundsPrivateH2h;
    @JsonProperty("league_prefix_public")
    private String leaguePrefixPublic;
    @JsonProperty("league_points_h2h_win")
    private Integer leaguePointsH2hWin;
    @JsonProperty("league_points_h2h_lose")
    private Integer leaguePointsH2hLose;
    @JsonProperty("league_points_h2h_draw")
    private Integer leaguePointsH2hDraw;
    @JsonProperty("league_ko_first_instead_of_random")
    private Boolean leagueKoFirstInsteadOfRandom;
    @JsonProperty("cup_start_event_id")
    private Object cupStartEventId;
    @JsonProperty("cup_stop_event_id")
    private Object cupStopEventId;
    @JsonProperty("cup_qualifying_method")
    private Object cupQualifyingMethod;
    @JsonProperty("cup_type")
    private Object cupType;
    @JsonProperty("squad_squadplay")
    private Integer squadSquadplay;
    @JsonProperty("squad_squadsize")
    private Integer squadSquadsize;
    @JsonProperty("squad_team_limit")
    private Integer squadTeamLimit;
    @JsonProperty("squad_total_spend")
    private Integer squadTotalSpend;
    @JsonProperty("ui_currency_multiplier")
    private Integer uiCurrencyMultiplier;
    @JsonProperty("ui_use_special_shirts")
    private Boolean uiUseSpecialShirts;
    @JsonProperty("ui_special_shirt_exclusions")
    private List<Object> uiSpecialShirtExclusions = new ArrayList<Object>();
    @JsonProperty("stats_form_days")
    private Integer statsFormDays;
    @JsonProperty("sys_vice_captain_enabled")
    private Boolean sysViceCaptainEnabled;
    @JsonProperty("transfers_cap")
    private Integer transfersCap;
    @JsonProperty("transfers_sell_on_fee")
    private Double transfersSellOnFee;
    @JsonProperty("league_h2h_tiebreak_stats")
    private List<String> leagueH2hTiebreakStats = new ArrayList<String>();
    @JsonProperty("timezone")
    private String timezone;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("league_join_private_max")
    public Integer getLeagueJoinPrivateMax() {
        return leagueJoinPrivateMax;
    }

    @JsonProperty("league_join_private_max")
    public void setLeagueJoinPrivateMax(Integer leagueJoinPrivateMax) {
        this.leagueJoinPrivateMax = leagueJoinPrivateMax;
    }

    public GameSettings withLeagueJoinPrivateMax(Integer leagueJoinPrivateMax) {
        this.leagueJoinPrivateMax = leagueJoinPrivateMax;
        return this;
    }

    @JsonProperty("league_join_public_max")
    public Integer getLeagueJoinPublicMax() {
        return leagueJoinPublicMax;
    }

    @JsonProperty("league_join_public_max")
    public void setLeagueJoinPublicMax(Integer leagueJoinPublicMax) {
        this.leagueJoinPublicMax = leagueJoinPublicMax;
    }

    public GameSettings withLeagueJoinPublicMax(Integer leagueJoinPublicMax) {
        this.leagueJoinPublicMax = leagueJoinPublicMax;
        return this;
    }

    @JsonProperty("league_max_size_public_classic")
    public Integer getLeagueMaxSizePublicClassic() {
        return leagueMaxSizePublicClassic;
    }

    @JsonProperty("league_max_size_public_classic")
    public void setLeagueMaxSizePublicClassic(Integer leagueMaxSizePublicClassic) {
        this.leagueMaxSizePublicClassic = leagueMaxSizePublicClassic;
    }

    public GameSettings withLeagueMaxSizePublicClassic(Integer leagueMaxSizePublicClassic) {
        this.leagueMaxSizePublicClassic = leagueMaxSizePublicClassic;
        return this;
    }

    @JsonProperty("league_max_size_public_h2h")
    public Integer getLeagueMaxSizePublicH2h() {
        return leagueMaxSizePublicH2h;
    }

    @JsonProperty("league_max_size_public_h2h")
    public void setLeagueMaxSizePublicH2h(Integer leagueMaxSizePublicH2h) {
        this.leagueMaxSizePublicH2h = leagueMaxSizePublicH2h;
    }

    public GameSettings withLeagueMaxSizePublicH2h(Integer leagueMaxSizePublicH2h) {
        this.leagueMaxSizePublicH2h = leagueMaxSizePublicH2h;
        return this;
    }

    @JsonProperty("league_max_size_private_h2h")
    public Integer getLeagueMaxSizePrivateH2h() {
        return leagueMaxSizePrivateH2h;
    }

    @JsonProperty("league_max_size_private_h2h")
    public void setLeagueMaxSizePrivateH2h(Integer leagueMaxSizePrivateH2h) {
        this.leagueMaxSizePrivateH2h = leagueMaxSizePrivateH2h;
    }

    public GameSettings withLeagueMaxSizePrivateH2h(Integer leagueMaxSizePrivateH2h) {
        this.leagueMaxSizePrivateH2h = leagueMaxSizePrivateH2h;
        return this;
    }

    @JsonProperty("league_max_ko_rounds_private_h2h")
    public Integer getLeagueMaxKoRoundsPrivateH2h() {
        return leagueMaxKoRoundsPrivateH2h;
    }

    @JsonProperty("league_max_ko_rounds_private_h2h")
    public void setLeagueMaxKoRoundsPrivateH2h(Integer leagueMaxKoRoundsPrivateH2h) {
        this.leagueMaxKoRoundsPrivateH2h = leagueMaxKoRoundsPrivateH2h;
    }

    public GameSettings withLeagueMaxKoRoundsPrivateH2h(Integer leagueMaxKoRoundsPrivateH2h) {
        this.leagueMaxKoRoundsPrivateH2h = leagueMaxKoRoundsPrivateH2h;
        return this;
    }

    @JsonProperty("league_prefix_public")
    public String getLeaguePrefixPublic() {
        return leaguePrefixPublic;
    }

    @JsonProperty("league_prefix_public")
    public void setLeaguePrefixPublic(String leaguePrefixPublic) {
        this.leaguePrefixPublic = leaguePrefixPublic;
    }

    public GameSettings withLeaguePrefixPublic(String leaguePrefixPublic) {
        this.leaguePrefixPublic = leaguePrefixPublic;
        return this;
    }

    @JsonProperty("league_points_h2h_win")
    public Integer getLeaguePointsH2hWin() {
        return leaguePointsH2hWin;
    }

    @JsonProperty("league_points_h2h_win")
    public void setLeaguePointsH2hWin(Integer leaguePointsH2hWin) {
        this.leaguePointsH2hWin = leaguePointsH2hWin;
    }

    public GameSettings withLeaguePointsH2hWin(Integer leaguePointsH2hWin) {
        this.leaguePointsH2hWin = leaguePointsH2hWin;
        return this;
    }

    @JsonProperty("league_points_h2h_lose")
    public Integer getLeaguePointsH2hLose() {
        return leaguePointsH2hLose;
    }

    @JsonProperty("league_points_h2h_lose")
    public void setLeaguePointsH2hLose(Integer leaguePointsH2hLose) {
        this.leaguePointsH2hLose = leaguePointsH2hLose;
    }

    public GameSettings withLeaguePointsH2hLose(Integer leaguePointsH2hLose) {
        this.leaguePointsH2hLose = leaguePointsH2hLose;
        return this;
    }

    @JsonProperty("league_points_h2h_draw")
    public Integer getLeaguePointsH2hDraw() {
        return leaguePointsH2hDraw;
    }

    @JsonProperty("league_points_h2h_draw")
    public void setLeaguePointsH2hDraw(Integer leaguePointsH2hDraw) {
        this.leaguePointsH2hDraw = leaguePointsH2hDraw;
    }

    public GameSettings withLeaguePointsH2hDraw(Integer leaguePointsH2hDraw) {
        this.leaguePointsH2hDraw = leaguePointsH2hDraw;
        return this;
    }

    @JsonProperty("league_ko_first_instead_of_random")
    public Boolean getLeagueKoFirstInsteadOfRandom() {
        return leagueKoFirstInsteadOfRandom;
    }

    @JsonProperty("league_ko_first_instead_of_random")
    public void setLeagueKoFirstInsteadOfRandom(Boolean leagueKoFirstInsteadOfRandom) {
        this.leagueKoFirstInsteadOfRandom = leagueKoFirstInsteadOfRandom;
    }

    public GameSettings withLeagueKoFirstInsteadOfRandom(Boolean leagueKoFirstInsteadOfRandom) {
        this.leagueKoFirstInsteadOfRandom = leagueKoFirstInsteadOfRandom;
        return this;
    }

    @JsonProperty("cup_start_event_id")
    public Object getCupStartEventId() {
        return cupStartEventId;
    }

    @JsonProperty("cup_start_event_id")
    public void setCupStartEventId(Object cupStartEventId) {
        this.cupStartEventId = cupStartEventId;
    }

    public GameSettings withCupStartEventId(Object cupStartEventId) {
        this.cupStartEventId = cupStartEventId;
        return this;
    }

    @JsonProperty("cup_stop_event_id")
    public Object getCupStopEventId() {
        return cupStopEventId;
    }

    @JsonProperty("cup_stop_event_id")
    public void setCupStopEventId(Object cupStopEventId) {
        this.cupStopEventId = cupStopEventId;
    }

    public GameSettings withCupStopEventId(Object cupStopEventId) {
        this.cupStopEventId = cupStopEventId;
        return this;
    }

    @JsonProperty("cup_qualifying_method")
    public Object getCupQualifyingMethod() {
        return cupQualifyingMethod;
    }

    @JsonProperty("cup_qualifying_method")
    public void setCupQualifyingMethod(Object cupQualifyingMethod) {
        this.cupQualifyingMethod = cupQualifyingMethod;
    }

    public GameSettings withCupQualifyingMethod(Object cupQualifyingMethod) {
        this.cupQualifyingMethod = cupQualifyingMethod;
        return this;
    }

    @JsonProperty("cup_type")
    public Object getCupType() {
        return cupType;
    }

    @JsonProperty("cup_type")
    public void setCupType(Object cupType) {
        this.cupType = cupType;
    }

    public GameSettings withCupType(Object cupType) {
        this.cupType = cupType;
        return this;
    }

    @JsonProperty("squad_squadplay")
    public Integer getSquadSquadplay() {
        return squadSquadplay;
    }

    @JsonProperty("squad_squadplay")
    public void setSquadSquadplay(Integer squadSquadplay) {
        this.squadSquadplay = squadSquadplay;
    }

    public GameSettings withSquadSquadplay(Integer squadSquadplay) {
        this.squadSquadplay = squadSquadplay;
        return this;
    }

    @JsonProperty("squad_squadsize")
    public Integer getSquadSquadsize() {
        return squadSquadsize;
    }

    @JsonProperty("squad_squadsize")
    public void setSquadSquadsize(Integer squadSquadsize) {
        this.squadSquadsize = squadSquadsize;
    }

    public GameSettings withSquadSquadsize(Integer squadSquadsize) {
        this.squadSquadsize = squadSquadsize;
        return this;
    }

    @JsonProperty("squad_team_limit")
    public Integer getSquadTeamLimit() {
        return squadTeamLimit;
    }

    @JsonProperty("squad_team_limit")
    public void setSquadTeamLimit(Integer squadTeamLimit) {
        this.squadTeamLimit = squadTeamLimit;
    }

    public GameSettings withSquadTeamLimit(Integer squadTeamLimit) {
        this.squadTeamLimit = squadTeamLimit;
        return this;
    }

    @JsonProperty("squad_total_spend")
    public Integer getSquadTotalSpend() {
        return squadTotalSpend;
    }

    @JsonProperty("squad_total_spend")
    public void setSquadTotalSpend(Integer squadTotalSpend) {
        this.squadTotalSpend = squadTotalSpend;
    }

    public GameSettings withSquadTotalSpend(Integer squadTotalSpend) {
        this.squadTotalSpend = squadTotalSpend;
        return this;
    }

    @JsonProperty("ui_currency_multiplier")
    public Integer getUiCurrencyMultiplier() {
        return uiCurrencyMultiplier;
    }

    @JsonProperty("ui_currency_multiplier")
    public void setUiCurrencyMultiplier(Integer uiCurrencyMultiplier) {
        this.uiCurrencyMultiplier = uiCurrencyMultiplier;
    }

    public GameSettings withUiCurrencyMultiplier(Integer uiCurrencyMultiplier) {
        this.uiCurrencyMultiplier = uiCurrencyMultiplier;
        return this;
    }

    @JsonProperty("ui_use_special_shirts")
    public Boolean getUiUseSpecialShirts() {
        return uiUseSpecialShirts;
    }

    @JsonProperty("ui_use_special_shirts")
    public void setUiUseSpecialShirts(Boolean uiUseSpecialShirts) {
        this.uiUseSpecialShirts = uiUseSpecialShirts;
    }

    public GameSettings withUiUseSpecialShirts(Boolean uiUseSpecialShirts) {
        this.uiUseSpecialShirts = uiUseSpecialShirts;
        return this;
    }

    @JsonProperty("ui_special_shirt_exclusions")
    public List<Object> getUiSpecialShirtExclusions() {
        return uiSpecialShirtExclusions;
    }

    @JsonProperty("ui_special_shirt_exclusions")
    public void setUiSpecialShirtExclusions(List<Object> uiSpecialShirtExclusions) {
        this.uiSpecialShirtExclusions = uiSpecialShirtExclusions;
    }

    public GameSettings withUiSpecialShirtExclusions(List<Object> uiSpecialShirtExclusions) {
        this.uiSpecialShirtExclusions = uiSpecialShirtExclusions;
        return this;
    }

    @JsonProperty("stats_form_days")
    public Integer getStatsFormDays() {
        return statsFormDays;
    }

    @JsonProperty("stats_form_days")
    public void setStatsFormDays(Integer statsFormDays) {
        this.statsFormDays = statsFormDays;
    }

    public GameSettings withStatsFormDays(Integer statsFormDays) {
        this.statsFormDays = statsFormDays;
        return this;
    }

    @JsonProperty("sys_vice_captain_enabled")
    public Boolean getSysViceCaptainEnabled() {
        return sysViceCaptainEnabled;
    }

    @JsonProperty("sys_vice_captain_enabled")
    public void setSysViceCaptainEnabled(Boolean sysViceCaptainEnabled) {
        this.sysViceCaptainEnabled = sysViceCaptainEnabled;
    }

    public GameSettings withSysViceCaptainEnabled(Boolean sysViceCaptainEnabled) {
        this.sysViceCaptainEnabled = sysViceCaptainEnabled;
        return this;
    }

    @JsonProperty("transfers_cap")
    public Integer getTransfersCap() {
        return transfersCap;
    }

    @JsonProperty("transfers_cap")
    public void setTransfersCap(Integer transfersCap) {
        this.transfersCap = transfersCap;
    }

    public GameSettings withTransfersCap(Integer transfersCap) {
        this.transfersCap = transfersCap;
        return this;
    }

    @JsonProperty("transfers_sell_on_fee")
    public Double getTransfersSellOnFee() {
        return transfersSellOnFee;
    }

    @JsonProperty("transfers_sell_on_fee")
    public void setTransfersSellOnFee(Double transfersSellOnFee) {
        this.transfersSellOnFee = transfersSellOnFee;
    }

    public GameSettings withTransfersSellOnFee(Double transfersSellOnFee) {
        this.transfersSellOnFee = transfersSellOnFee;
        return this;
    }

    @JsonProperty("league_h2h_tiebreak_stats")
    public List<String> getLeagueH2hTiebreakStats() {
        return leagueH2hTiebreakStats;
    }

    @JsonProperty("league_h2h_tiebreak_stats")
    public void setLeagueH2hTiebreakStats(List<String> leagueH2hTiebreakStats) {
        this.leagueH2hTiebreakStats = leagueH2hTiebreakStats;
    }

    public GameSettings withLeagueH2hTiebreakStats(List<String> leagueH2hTiebreakStats) {
        this.leagueH2hTiebreakStats = leagueH2hTiebreakStats;
        return this;
    }

    @JsonProperty("timezone")
    public String getTimezone() {
        return timezone;
    }

    @JsonProperty("timezone")
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public GameSettings withTimezone(String timezone) {
        this.timezone = timezone;
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

    public GameSettings withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GameSettings.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("leagueJoinPrivateMax");
        sb.append('=');
        sb.append(((this.leagueJoinPrivateMax == null)?"<null>":this.leagueJoinPrivateMax));
        sb.append(',');
        sb.append("leagueJoinPublicMax");
        sb.append('=');
        sb.append(((this.leagueJoinPublicMax == null)?"<null>":this.leagueJoinPublicMax));
        sb.append(',');
        sb.append("leagueMaxSizePublicClassic");
        sb.append('=');
        sb.append(((this.leagueMaxSizePublicClassic == null)?"<null>":this.leagueMaxSizePublicClassic));
        sb.append(',');
        sb.append("leagueMaxSizePublicH2h");
        sb.append('=');
        sb.append(((this.leagueMaxSizePublicH2h == null)?"<null>":this.leagueMaxSizePublicH2h));
        sb.append(',');
        sb.append("leagueMaxSizePrivateH2h");
        sb.append('=');
        sb.append(((this.leagueMaxSizePrivateH2h == null)?"<null>":this.leagueMaxSizePrivateH2h));
        sb.append(',');
        sb.append("leagueMaxKoRoundsPrivateH2h");
        sb.append('=');
        sb.append(((this.leagueMaxKoRoundsPrivateH2h == null)?"<null>":this.leagueMaxKoRoundsPrivateH2h));
        sb.append(',');
        sb.append("leaguePrefixPublic");
        sb.append('=');
        sb.append(((this.leaguePrefixPublic == null)?"<null>":this.leaguePrefixPublic));
        sb.append(',');
        sb.append("leaguePointsH2hWin");
        sb.append('=');
        sb.append(((this.leaguePointsH2hWin == null)?"<null>":this.leaguePointsH2hWin));
        sb.append(',');
        sb.append("leaguePointsH2hLose");
        sb.append('=');
        sb.append(((this.leaguePointsH2hLose == null)?"<null>":this.leaguePointsH2hLose));
        sb.append(',');
        sb.append("leaguePointsH2hDraw");
        sb.append('=');
        sb.append(((this.leaguePointsH2hDraw == null)?"<null>":this.leaguePointsH2hDraw));
        sb.append(',');
        sb.append("leagueKoFirstInsteadOfRandom");
        sb.append('=');
        sb.append(((this.leagueKoFirstInsteadOfRandom == null)?"<null>":this.leagueKoFirstInsteadOfRandom));
        sb.append(',');
        sb.append("cupStartEventId");
        sb.append('=');
        sb.append(((this.cupStartEventId == null)?"<null>":this.cupStartEventId));
        sb.append(',');
        sb.append("cupStopEventId");
        sb.append('=');
        sb.append(((this.cupStopEventId == null)?"<null>":this.cupStopEventId));
        sb.append(',');
        sb.append("cupQualifyingMethod");
        sb.append('=');
        sb.append(((this.cupQualifyingMethod == null)?"<null>":this.cupQualifyingMethod));
        sb.append(',');
        sb.append("cupType");
        sb.append('=');
        sb.append(((this.cupType == null)?"<null>":this.cupType));
        sb.append(',');
        sb.append("squadSquadplay");
        sb.append('=');
        sb.append(((this.squadSquadplay == null)?"<null>":this.squadSquadplay));
        sb.append(',');
        sb.append("squadSquadsize");
        sb.append('=');
        sb.append(((this.squadSquadsize == null)?"<null>":this.squadSquadsize));
        sb.append(',');
        sb.append("squadTeamLimit");
        sb.append('=');
        sb.append(((this.squadTeamLimit == null)?"<null>":this.squadTeamLimit));
        sb.append(',');
        sb.append("squadTotalSpend");
        sb.append('=');
        sb.append(((this.squadTotalSpend == null)?"<null>":this.squadTotalSpend));
        sb.append(',');
        sb.append("uiCurrencyMultiplier");
        sb.append('=');
        sb.append(((this.uiCurrencyMultiplier == null)?"<null>":this.uiCurrencyMultiplier));
        sb.append(',');
        sb.append("uiUseSpecialShirts");
        sb.append('=');
        sb.append(((this.uiUseSpecialShirts == null)?"<null>":this.uiUseSpecialShirts));
        sb.append(',');
        sb.append("uiSpecialShirtExclusions");
        sb.append('=');
        sb.append(((this.uiSpecialShirtExclusions == null)?"<null>":this.uiSpecialShirtExclusions));
        sb.append(',');
        sb.append("statsFormDays");
        sb.append('=');
        sb.append(((this.statsFormDays == null)?"<null>":this.statsFormDays));
        sb.append(',');
        sb.append("sysViceCaptainEnabled");
        sb.append('=');
        sb.append(((this.sysViceCaptainEnabled == null)?"<null>":this.sysViceCaptainEnabled));
        sb.append(',');
        sb.append("transfersCap");
        sb.append('=');
        sb.append(((this.transfersCap == null)?"<null>":this.transfersCap));
        sb.append(',');
        sb.append("transfersSellOnFee");
        sb.append('=');
        sb.append(((this.transfersSellOnFee == null)?"<null>":this.transfersSellOnFee));
        sb.append(',');
        sb.append("leagueH2hTiebreakStats");
        sb.append('=');
        sb.append(((this.leagueH2hTiebreakStats == null)?"<null>":this.leagueH2hTiebreakStats));
        sb.append(',');
        sb.append("timezone");
        sb.append('=');
        sb.append(((this.timezone == null)?"<null>":this.timezone));
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
        result = ((result* 31)+((this.leaguePointsH2hDraw == null)? 0 :this.leaguePointsH2hDraw.hashCode()));
        result = ((result* 31)+((this.sysViceCaptainEnabled == null)? 0 :this.sysViceCaptainEnabled.hashCode()));
        result = ((result* 31)+((this.transfersCap == null)? 0 :this.transfersCap.hashCode()));
        result = ((result* 31)+((this.uiCurrencyMultiplier == null)? 0 :this.uiCurrencyMultiplier.hashCode()));
        result = ((result* 31)+((this.leaguePrefixPublic == null)? 0 :this.leaguePrefixPublic.hashCode()));
        result = ((result* 31)+((this.timezone == null)? 0 :this.timezone.hashCode()));
        result = ((result* 31)+((this.squadTotalSpend == null)? 0 :this.squadTotalSpend.hashCode()));
        result = ((result* 31)+((this.leaguePointsH2hWin == null)? 0 :this.leaguePointsH2hWin.hashCode()));
        result = ((result* 31)+((this.cupType == null)? 0 :this.cupType.hashCode()));
        result = ((result* 31)+((this.leagueJoinPrivateMax == null)? 0 :this.leagueJoinPrivateMax.hashCode()));
        result = ((result* 31)+((this.squadSquadplay == null)? 0 :this.squadSquadplay.hashCode()));
        result = ((result* 31)+((this.transfersSellOnFee == null)? 0 :this.transfersSellOnFee.hashCode()));
        result = ((result* 31)+((this.cupQualifyingMethod == null)? 0 :this.cupQualifyingMethod.hashCode()));
        result = ((result* 31)+((this.squadSquadsize == null)? 0 :this.squadSquadsize.hashCode()));
        result = ((result* 31)+((this.squadTeamLimit == null)? 0 :this.squadTeamLimit.hashCode()));
        result = ((result* 31)+((this.statsFormDays == null)? 0 :this.statsFormDays.hashCode()));
        result = ((result* 31)+((this.leagueH2hTiebreakStats == null)? 0 :this.leagueH2hTiebreakStats.hashCode()));
        result = ((result* 31)+((this.leagueMaxKoRoundsPrivateH2h == null)? 0 :this.leagueMaxKoRoundsPrivateH2h.hashCode()));
        result = ((result* 31)+((this.leagueMaxSizePublicClassic == null)? 0 :this.leagueMaxSizePublicClassic.hashCode()));
        result = ((result* 31)+((this.leaguePointsH2hLose == null)? 0 :this.leaguePointsH2hLose.hashCode()));
        result = ((result* 31)+((this.leagueKoFirstInsteadOfRandom == null)? 0 :this.leagueKoFirstInsteadOfRandom.hashCode()));
        result = ((result* 31)+((this.leagueMaxSizePublicH2h == null)? 0 :this.leagueMaxSizePublicH2h.hashCode()));
        result = ((result* 31)+((this.leagueJoinPublicMax == null)? 0 :this.leagueJoinPublicMax.hashCode()));
        result = ((result* 31)+((this.cupStartEventId == null)? 0 :this.cupStartEventId.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.leagueMaxSizePrivateH2h == null)? 0 :this.leagueMaxSizePrivateH2h.hashCode()));
        result = ((result* 31)+((this.cupStopEventId == null)? 0 :this.cupStopEventId.hashCode()));
        result = ((result* 31)+((this.uiUseSpecialShirts == null)? 0 :this.uiUseSpecialShirts.hashCode()));
        result = ((result* 31)+((this.uiSpecialShirtExclusions == null)? 0 :this.uiSpecialShirtExclusions.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GameSettings) == false) {
            return false;
        }
        GameSettings rhs = ((GameSettings) other);
        return ((((((((((((((((((((((((((((((this.leaguePointsH2hDraw == rhs.leaguePointsH2hDraw)||((this.leaguePointsH2hDraw!= null)&&this.leaguePointsH2hDraw.equals(rhs.leaguePointsH2hDraw)))&&((this.sysViceCaptainEnabled == rhs.sysViceCaptainEnabled)||((this.sysViceCaptainEnabled!= null)&&this.sysViceCaptainEnabled.equals(rhs.sysViceCaptainEnabled))))&&((this.transfersCap == rhs.transfersCap)||((this.transfersCap!= null)&&this.transfersCap.equals(rhs.transfersCap))))&&((this.uiCurrencyMultiplier == rhs.uiCurrencyMultiplier)||((this.uiCurrencyMultiplier!= null)&&this.uiCurrencyMultiplier.equals(rhs.uiCurrencyMultiplier))))&&((this.leaguePrefixPublic == rhs.leaguePrefixPublic)||((this.leaguePrefixPublic!= null)&&this.leaguePrefixPublic.equals(rhs.leaguePrefixPublic))))&&((this.timezone == rhs.timezone)||((this.timezone!= null)&&this.timezone.equals(rhs.timezone))))&&((this.squadTotalSpend == rhs.squadTotalSpend)||((this.squadTotalSpend!= null)&&this.squadTotalSpend.equals(rhs.squadTotalSpend))))&&((this.leaguePointsH2hWin == rhs.leaguePointsH2hWin)||((this.leaguePointsH2hWin!= null)&&this.leaguePointsH2hWin.equals(rhs.leaguePointsH2hWin))))&&((this.cupType == rhs.cupType)||((this.cupType!= null)&&this.cupType.equals(rhs.cupType))))&&((this.leagueJoinPrivateMax == rhs.leagueJoinPrivateMax)||((this.leagueJoinPrivateMax!= null)&&this.leagueJoinPrivateMax.equals(rhs.leagueJoinPrivateMax))))&&((this.squadSquadplay == rhs.squadSquadplay)||((this.squadSquadplay!= null)&&this.squadSquadplay.equals(rhs.squadSquadplay))))&&((this.transfersSellOnFee == rhs.transfersSellOnFee)||((this.transfersSellOnFee!= null)&&this.transfersSellOnFee.equals(rhs.transfersSellOnFee))))&&((this.cupQualifyingMethod == rhs.cupQualifyingMethod)||((this.cupQualifyingMethod!= null)&&this.cupQualifyingMethod.equals(rhs.cupQualifyingMethod))))&&((this.squadSquadsize == rhs.squadSquadsize)||((this.squadSquadsize!= null)&&this.squadSquadsize.equals(rhs.squadSquadsize))))&&((this.squadTeamLimit == rhs.squadTeamLimit)||((this.squadTeamLimit!= null)&&this.squadTeamLimit.equals(rhs.squadTeamLimit))))&&((this.statsFormDays == rhs.statsFormDays)||((this.statsFormDays!= null)&&this.statsFormDays.equals(rhs.statsFormDays))))&&((this.leagueH2hTiebreakStats == rhs.leagueH2hTiebreakStats)||((this.leagueH2hTiebreakStats!= null)&&this.leagueH2hTiebreakStats.equals(rhs.leagueH2hTiebreakStats))))&&((this.leagueMaxKoRoundsPrivateH2h == rhs.leagueMaxKoRoundsPrivateH2h)||((this.leagueMaxKoRoundsPrivateH2h!= null)&&this.leagueMaxKoRoundsPrivateH2h.equals(rhs.leagueMaxKoRoundsPrivateH2h))))&&((this.leagueMaxSizePublicClassic == rhs.leagueMaxSizePublicClassic)||((this.leagueMaxSizePublicClassic!= null)&&this.leagueMaxSizePublicClassic.equals(rhs.leagueMaxSizePublicClassic))))&&((this.leaguePointsH2hLose == rhs.leaguePointsH2hLose)||((this.leaguePointsH2hLose!= null)&&this.leaguePointsH2hLose.equals(rhs.leaguePointsH2hLose))))&&((this.leagueKoFirstInsteadOfRandom == rhs.leagueKoFirstInsteadOfRandom)||((this.leagueKoFirstInsteadOfRandom!= null)&&this.leagueKoFirstInsteadOfRandom.equals(rhs.leagueKoFirstInsteadOfRandom))))&&((this.leagueMaxSizePublicH2h == rhs.leagueMaxSizePublicH2h)||((this.leagueMaxSizePublicH2h!= null)&&this.leagueMaxSizePublicH2h.equals(rhs.leagueMaxSizePublicH2h))))&&((this.leagueJoinPublicMax == rhs.leagueJoinPublicMax)||((this.leagueJoinPublicMax!= null)&&this.leagueJoinPublicMax.equals(rhs.leagueJoinPublicMax))))&&((this.cupStartEventId == rhs.cupStartEventId)||((this.cupStartEventId!= null)&&this.cupStartEventId.equals(rhs.cupStartEventId))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.leagueMaxSizePrivateH2h == rhs.leagueMaxSizePrivateH2h)||((this.leagueMaxSizePrivateH2h!= null)&&this.leagueMaxSizePrivateH2h.equals(rhs.leagueMaxSizePrivateH2h))))&&((this.cupStopEventId == rhs.cupStopEventId)||((this.cupStopEventId!= null)&&this.cupStopEventId.equals(rhs.cupStopEventId))))&&((this.uiUseSpecialShirts == rhs.uiUseSpecialShirts)||((this.uiUseSpecialShirts!= null)&&this.uiUseSpecialShirts.equals(rhs.uiUseSpecialShirts))))&&((this.uiSpecialShirtExclusions == rhs.uiSpecialShirtExclusions)||((this.uiSpecialShirtExclusions!= null)&&this.uiSpecialShirtExclusions.equals(rhs.uiSpecialShirtExclusions))));
    }

}
