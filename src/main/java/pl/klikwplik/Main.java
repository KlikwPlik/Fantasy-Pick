package pl.klikwplik;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import pl.klikwplik.domain.Position;
import pl.klikwplik.model.Element;
import pl.klikwplik.model.InputWrapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
        String basePath = "src/main/resources";
        File inputJson = new File(basePath + File.separator + "input.json");
        InputWrapper wrapper = objectMapper.readValue(inputJson.toURI().toURL(), InputWrapper.class);
        ArrayList<Element> players = wrapper.getElements();

        for (Position p : Position.values()) {
            List<Element> playersWithMostAssistsOnPosition = findPlayersWithMostAssistsOnPosition(players, p.getOrdinal());
            printPlayers(playersWithMostAssistsOnPosition);
        }
    }

    public static List<Element> findPlayersWithMostAssistsOnPosition(ArrayList<Element> players, int position) {
        int limit = 0;
        switch (position) {
            case 1:
                limit = 2;
                break;
            case 2:
            case 3:
                limit = 5;
                break;
            case 4:
                limit = 3;
        }
        return players.stream()
                .filter(p -> p.getElementType() == position)
                .sorted(Comparator.comparing(Element::getAssists).reversed())
                .limit(limit)
                .collect(Collectors.toList());
    }

    public static void printPlayers(List<Element> players) {
        players.stream()
                .map(player -> new String[]{player.getFirstName(), player.getSecondName(), "pozycja: " + player.getElementType(), "asysty: " + player.getAssists(), "cena: " + player.getNowCost()})
                .map(Arrays::toString)
                .forEach(System.out::println);
    }
}