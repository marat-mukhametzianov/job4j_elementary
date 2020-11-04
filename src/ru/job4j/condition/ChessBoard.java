package ru.job4j.condition;

public class ChessBoard {
    public static int rookWay(int x1, int y1, int x2, int y2) {
        int result = 0;
        if (x1 == x2 || y1 == y2) {
            result = Math.abs(x2 - x1);
            result = result == 0 ? Math.abs(y2 - y1) : result;
        }
        return result;
    }

    public static int knightWay(int x1, int y1, int x2, int y2) {
        int result = 0;
        if (x1 < 0 || x2 < 0 || y1 < 0 || y2 < 0) {
            return result;
        }
        if (Math.abs(x2 - x1) == Math.abs(y2 - y1)) {
            result = Math.abs(x2 - x1);
        }
        return result;
    }
}
