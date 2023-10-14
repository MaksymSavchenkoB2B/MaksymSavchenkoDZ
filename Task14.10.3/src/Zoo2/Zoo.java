package Zoo2;
import java.util.ArrayList;
import java.util.List;

public class Zoo {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();

        AnimalIndex(animals, 0, "Bear");
        AnimalIndex(animals, 1, "Shark");
        AnimalIndex(animals, 2, "Lion");
        AnimalIndex(animals, 3, "Bull");
        AnimalIndex(animals, 4, "Leopard");
        AnimalIndex(animals, 5, "Wolf");
        AnimalIndex(animals, 6, "Fox");
        AnimalIndex(animals, 7, "Spider");

        for (String animal : animals) {
            System.out.println(animal);
        }
        animals.remove(7);
        animals.remove(4);
        animals.remove(2);

        int size = animals.size();
        System.out.println("List size: " + size);
    }


    private static void AnimalIndex(List<String> animals, int index, String animal) {
        if (index >= 0 && index <= animals.size()) {
            animals.add(index, animal);
        }
    }
}

