package week6;

import java.util.Arrays;
import java.util.Random;

public class ArrayPlay {

    public static void main(String[] args) {
        String[] words = {"hello", "world", "goodbye", "cruel", "big", "bad", "content"};

        int index = findWord(words, "big");

        if (index != -1) {
            System.out.printf("Found '%s' at index %d%n", words[index], index);
        } else {
            System.out.println("'big' not found");
        }

        if (index != -1) {
            words[index] = "bigger";
        }

        index = findWord(words, "big");
        if (index != -1) {
            System.out.printf("Found '%s' at index %d%n", words[index], index);
        } else {
            System.out.println("'big' not found after update");
        }

        System.out.println("Updated array: " + Arrays.toString(words));

        int[] randoms = createRandArr(10);
        printArray(randoms);

        int average = arrAvg(randoms);
        System.out.printf("The average of these numbers is %d%n", average);

        System.out.print("Numbers: ");
        for (int num : randoms) {
            System.out.printf("%d, ", num);
        }
        System.out.println();

        System.out.print("Words: ");
        for (String word : words) {
            System.out.printf("%s, ", word);
        }
        System.out.println();

        System.out.println("Letters:");
        for (String word : words) {
            for (char letter : word.toCharArray()) {
                System.out.printf("%c ", letter);
            }
            System.out.println();
        }
    }

    private static int[] createRandArr(int size) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }
        return arr;
    }

    private static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    private static int arrAvg(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total / arr.length;
    }

    public static int findWord(String[] arr, String target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }
}
