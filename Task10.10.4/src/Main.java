import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть pro або exp: ");
        String cey = scanner.nextLine().toLowerCase();

        DocumentWorker documentWorker;

        if (cey.equals("pro")) {
            documentWorker = new ProDocumentWorker();
        } else if (cey.equals("exp")) {
            documentWorker = new ExpertDocumentWorker();
        } else {
            documentWorker = new DocumentWorker();
        }

        documentWorker.openDocument();
        documentWorker.editDocument();
        documentWorker.saveDocument();
    }
}





