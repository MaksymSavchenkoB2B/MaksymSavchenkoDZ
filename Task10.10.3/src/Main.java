public class Main {
    public static void main(String[] args) {
        Plane plane = new Plane(1300000, 990, 2020, 9000,  130);
        Car car = new Car(45000, 180, 2004,  49);
        Ship ship = new Ship(4000000, 25, 1980, 400 , "Odessa");


        plane.Info();
        System.out.println();


        car.Info();
        System.out.println();


        ship.Info();
    }
}





