package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int i = 0; i < post.length; i++) {
            char postChar = post[post.length - 1 - i];
            char wordChar = word[word.length - 1 - i];
            if (postChar != wordChar) {
                result = false;
            }
        }

        return result;
    }
}
