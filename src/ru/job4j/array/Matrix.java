package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] timesTable = new int[size][size];
        for (int row = 0; row < timesTable.length; row++) {
            for (int cell = 0; cell < timesTable.length; cell++) {
                timesTable[row][cell] = (row + 1) * (cell + 1);
            }
        }
        return timesTable;
    }
}
