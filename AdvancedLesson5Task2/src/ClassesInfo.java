import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class ClassesInfo {
    public static void ClassInfo(String className) {
        try {
            Class<?> clas = Class.forName(className);

            System.out.println("Name -  " + clas.getName());


            System.out.println("Class fields: ");
            Field[] fields = clas.getDeclaredFields();
            for (Field field : fields) {
                System.out.println(field);
            }

            System.out.println("Class methods: ");
            Method[] methods = clas.getDeclaredMethods();
            for (Method method : methods) {
                System.out.println(method);
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Class - " + className + " not found");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter clesses name:");
        String className = scanner.next();

        ClassInfo(className);
    }
}

