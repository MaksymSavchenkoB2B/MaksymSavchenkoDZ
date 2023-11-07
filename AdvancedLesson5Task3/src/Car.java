import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Car {
    private int speed;
    protected String name;
    public double weight;

    public Car(int speed, String name, double weight) {
        this.speed = speed;
        this.name = name;
        this.weight = weight;
    }

    public void CarsOwner() {
        System.out.println("Max Savchenko");
    }

    private void CarsPrice() {
        System.out.println("30000$");
    }

    protected void CarsMilage() {
        System.out.println("0");
    }

    public static void main(String[] args) {
        Class<?> Car = Car.class;

        Field[] fields = Car.getDeclaredFields();
        System.out.println("Cars fields:");
        for (Field field : fields) {
            System.out.print("{Name - " + field.getName());
            System.out.print(", access modifier - " + field.getModifiers() + "}\n");
        }


        Constructor<?>[] constructors = Car.getDeclaredConstructors();
        System.out.println("Cars constructors:");
        for (Constructor<?> constructor : constructors) {
            System.out.print("{Name - " + constructor.getName());
            System.out.print(", access modifier - " + constructor.getModifiers() + "}\n");
        }


        Method[] methods = Car.getDeclaredMethods();
        System.out.println("Cars methods:");
        for (Method method : methods) {
            System.out.print("{Name - " + method.getName());
            System.out.print(", access modifier - " + method.getModifiers() + "}\n");
        }
    }
}
