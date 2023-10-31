import java.util.ArrayList;
import java.util.Scanner;

public class Words2X {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 words:");
        for (int i = 0; i < 5; i++) {
            String word = scanner.next();
            words.add(word);
        }

        doubleValues(words);

        for (String word : words) {
            System.out.print(word);
        }

    }

    public static void doubleValues(ArrayList<String> words) {
        int size = words.size();
        for (int i = 0; i < size; i++) {
            String word = words.get(i);
            words.add(i, word);
            i++;
            size++;
        }
    }
}
