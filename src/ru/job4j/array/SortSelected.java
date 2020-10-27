package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        int temp;
        for (int i = 0; i < data.length; i++) {
            int minValueInRange = MinDiapason.findMin(data, i, data.length - 1);
            int indexOfMinValueInRange = FindLoop.indexOf(data, minValueInRange, i, data.length - 1);
            temp = data[i];
            data[i] = minValueInRange;
            data[indexOfMinValueInRange] = temp;

        }
        return data;
    }
}
