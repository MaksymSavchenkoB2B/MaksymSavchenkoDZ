public class XMLHandler extends AbstractHandler {
    @Override
    public void open() {
        System.out.println("XML document opened");
    }

    @Override
    public void create() {
        System.out.println("XML document created");
    }

    @Override
    public void change() {
        System.out.println("XML document edited");
    }

    @Override
    public void save() {
        System.out.println("XML document saved");
    }
}
