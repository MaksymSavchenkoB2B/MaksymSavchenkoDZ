public class Main {
    public static void main(String[] args) {
        AbstractHandler handler;

        handler = new XMLHandler();
        System.out.println("Working on XML document:");
        handler.open();
        handler.create();
        handler.change();
        handler.save();

        handler = new TXTHandler();
        System.out.println("Working on TXT document:");
        handler.open();
        handler.create();
        handler.change();
        handler.save();

        handler = new DOCHandler();
        System.out.println("Working on DOC document:");
        handler.open();
        handler.create();
        handler.change();
        handler.save();
    }
}
