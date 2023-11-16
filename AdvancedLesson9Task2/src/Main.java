import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new Random().ints(10, 1, 100)
                .boxed()
                .collect(Collectors.toList());

        System.out.println("Random numbers list: " + numbers);


        int sum = numbers.stream()
                .map(x -> x * x)
                .reduce(0, Integer::sum);


        System.out.println("Sum of squares of elements in the list: " + sum);
    }
}
