package Numbers;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(1);
        numbers.add(7);
        numbers.add(2);
        numbers.add(5);

        ListIterator<Integer> listIterator = numbers.listIterator();

        while (listIterator.hasNext()) {
            int number= listIterator.next();
            listIterator.set(number + 1);
        }

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
