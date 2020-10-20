package ru.job4j.condition;

public class MultiMax {
    public static int maxShort(int first, int second, int third) {
        return  (first > second ? first : second) > third ? first > second ? first : second : third;
    }

    public static int maxLong(int first, int second, int third) {
        int intermediateMax = first > second ? first : second;
        int result = intermediateMax > third ? intermediateMax : third;
        return result;
    }
}
