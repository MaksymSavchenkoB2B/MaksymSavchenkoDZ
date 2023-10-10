public class Car extends Vehicle{
    private int parkplace;

    public Car( double price, int speed, int year, int parkplace) {
        super(price, speed, year);
        this.parkplace = parkplace;
    }
    @Override
    public void Info() {
        super.Info();
        System.out.println("Parkplace: " + parkplace);
    }
}
