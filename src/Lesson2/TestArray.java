package Lesson2;

public class TestArray {
    private int[] arr;
    private int size;

    public TestArray(int size) {
        this.size = 0;
        this.arr = new int[size];
    }

    public boolean binaryFind(int value) {
        int low = 0;
        int high = this.size - 1;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (value == this.arr[mid]) {
                return true;
            } else {
                if (value < this.arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        return false;
    }

    public boolean find(int value) {
        int i;
        for (i = 0; i < this.size; i++) {
            if (this.arr[i] == value) {
                return true;
            }
        }
        return false;
    }

    public void display() {
        for (int i = 0; i < this.size; i++) {
            System.out.println(this.arr[i]);
        }
    }

    public void delete(int value) {
        int i;
        for (i = 0; i < this.size; i++) {
            if (this.arr[i] == value) {
                break;
            }
        }

        for (int j = i; j < this.size - 1; j++) {
            this.arr[j] = this.arr[j + 1];
        }
        this.size--;
    }

    public void insert_sorted(int value) {
        int i;
        for (i = 0; i < this.size; i++) {
            if (this.arr[i] > value) {
                break;
            }
        }
        for (int j = this.size; j > i; j--) {
            this.arr[j] = this.arr[j - 1];
        }
        this.arr[i] = value;
        this.size++;
    }

    public void insert(int value) {
        this.arr[this.size] = value;
        this.size++;
    }

    public void clear() {
        for (int i = 0; i < this.size; i++) {
            this.arr[0] = 0;
        }
        this.size = 0;
    }


    public static void quickSort(int[] array, int start, int finish) {
        int i = start;
        int j = finish;
        int x = array[start + (finish - start) / 2];
        while (i <= j) {
            while (array[i] < x) {
                i++;
            }
            while (array[j] > x) {
                j--;
            }
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (start < j) {
            quickSort(array, start, j);
        }
        if (i < finish) {
            quickSort(array, i, finish);
        }
    }


    public static void bubbleSort(int[] array, int start, int end) {
        int er;
        while (true) {
            er = 0;
            for (int j = start; j < end; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                    er++;
                }
            }
            if (er == 0) break;
            end--;
        }
    }


    public static void quickSortOptimize(int[] array, int start, int finish) {
        int i = start;
        int j = finish;
        int x = array[start + (finish - start) / 2];
        while (i <= j) {
            while (array[i] < x) {
                i++;
            }
            while (array[j] > x) {
                j--;
            }
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (start < j && (j - start) <= 7) {
            bubbleSort(array, start, j);
        }
        else if (start < j) {
            quickSort(array, start, j);
        }

        if (i < finish && (finish - i) <= 7) {
            bubbleSort(array, i, finish);
        } else if (i < finish) {
            quickSort(array, i, finish);
        }
    }


    public static void combinedSort(int[] array, int start, int end) {
        int j;
        double step = end / 1.247;
        while (true) {
            j = start + (int) step - 1;
            if (j == start) break;
            for (int i = start; j < end; i++) {
                if (array[i] > array[j]) {
                    int t = array[i];
                    array[i] = array[j];
                    array[j] = t;
                }
                j++;
            }
            step /= 1.247;
        }
    }
}

