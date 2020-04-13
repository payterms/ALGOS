package Lesson3;

import java.util.Arrays;

public class MyDeque<Item> {

    private Item[] list;
    private int capacity;
    private int head;
    private int tail;
    private int size;
    private final int DEFAULT_CAPACITY = 10;

    public MyDeque(int capacity) {
        this.capacity = capacity;
        list = (Item[])new Object[capacity];
        size = 0;
        head = 0;
        tail = -1;
    }

    public MyDeque() {
        list = (Item[])new Object[DEFAULT_CAPACITY];
        size = 0;
        head = 0;
        tail = -1;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getHead() {
        return head;
    }

    public int getTail() {
        return tail;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isFull() {
        return capacity == size;
    }

    public void insertLeft(Item item) {
        if (isFull()) {
            throw new StackOverflowError();
        }
        if (--head < 0) {
            head = capacity - 1;
        }
        list[head] = item;
        size++;
    }

    public Item removeLeft() {
        if (++head > capacity - 1)
            head = 0;
        size--;
        return list[head - 1];
    }

    public void insertRight(Item item) {
        if (isFull()) {
            throw new StackOverflowError();
        }
        if (++tail > capacity){
            tail = 0;
        }
        list[tail - 1] = item;
        size++;
    }

    public Item removeRight() {
        if (--tail < 0) tail = capacity - 1;
        size--;
        return list[tail];
    }

    @Override
    public String toString() {
        return "MyDeque{" +
                "array=" + Arrays.toString(list) +
                '}';
    }
}