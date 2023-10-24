import java.util.Arrays;

public class MyList<T> {
    private Object[] array;
    private int size;

    public MyList() {
        array = new Object[10];
        size = 0;
    }


    public void add(T element) {
        if (size == array.length) {
            array = Arrays.copyOf(array, array.length * 2);
        }
        array[size] = element;
        size++;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("There is no such index");
        }
        return (T) array[index];
    }


    public int getSize() {
        return size;
    }
}
