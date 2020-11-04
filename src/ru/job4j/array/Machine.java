package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    private final int[] COINS = {10, 5, 2, 1};

    public int[] changeOnce(int money, int price) {
        int[] result = new int[100];
        int emptyCellPointer = 0;
        int number = money - price;
        for (int i = 0; i < COINS.length; i++) {
            int numberQuantity = number / COINS[i];
            int leftover = number % COINS[i];
            if (numberQuantity >= 1) {
                for (int counter = 1; counter <= numberQuantity; counter++) {
                    result[emptyCellPointer] = COINS[i];
                    emptyCellPointer += 1;
                }
                if (leftover != 0) {
                    number = leftover;
                } else {
                    break;
                }
            }
        }
        return Arrays.copyOf(result, emptyCellPointer);
    }

    public int[] change(int money, int price) {
        int[] result = new int[100];
        byte emptyCellPointer = 0;
        int delta = money - price;
        for (byte i = 0; i < COINS.length; i++) {
            while (delta >= COINS[i]) {
                result[emptyCellPointer] = COINS[i];
                delta -= COINS[i];
                emptyCellPointer++;
            }
            if (delta == 0) {
                break;
            }
        }
        return Arrays.copyOf(result, emptyCellPointer);
    }
}
