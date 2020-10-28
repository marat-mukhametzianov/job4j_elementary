package ru.job4j.array;

public class JaggedArray {
    public static void main(String[] args) {
        int[][] array = {
                {1},
                {1, 2},
                {1, 2, 3},
                {1, 2, 3, 4}
        };
        for (int i = 0; i < array.length; i++) {
            System.out.println("Размер вложенного массива № " + (i + 1) + " равен " + array[i].length);
        }
    }
}
