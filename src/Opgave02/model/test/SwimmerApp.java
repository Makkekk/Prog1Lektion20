package Opgave02.model.test;


import Opgave02.model.model.Swimmer;
import Opgave02.model.model.TrainingPlan;

import java.util.ArrayList;

public class SwimmerApp {


    public static void main(String[] args) {
        TrainingPlan trainingPlanB = new TrainingPlan('A', 16, 10);
        TrainingPlan trainingPlanA = new TrainingPlan('B', 10, 6);


        ArrayList<Double> lapTimesJan = new ArrayList<>();
        lapTimesJan.add(1.02);
        lapTimesJan.add(1.01);
        lapTimesJan.add(0.99);
        lapTimesJan.add(0.98);
        lapTimesJan.add(1.02);
        lapTimesJan.add(1.04);
        lapTimesJan.add(0.99);
        Swimmer Jan = new Swimmer("Jan", 1994, lapTimesJan, "AGF");

        ArrayList<Double> lapTimesBo = new ArrayList<>();
        lapTimesBo.add(1.05);
        lapTimesBo.add(1.01);
        lapTimesBo.add(1.04);
        lapTimesBo.add(1.06);
        lapTimesBo.add(1.08);
        lapTimesBo.add(1.04);
        lapTimesBo.add(1.02);
        Swimmer Bo = new Swimmer("Bo", 1995, lapTimesBo, "Lyseng");

        ArrayList<Double> lapTimesMikkel = new ArrayList<>();
        lapTimesMikkel.add(1.03);
        lapTimesMikkel.add(1.01);
        lapTimesMikkel.add(1.02);
        lapTimesMikkel.add(1.05);
        lapTimesMikkel.add(1.03);
        lapTimesMikkel.add(1.06);
        lapTimesMikkel.add(1.03);
        Swimmer Mikkel = new Swimmer("Mikkel", 1993, lapTimesMikkel, "AIA-Tranbjerg");


        // Tilknyt svømmere til deres træningsplaner
        trainingPlanA.addSwimmer(Jan);
        trainingPlanA.addSwimmer(Bo);
        trainingPlanB.addSwimmer(Mikkel);

        // Opretter en liste med træningsplanerne
        ArrayList<TrainingPlan> trainingPlans = new ArrayList<>();
        trainingPlans.add(trainingPlanA);
        trainingPlans.add(trainingPlanB);


        //Iterer over træningsplanerne og deres svømmere
        for (TrainingPlan plan : trainingPlans) {
            System.out.println("Træningsplan " + plan.getLevel() + " har følgende svømmere:");
            for (Swimmer swimmer : plan.getSwimmers()) {
                System.out.println("- " + swimmer.getName());
                System.out.println(" - Klub: " + swimmer.getClub());
                System.out.println(" - Årgang: " + swimmer.getYearGroup());
                System.out.println(" - Bedste laptime: " + swimmer.bestLapTime());
                System.out.println();


            }
        }
    }
}
