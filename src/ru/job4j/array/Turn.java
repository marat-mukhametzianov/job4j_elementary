package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {

        int temp;
        for (int i = 0; i < array.length; i++) {
            if (array.length - 1 - i <= i) {
                break;
            }
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }
}
