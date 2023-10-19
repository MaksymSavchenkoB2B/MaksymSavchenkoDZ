
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Worker[] workers = new Worker[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < workers.length; i++) {
            System.out.println("--Enter info about new worker--" + (i + 1));
            try {
                System.out.print("Name: ");
                String name = scanner.nextLine();
                if (isLetters(name)) {
                    throw new IllegalArgumentException("Name contains special characters. Please enter a valid name.");
                }

                System.out.print("Surname: ");
                String surname = scanner.nextLine();
                if (isLetters(surname)) {
                    throw new IllegalArgumentException("Surname contains special characters. Please enter a valid surname.");
                }

                System.out.print("Position: ");
                String position = scanner.nextLine();
                if (isLetters(position)) {
                    throw new IllegalArgumentException("Position contains special characters. Please enter a valid position.");
                }

                System.out.print("Hire Year: ");
                String hireYearStr = scanner.nextLine();
                if (!isNumeric(hireYearStr)) {
                    throw new IllegalArgumentException("Hire Year should contain only digits. Please enter a valid year.");
                }
                int hireYear = Integer.parseInt(hireYearStr);

                workers[i] = new Worker(name, surname, position, hireYear);

            } catch (IllegalArgumentException e) {
                System.err.println("/==Invalid input: " + e.getMessage() + "==/");
                i--;
            }
        }

        Arrays.sort(workers);

        System.out.print("Enter the years of experience you look for: ");
        int ExpYears = scanner.nextInt();

        System.out.println("Workers with experience  greater than " + ExpYears + ":");
        for (Worker worker : workers) {
            if (worker.getHireYear() > ExpYears) {
                System.out.println(worker.getSurName() + " " + worker.getName() + " " +  worker.getPosition() + " - " + (2023 - worker.getHireYear()) + " years of experience");
            }
        }
    }

    private static boolean isLetters(String s) {
        return s.matches("[^a-zA-Z]");
    }

    private static boolean isNumeric(String s) {
        return s.matches("[^0-9]+");
    }
}
