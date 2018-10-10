import java.util.Arrays;

public class MyList<T> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
        size = DEFAULT_CAPACITY;
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void add(T objT) {
        this.add(size, objT);
    }

    public void add(int index, T element){
        if (index >= elements.length) {
            this.ensureCapacity(index+1);
            size = index + 1;
        } else {
            size +=1;
            if (size > elements.length) {
                this.ensureCapacity(size);
            }
        }

        for (int i = index; i < size; i++) {
            elements[i+1] = elements[i];
        }
        elements[index] = element;
    }

    public void remove(int index) {
        if (index>=0 && index<size) {
            for (int i = index; i < size; i++) {
                elements[i] = elements[i + 1];
            }
            size--;
        }
    }

    public int size() {
        return size;
    }

    public MyList clone() {
        return this;
    }

    public boolean contains(T objT) {
        for (int i = 0; i < size ; i++) {
            if (elements[i] == objT) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(T objT) {
        for (int i = 0; i < size ; i++) {
            if (elements[i] == objT) {
                return i;
            }
        }
        return -1;
    }

    public void ensureCapacity(int minCapacity) {
        while (minCapacity <= elements.length) {
            elements = Arrays.copyOf(elements, elements.length*2);
        }
    }

    public T get(int index) {
        return (T) elements[index];
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        };
    }

    public void printList() {
        System.out.println("My list is:");
        for (int i = 0; i < size ; i++) {
            System.out.println(elements[i]);
        }
    }
}
