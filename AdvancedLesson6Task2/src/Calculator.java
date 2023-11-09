import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Documentation {
    String owner() default "Anonymous";
    String operation() default "No description";
}

public class Calculator {
    @Documentation(owner = "Your Name", operation = "Addition")
    public double add(double a, double b) {
        return a + b;
    }

    @Documentation(owner = "Your Name", operation = "Subtraction")
    public double subtract(double a, double b) {
        return a - b;
    }

    @Documentation(owner = "Maksym Savchenko", operation = "Multiplication")
    public double multiply(double a, double b) {
        return a * b;
    }

    @Documentation(owner = "Maksym Savchenko", operation = "Division")
    public double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Cannot divide by zero");
        }
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double result = calculator.multiply(2, 2);
        System.out.println("2 * 2 = " + result);
        Calculator calculator2 = new Calculator();
        double result2 = calculator.add(22, 22);
        System.out.println("22 + 22 = " + result);
    }
}
