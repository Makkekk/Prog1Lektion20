package Opgave4;

import java.util.ArrayList;

public class Episode {
    private int number;
    private ArrayList<String> guestActors;
    private int lengthInMinutes;

    public Episode(int lenghtInMinutes, ArrayList<String> guestActors, int number) {
        this.lengthInMinutes = lenghtInMinutes;
        this.guestActors = guestActors;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public ArrayList<String> getGuestActors() {
        return guestActors;
    }

    public int getLengthInMinutes() {
        return lengthInMinutes;
    }

    @Override
    public String toString() {
        return "Episode " + number + " (" + lengthInMinutes + " minutes) - Guest Actors: " + guestActors;
    }
}


