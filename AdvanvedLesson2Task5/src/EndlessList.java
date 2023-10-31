import java.util.ArrayList;
import java.util.Scanner;
public class EndlessList {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String enter;
        while (true) {
            enter = scanner.nextLine();
            if (enter.equals("end")) {
                System.out.println("==Endless list ended==");
                break;
            }
            stringList.add(enter);
        }

        for (String strings : stringList) {
            System.out.println(strings);
        }
    }
}
