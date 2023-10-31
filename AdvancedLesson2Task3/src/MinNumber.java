import java.util.LinkedList;
import java.util.Scanner;

    public class MinNumber {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter amount of numbers N ");
            int N = scanner.nextInt();

            LinkedList<Integer> integerList = getIntegerList(N);

            int min = getMinimum(integerList);

            System.out.println("Minimal number is " + min);
        }

        public static LinkedList<Integer> getIntegerList(int N) {
            LinkedList<Integer> integerList = new LinkedList<>();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter " + N + " numbers: ");
            for (int i = 0; i < N; i++) {
                int number = scanner.nextInt();
                integerList.add(number);
            }
            return integerList;
        }

        public static int getMinimum(LinkedList<Integer> integerList) {
            int min = Integer.MAX_VALUE;
            for (int number : integerList) {
                if (number < min) {
                    min = number;
                }
            }
            return min;
        }
    }


