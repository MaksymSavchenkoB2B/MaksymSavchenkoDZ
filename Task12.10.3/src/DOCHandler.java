public class DOCHandler extends AbstractHandler {
        @Override
public void open() {
    System.out.println("DOC document opened");
}

        @Override
        public void create() {
            System.out.println("DOC document created");
        }

        @Override
        public void change() {
            System.out.println("DOC document changed");
        }

        @Override
        public void save() {
            System.out.println("DOC document saved");
        }
}
