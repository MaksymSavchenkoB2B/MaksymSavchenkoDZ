import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Price[] prices = new Price[2];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < prices.length; i++) {
            System.out.println("--Enter product information--" + (i + 1));
            System.out.print("Product: ");
            String productName = scanner.nextLine();

            System.out.print("Store: ");
            String storeName = scanner.nextLine();

            System.out.print("Price in UAH: ");
            double price = scanner.nextDouble();
            scanner.nextLine();

            prices[i] = new Price(productName, storeName, price);
        }
        //Arrays.sort(prices);

        System.out.print("Enter the store name you looking for: ");
        String SearchedStore= scanner.nextLine();

        boolean found = false;
        for (Price price : prices) {
            if (price.getShop().equalsIgnoreCase(SearchedStore)) {
                System.out.println("Product: " + price.getProduct() + ", Price: " + price.getPrice() + " UAH");
                found = true;
            }
        }

        if (!found) {
            System.err.println("Store not found.");
        }
    }
}