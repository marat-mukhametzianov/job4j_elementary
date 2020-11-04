package ru.job4j.loop;

public class Board {
    public static void paint(int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int inRow = 1; inRow <= width; inRow++) {
                if ((inRow + i) % 2 != 0) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            /**
             *  добавляем перевод на новую строку.
             *  */
            System.out.println();
        }
    }

    public static void main(String[] args) {
        paint(3, 3);
        System.out.println();
        paint(5, 4);
    }
}
