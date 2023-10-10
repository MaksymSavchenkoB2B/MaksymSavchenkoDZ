public class Ship extends Vehicle {

    private int passengers;
    private String port;

    public Ship( double price, int speed, int year, int passengers, String port) {
        super( price,  speed, year);
        this.passengers = passengers;
        this.port = port;
    }
    @Override
    public void Info() {
        super.Info();
        System.out.println("Port: " + port);
        System.out.println("Passengers: " + passengers);
    }
}