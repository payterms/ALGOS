package Lesson5;

import Lesson5.MyArrBinaryFind.ResultValue;

import java.util.NoSuchElementException;

class MyArrBinaryFind {
    private int[] arr;
    private int size;
    ResultValue result;

    public MyArrBinaryFind(int size) {
        this.size = 0;
        this.arr = new int[size];
        this.result = new ResultValue();
    }

    public ResultValue binaryFind(int search) {
        return recBinaryFind(search, 0, size - 1);
    }

    class ResultValue {
        boolean isFound;
        int index;

        @Override
        public String toString() {
            return ("Found at index: " + index);
        }
    }

    private ResultValue recBinaryFind(int searchKey, int low, int high) {
        int curIn;
        curIn = (low + high) / 2;
        if (arr[curIn] == searchKey) {
            // Элемент найден
            result.isFound = true;
            result.index = curIn;
            return result;
        } else if (low > high)
            throw new NoSuchElementException("No such value!");
            //return size;
        else {
            if (arr[curIn] < searchKey)
                return recBinaryFind(searchKey, curIn + 1, high);
            else
                return recBinaryFind(searchKey, low, curIn - 1);
        }
    }

    public void insert(int value) {
        int i;
        for (i = 0; i < this.size; i++) {
            if (this.arr[i] > value)
                break;
        }
        for (int j = this.size; j > i; j--) {
            this.arr[j] = this.arr[j - 1];
        }
        this.arr[i] = value;
        this.size++;
    }
}

