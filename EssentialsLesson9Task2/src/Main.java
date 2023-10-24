public class Main {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();

        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);

        System.out.println("Element with index 2: " + myList.get(2));
        System.out.println("Amount of elements: " + myList.getSize());
    }
}