package Lesson2;

import java.util.stream.IntStream;

public class SpiralMatrix {

    public int[][] getSpiralMatrix(int n) {

        int [][] matrix = new int[n][];
        IntStream.range(0, n).forEach(i -> matrix[i] = new int[n]);

        int x = 0;
        int y = 0;
        int z = n;
        for (int i = 0, j = n * n; i < j;) {
            matrix[x][y] = ++i;

            if (x < z + (n - z) / 2 - 1 && y == (n - z) / 2) {
                x++;
            } else if (x == z + (n - z) / 2 - 1 && y < z + (n - z) / 2 - 1) {
                y++;
            } else if (x > (n - z) / 2 && y == z + (n - z) / 2 - 1) {
                x--;
            } else if (x == (n - z) / 2 && y > (n - z) / 2 + 1) {
                y--;
            } else {
                x++;
                z -= 2;
            }
        }

        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        IntStream.range(0, matrix.length).forEach(i -> {
            IntStream.range(0, matrix.length).forEach(j -> System.out.printf("%02d ", matrix[j][i]));
            System.out.println();
        });
    }
}
