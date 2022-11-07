package pl.klikwplik.model;

import java.util.ArrayList;

public class InputWrapper {

    private ArrayList<Event> events = new ArrayList<>();
    private GameSettings game_settings;
    private ArrayList<Phase> phases = new ArrayList<>();
    private ArrayList<Team> teams = new ArrayList<>();
    private int total_players;
    private ArrayList<Element> elements = new ArrayList<>();
    private ArrayList<ElementType> element_types = new ArrayList<>();
    private ArrayList<ElementStat> element_stats = new ArrayList<>();

    public ArrayList<Event> getEvents() {
        return events;
    }

    public void setEvents(ArrayList<Event> events) {
        this.events = events;
    }

    public GameSettings getGame_settings() {
        return game_settings;
    }

    public void setGame_settings(GameSettings game_settings) {
        this.game_settings = game_settings;
    }

    public ArrayList<Phase> getPhases() {
        return phases;
    }

    public void setPhases(ArrayList<Phase> phases) {
        this.phases = phases;
    }

    public ArrayList<Team> getTeams() {
        return teams;
    }

    public void setTeams(ArrayList<Team> teams) {
        this.teams = teams;
    }

    public int getTotal_players() {
        return total_players;
    }

    public void setTotal_players(int total_players) {
        this.total_players = total_players;
    }

    public ArrayList<Element> getElements() {
        return elements;
    }

    public void setElements(ArrayList<Element> elements) {
        this.elements = elements;
    }

    public ArrayList<ElementType> getElement_types() {
        return element_types;
    }

    public void setElement_types(ArrayList<ElementType> element_types) {
        this.element_types = element_types;
    }

    public ArrayList<ElementStat> getElement_stats() {
        return element_stats;
    }

    public void setElement_stats(ArrayList<ElementStat> element_stats) {
        this.element_stats = element_stats;
    }
}
