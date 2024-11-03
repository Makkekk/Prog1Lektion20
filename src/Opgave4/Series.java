package Opgave4;

import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Series {
    private String titel;
    private ArrayList<String> cast;
    private final ArrayList<Episode> episodes; //opgave 4.2

    public Series(ArrayList<String> series, String titel, ArrayList<Episode> episodes) {
        this.cast = series;
        this.titel = titel;
        this.episodes = episodes;
    }

    public ArrayList<String> getCast() {
        return cast;
    }

    public String getTitel() {
        return titel;
    }


    public int totalLength() {
        int total = 0;
        for (Episode episode : episodes) {
            total += episode.getLengthInMinutes();
        }
        return total;
    }

    public ArrayList<String> getGuestActors() {
        ArrayList<String> allGuestActors = new ArrayList<>();
        for (Episode episode : episodes) {
            allGuestActors.addAll(episode.getGuestActors());
        }
        return allGuestActors;
    }
}




