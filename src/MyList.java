import java.util.Arrays;

public class MyList <E> {
    private int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    Object elements[];

    public MyList(){
        elements = new Object[0];
    }
    public MyList(int capacity){
        this.size = capacity;
        elements = new Object[size];
    }

    public E remove(int index){
       return null;
    }

    public int size(){
        return elements.length;
    }

    public E clone(){
        return (E)elements;
    }

    public boolean contains(E e){
        for (Object obj : elements){
            if (((E) obj).equals(e)){
                return  true;
            }
        }
        return false;
    }

    public int indexOf(E e){
        int index = 0;
        for (int i = 0; i < elements.length; i++){
            if (((E)elements[i]).equals(e)){
                index = i;
            }
        }
       return index;
    }

    public boolean add(E e){
        ensureCapacity(1);
        elements[elements.length - 1] = e;
        return true;
    }

    public void ensureCapacity(int minCapacity){
            elements = Arrays.copyOf(elements, elements.length+minCapacity);
    }

    public E get(int index){
        return (E)elements[index];
    }

    public void clear(){
        elements = Arrays.copyOf(elements, 0);
    }
}

