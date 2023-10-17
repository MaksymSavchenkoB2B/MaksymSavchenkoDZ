package Vehicles;

public class EnuVehicles {
    public enum Vehicles {
        Tank(500000, "Green"), Car(10000, "Yellow");
        private int price;
        private String color;
        Vehicles(int price, String color) {
            this.price = price;
            this.color = color;
        }
        //public String getColor() {
        // Навіщо в завданні написано створити getColor,
        // якщо програма може працювати без його використання
        //return color;
      // }
        @Override
        public String toString() {
            return "Vehicle -  " + this.name() + ", Color - " + color + ", Price - " + price + "$";
        }
    }

    public static void main(String[] args) {
        Vehicles Tank = Vehicles.Tank;
        Vehicles Car = Vehicles.Car;

        System.out.println(Tank.toString());
        System.out.println(Car.toString());
    }
}
