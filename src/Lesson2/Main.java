package Lesson2;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();

        int ARR_SIZE = 1_000_000;
        TestArray arr = new TestArray(ARR_SIZE);

        long before = System.currentTimeMillis();
        //Время заполнения массива :175188 ms для ARR_SIZE = 1_000_000
        for (int i = 0; i < ARR_SIZE; i++) {
            arr.insert_sorted(random.nextInt());
        }
        long after = System.currentTimeMillis();
        long time = after - before;

        System.out.println(" Время заполнения массива c сортировкой :" + time + " ms");

        before = System.currentTimeMillis();
        for (int i = 0; i < ARR_SIZE; i++) {
            arr.insert(random.nextInt());
        }
        after = System.currentTimeMillis();
        time = after - before;

        System.out.println(" Время заполнения массива без сортировки :" + time + " ms");

        before = System.currentTimeMillis();
        arr.find(random.nextInt());
        after = System.currentTimeMillis();
        time = after - before;

        System.out.println(" Время поиска элемента :" + time + " ms");

        int[] array = new int[ARR_SIZE];

        for (int i = 0; i < ARR_SIZE; i++) {
            array[i] = random.nextInt();
        }

        before = System.currentTimeMillis();
        TestArray.quickSort(array, 0, ARR_SIZE-1);
        after = System.currentTimeMillis();
        time = after - before;

        System.out.println(" Время сортировки quickSort :" + time + " ms");

        for (int i = 0; i < ARR_SIZE; i++) {
            array[i] = random.nextInt();
        }

        before = System.currentTimeMillis();
        // Очень долго сортирует !!!!
        TestArray.bubbleSort(array, 0, ARR_SIZE-1);
        after = System.currentTimeMillis();
        time = after - before;

        System.out.println(" Время сортировки bubbleSort :" + time + " ms");

        for (int i = 0; i < ARR_SIZE; i++) {
            array[i] = random.nextInt();
        }

        before = System.currentTimeMillis();
        TestArray.combinedSort(array, 0, ARR_SIZE-1);
        after = System.currentTimeMillis();
        time = after - before;

        System.out.println(" Время сортировки combSort :" + time + " ms");

        for (int i = 0; i < ARR_SIZE; i++) {
            array[i] = random.nextInt();
        }

        for (int i = 0; i < ARR_SIZE; i++) {
            array[i] = random.nextInt();
        }

        before = System.currentTimeMillis();
        TestArray.quickSortOptimize(array, 0, ARR_SIZE-1);
        after = System.currentTimeMillis();
        time = after - before;

        System.out.println(" Время сортировки quickSortOptimize :" + time + " ms");


        /*  1 Задать размерность матрицы от 5 до 7
            2 Создать матрицу с указанной размерностью
            3 Заполнить матрицу по спирали (числа увеличиваются на 1) (число начинается с 1)*/

        SpiralMatrix sp = new SpiralMatrix();
        int n = 7;

        int[][] matrix = sp.getSpiralMatrix(n);
        SpiralMatrix.printMatrix(matrix);

    }
}
