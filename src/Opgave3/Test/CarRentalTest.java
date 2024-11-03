package Opgave3.Test;

import Opgave3.Car;
import Opgave3.Rental;

public class CarRentalTest {
    public static void main(String[] args) {

        Car car1 = new Car("DG12345", "1995");
        car1.setPricePerDay(300);

        Car car2 = new Car("FD23456", "2009");
        car2.setPricePerDay(400);

        Car car3 = new Car("XD1337", "2024");
        car3.setPricePerDay(700);

        Rental rental1 = new Rental(1, "2024-11-01", 3, car1);
        Rental rental2 = new Rental(2, "2024-11-01", 3, car2);
        Rental rental3 = new Rental(3, "2024-11-01", 3, car3);

        System.out.println("Lejeaftale " + rental1.getNo() + " for bil " + car1.getNo() + " koster i alt: " + rental1.getPrice() + "kr.");
        System.out.println("Lejeaftale " + rental2.getNo() + " for bil " + car2.getNo() + " koster i alt: " + rental2.getPrice() + " kr.");
        System.out.println("Lejeaftale " + rental3.getNo() + " for bil " + car3.getNo() + " koster i alt: " + rental3.getPrice() + " kr.");
    }
}
