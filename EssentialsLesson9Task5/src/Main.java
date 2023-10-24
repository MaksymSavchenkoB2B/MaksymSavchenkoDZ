public class Main {
public static void main(String[] args) {

    MyClass<Integer> myInteger = new MyClass<>(100);
    System.out.println(myInteger.getType());

    MyClass<Double> myDouble = new MyClass<>(23.3);
    System.out.println(myDouble.getType());

    MyClass<String> myString = new MyClass<>("Generics are hard");
    System.out.println(myString.getType());
}
}