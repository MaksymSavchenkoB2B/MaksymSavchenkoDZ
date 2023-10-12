public class TXTHandler extends AbstractHandler{  @Override
public void open() {
    System.out.println("TXT document opened");
}

    @Override
    public void create() {
        System.out.println("TXT document created");
    }

    @Override
    public void change() {
        System.out.println("TXT document changed");
    }

    @Override
    public void save() {
        System.out.println("TXT document saved");
    }
}
