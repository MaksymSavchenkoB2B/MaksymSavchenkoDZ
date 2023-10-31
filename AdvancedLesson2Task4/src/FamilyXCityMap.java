import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class FamilyXCityMap {
    public static void main(String[] args) {
        Map<String, String> cityXFamilyMap = new HashMap<>();
        cityXFamilyMap.put("Москва", "Іванови");
        cityXFamilyMap.put("Київ", "Петрови");
        cityXFamilyMap.put("Лондон", "Абрамовичі");


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name of the city:");
        String city = scanner.nextLine();


        String family = cityXFamilyMap.get(city);

        if (family != null) {
            System.out.println("Family that lives in " + city + " - " + family);
        } else {
            System.out.println("There is no " + city + " in this map");
        }
    }
}
