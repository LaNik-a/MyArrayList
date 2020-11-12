package ru.hse.cs.seminar05;

import java.util.Arrays;

// для создания тестов option+enter по классу
public class MyArrayList<T> implements MyArrayIList<T> {
    // Дефолтное capacity
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elementsData = new Object[DEFAULT_CAPACITY];
    // Количество элементов в списке
    private int countElements = 0;

    @Override
    public T get(int index) {
        return (T) elementsData[index];
    }

    @Override
    public void put(T element) {

        if (countElements >= elementsData.length) {
            ensureCapacityInternal();
        }
        elementsData[countElements] = element;
        countElements++;
    }


    @Override
    public int size() {
        return countElements;
    }

    @Override
    public boolean contains(T element) {
        boolean containsElem = false;
        for (int i = 0; i < countElements; i++) {
            if (elementsData[i].equals(element)) {
                containsElem = true;
                break;
            }
        }
        return containsElem;
    }


    @Override
    public void clear() {
        Arrays.fill(elementsData, null);
        countElements = 0;
    }

    /**
     * Изменение capacity у ArrayList
     */
    private void ensureCapacityInternal() {
        int oldCapacity = elementsData.length;
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        resizeMassive(newCapacity);
    }

    /**
     * Создание ArrayList с новым capacity и копирование туда элементов из старого ArrayList
     *
     * @param newCapacity новое capacity для ArrayList
     */
    private void resizeMassive(int newCapacity) {
        Object[] newArray = new Object[newCapacity];
        System.arraycopy(elementsData, 0, newArray, 0, countElements);
        elementsData = newArray;
    }
}
