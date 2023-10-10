public class Plane extends Vehicle{
    private double height;
    private int passengers;

    public Plane( double price, int speed, int year, double height, int passengers) {
        super( price, speed, year);
        this.height = height;
        this.passengers = passengers;
    }

    @Override
    public void Info() {
        super.Info();
        System.out.println("Height: " + height);
        System.out.println("Passengers: " + passengers);
    }
}
