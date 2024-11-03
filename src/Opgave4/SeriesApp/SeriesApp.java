package Opgave4.SeriesApp;

import Opgave4.Episode;
import Opgave4.Series;

import java.util.ArrayList;

public class SeriesApp {
    public static void main(String[] args) {
        //Guestactor
        ArrayList<String> guestActors1 = new ArrayList<>();
        guestActors1.add("Morgan Freeman");
        guestActors1.add("Sandra Bullock");

        ArrayList<String> guestActors2 = new ArrayList<>();
        guestActors2.add("Danny DeVito");

        // Create episodes
        Episode episode1 = new Episode(30, guestActors1, 1);
        Episode episode2 = new Episode(45, guestActors2, 2);

        // Create a series
        ArrayList<String> cast = new ArrayList<>();
        cast.add("Betty White");
        cast.add("Keany Reeves");

        ArrayList<Episode> episodes = new ArrayList<>();
        episodes.add(episode1);
        episodes.add(episode2);

        Series series = new Series(cast, "Dødens Pølse", episodes);

        // Test the total length of the series
        System.out.println("Total length of the series: " + series.totalLength() + " minutes");

        // Test getting guest actors
        ArrayList<String> allGuestActors = series.getGuestActors();
        System.out.println("All guest actors: " + allGuestActors);
    }
}
