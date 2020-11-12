package ru.hse.cs.seminar05;

public interface MyArrayIList<T> {
    /**
     * Получение элемента по индексу
     * @param index индекс
     * @return элемент типа Т
     */
    T get (int index);

    /**
     * Добавление в конец ArrayList элемента
     * @param element элемент типа Т
     */
    void put (T element);

    /**
     * Возвращает количество элементов в списке
     * @return количество элементов
     */
    int size();

    /**
     * Проверяет содержится ли элемент в списке
     * @param element элемент типа Т
     * @return если содержится -> true иначе false
     */
    boolean contains (T element);

    /**
     * очистка списка от элементов
     */
    void clear();
}
