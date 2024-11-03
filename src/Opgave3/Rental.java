package Opgave3;

public class Rental {
    private int no;
    private String date;
    private int days; //Days of rental
    private Car car;

    public Rental(int no, String date, int days, Car car) {
        this.no = no;
        this.date = date;
        this.days = days;
        this.car = car;
    }

    public int getNo() {
        return this.no;
    }
    public String getDate() {
        return this.date;
    }
    public int getPrice() {
        return car.getPricePerDay() * this.days;
    }
    public void setDays(int days) {
        this.days = days;

    }
    public int getDays() {
        return this.days;
    }
}
