import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Math {
    int num1() default 0;
    int num2() default 0;
}
public class Addition {
    @Math(num1 = 100, num2 = 200)
    public void mathSum(int num1, int num2) {
        int result = num1 + num2;
        System.out.println("Addition of "+ num1 + " and " + num2 +" = "+ result);
    }

    public static void main(String[] args) {
        Addition addition = new Addition();
        addition.mathSum(2, 2);
        Addition addition2 = new Addition();
        addition.mathSum(22, 22);
    }
}
