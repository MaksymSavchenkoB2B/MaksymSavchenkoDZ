public class MyClass<T> {
    private T type;
    public MyClass(T type) {
        this.type = type;
    }
    public static <T> MyClass<T> factoryMethod() {
        return new MyClass<>(null);
    }
    public T getType() {
        return type;
    }
    public void setType(T data) {
        this.type = data;
    }
}
