package Opgave3;

public class Car {
    private String no; // registration number
    private String year; // Year of first registration
    private int pricePerDay;

    public Car(String no,String year) {
        this.no = no;
        this.year = year;
        this.pricePerDay = 0; // Sættes senere med setPricePerDay
    }

    public void setPricePerDay(int pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public int getPricePerDay() {
        return this.pricePerDay;
    }
    public String getNo() {
        return this.no;
    }
    public String getYear() {
        return this.year;
    }
}
