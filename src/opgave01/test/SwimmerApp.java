package opgave01.test;

import java.util.ArrayList;
import opgave01.model.Swimmer;
import opgave01.model.TrainingPlan;

public class SwimmerApp {


    public static void main(String[] args) {
        TrainingPlan trainingPlanB = new TrainingPlan('A',16,10);
        TrainingPlan trainingPlanA = new TrainingPlan('B',10,6);


        ArrayList<Double> lapTimes = new ArrayList<>();
        lapTimes.add(1.02);
        lapTimes.add(1.01);
        lapTimes.add(0.99);
        lapTimes.add(0.98);
        lapTimes.add(1.02);
        lapTimes.add(1.04);
        lapTimes.add(0.99);
        Swimmer swimmer1 = new Swimmer("Jan", 1994, lapTimes, "AGF", trainingPlanA);

        lapTimes = new ArrayList<>();
        lapTimes.add(1.05);
        lapTimes.add(1.01);
        lapTimes.add(1.04);
        lapTimes.add(1.06);
        lapTimes.add(1.08);
        lapTimes.add(1.04);
        lapTimes.add(1.02);
        Swimmer swimmer2 = new Swimmer("Bo", 1995, lapTimes, "Lyseng",trainingPlanA);

        lapTimes = new ArrayList<>();
        lapTimes.add(1.03);
        lapTimes.add(1.01);
        lapTimes.add(1.02);
        lapTimes.add(1.05);
        lapTimes.add(1.03);
        lapTimes.add(1.06);
        lapTimes.add(1.03);
        Swimmer swimmer3 = new Swimmer("Mikkel", 1993, lapTimes, "AIA-Tranbjerg",trainingPlanB);
        
        ArrayList<Swimmer> swimmers = new ArrayList<>();
        swimmers.add(swimmer1);
        swimmers.add(swimmer2);
        swimmers.add(swimmer3);


int totalTraininghours = 0;
        for (Swimmer swimmer : swimmers) {
            int swimmerTrainingHours = swimmer.allTrainingHours();
            System.out.println(swimmer.getName() + "'s bedste tid: " + swimmer.bestLapTime());
            System.out.println(swimmer.getName() + "'s totale træningstimer per uge: " + swimmer.allTrainingHours());
            totalTraininghours += swimmerTrainingHours;
        }
        System.out.println("Totale traingstimer per uge for alle svømmere: " + totalTraininghours);



        }
    }
