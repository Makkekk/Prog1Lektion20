package opgave01.model;

import java.util.*;

/**
 * Modeling a Swimmer
 */
public class Swimmer {
    private String name;
    private String club;
    private int yearGroup;
    private ArrayList<Double> lapTimes;
    private TrainingPlan trainingPlan;


    /**
     * Initialize a new swimmer with name, club, yearGroup, and lap times.
     */

    public Swimmer(String name, int yearGroup, ArrayList<Double> lapTimes, String club, TrainingPlan trainingPlan) {
        this.name = name;
        this.yearGroup = yearGroup;
        this.lapTimes = lapTimes;
        this.club = club;
        this.trainingPlan = trainingPlan;

    }

    /**
     * Return the name of the swimmer
     */
    public String getName() {
        return this.name;
    }

    /**
     * Return the yearGroup of the swimmer
     */
    public int getYearGroup() {
        return this.yearGroup;
    }

    /**
     * Return the club of the swimmer
     */
    public String getClub() {
        return this.club;
    }

    /**
     * Register the club of the swimmer
     *
     * @param club
     */
    public void setClub(String club) {
        this.club = club;
    }

    public void setTrainingPlan(TrainingPlan trainingPlan) {
        this.trainingPlan = trainingPlan;
    }

    public TrainingPlan getTrainingPlan() {
        return trainingPlan;
    }

    /**
     * Return the fastest lap time
     */

    public double bestLapTime() {
        double best = Double.MAX_VALUE;
        for (double time : lapTimes) {
            if (best > time) {
                best = time;
            }
        }
        return best;
    }

    public int allTrainingHours() {
        if (this.trainingPlan != null) {
            return this.trainingPlan.getWeeklyWaterHours() + this.trainingPlan.getWeeklyStrengthHours();
        } else {
            return 0;
        }
    }
}

