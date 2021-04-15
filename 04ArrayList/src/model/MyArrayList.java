package model;


import interfaces.IList;

public class MyArrayList<E> implements IList<E> {
    private Object[] elementData;
    private int size;
    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;

    public MyArrayList(int capacity) {
        if (capacity > MAX_ARRAY_SIZE) {
            capacity = MAX_ARRAY_SIZE;
        }
        if (capacity < 0) {
            throw new IllegalArgumentException("Illegal capacity " + capacity);
        }
        elementData = new Object[capacity];

    }

    public MyArrayList() {
        //elementData=new Object[10];
        this(10);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int indexOf(Object elem) {
        if (elem == null) {
            for (int i = 0; i < size; i++) {
                if (elementData[i] == null) {
                    return i;
                }
            }
            for (int i = 0; i < size; i++) {
                if (elem.equals(elementData[i])) {
                    return i;
                }
            }
        }
        return -1;
    }


    @Override
    public int lastIndexOf(Object elem) {
        if (elem == null) {
            for (int i = size - 1; i >= 0; i--) {
                if (elementData[i] == null) {
                    return i;
                }
            }
        }
        for (int i = size - 1; i >= 0; i--) {
            if (elem.equals(elementData[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public E get(int index) {
        checkIndex(index);
        return (E) elementData[index];
    }

    @Override
    public E set(int index) {
        return null;
    }


    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
        }
    }

    @Override
    public boolean add(int index, E elem) {
        checkIndex(index);
        ensureCapacity();
        for (int i = size - 1; i >= index; i--) {
            elementData[i + 1] = elementData[i];
            elementData[index] = elem;
            size++;
        }


        return false;
    }

    @Override
    public boolean add(Object elem) {
        ensureCapacity();
        elementData[size++] = elem;
        return false;
    }

    @Override
    public boolean remove(E elem) {
        if (elem != null) {
            int index = indexOf(elem);
            E resElem = remove(index);
            return true;
        }
        return false;
    }

    @Override
    public E remove(int index) {
        checkIndex(index);
        E resElem = (E) elementData[index];
        Object[] newArray = new Object[elementData.length - 1];
//        for (int i = 0; i < index; i++) {
//            newArray[i] = elementData[i];
//        }
//        for (int i = index; i < newArray.length; i++) {
//            newArray[i] = elementData[i + 1];
//        }
//        elementData = newArray;
//        size--;
        System.arraycopy(elementData, index + 1, elementData, index, size - index + 1);
        return resElem;

    }


    private void ensureCapacity() {
        if (size == MAX_ARRAY_SIZE) {
            throw new OutOfMemoryError();
        }
        if (size == elementData.length) {
            int oldCapacity = elementData.length;
            int newCapacity = oldCapacity + oldCapacity * 2;
            if (newCapacity < 0 || newCapacity > MAX_ARRAY_SIZE) {
                newCapacity = MAX_ARRAY_SIZE;
            }
            grow(newCapacity);
        }
    }

    private void grow(int newCapacity) {
//        elementData= Arrays.copyOf(elementData,newCapacity);
        Object[] newArray = new Object[newCapacity];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = elementData[i];
        }
        elementData = newArray;
    }

    @Override
    public void clear() {
        Object[] newArray = new Object[0];
        elementData = newArray;
        size = 0;
    }

}
