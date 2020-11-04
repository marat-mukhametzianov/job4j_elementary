package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int i = 0; i < pref.length; i++) {
            char p = pref[i];
            char w = word[i];
            if (w != p) {
                result = false;
                break;
            }
        }
        return result;
    }
}
