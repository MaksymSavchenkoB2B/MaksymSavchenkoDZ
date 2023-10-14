import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Friends {
    public static void main(String[] args) {
        List<String> friendsList = new ArrayList<>();

        friendsList.add("Mark");
        friendsList.add("Robby");
        friendsList.add("Jay");
        friendsList.add("Max");
        friendsList.add("Daniel");
        friendsList.add("Bob");
        friendsList.add("Anna");

        for (String friend : friendsList) {
            System.out.println(friend);
        }

        Collections.sort(friendsList);

        System.out.println("Friends List in alphabetic order:");
        for (String friend : friendsList) {
            System.out.println(friend);
        }
    }
}
