package generic;

import java.lang.reflect.Array;

public class JavaList<E> implements IList<E>{

    private int initialCapacity = 4;
    private int size;

    private E[] elements ;

    public JavaList(){
        elements = create(initialCapacity);
    }

    // capacity : sức chứa .
    public JavaList(int capacity){
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity should be greater than 0");
        }
        if (capacity > initialCapacity){
            initialCapacity = capacity;
        }
        elements = create(initialCapacity);

    }

    @SuppressWarnings("unchecked")
    private E[] create(int size){
        return (E[])Array.newInstance(Object.class, size);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean add(E t) {
        if (size < initialCapacity){
            elements[size++] = t;
            return true;
        }

        // new array .
        elements = grow(t );
        return true;
    }

    @Override
    public boolean remove(int i) {
        if (i < 0 || i >= size){
            throw new ArrayIndexOutOfBoundsException("Index " +i+ " out of bounds exception!");
        }
        E[] newElements = create(size - 1);
        return true;
    }

    @Override
    public E get(int i) {
        if (i < 0 || i >= size){
            throw new ArrayIndexOutOfBoundsException("Index "+i+ " out of bound exception ");
        }
        return elements[i];
    }

    @Override
    public void set(int i, E t) {
        if (i < 0 || i >= size){
            throw new ArrayIndexOutOfBoundsException("Index "+i+ " out of bound exception ");
        }
         elements[i] = t;
    }

    @Override
    public void Show() {

        for (int i = 0; i < size; i++) {
            System.out.print("\n"+elements[i]+" ");
        }
    }

    private E[] grow(E e){
        // new array .
        E[] newElements = create(size + 1 );
        for (int i = 0; i < size; i++) {
            newElements[i] = elements[i];
        }
        newElements[size++] = e;
        return newElements;
    }

    @Override
    public int count(Predicate<E> cond) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (cond.test(elements[i])){
                count++;
            }
        }
        return count;
    }
}
