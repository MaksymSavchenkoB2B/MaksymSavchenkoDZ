public class Vehicle {

    private double price;
    private int speed;
    private int year;

    public Vehicle(double price, int speed, int year) {
        this.price = price;
        this.speed = speed;
        this.year = year;
    }

    public void Info() {
        System.out.println("Price: " + price);
        System.out.println("Speed: " + speed);
        System.out.println("Year: " + year);
    }
}
