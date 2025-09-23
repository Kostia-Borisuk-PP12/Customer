package app14;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();


        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);
        }

        System.out.println("Початковий масив: " + Arrays.toString(numbers));

        ArrayUtils.mergeSort(numbers);
        System.out.println("Відсортований масив: " + Arrays.toString(numbers));

        int target = numbers[rand.nextInt(numbers.length)];
        System.out.println("Шукаємо число: " + target);

        int index = ArrayUtils.binarySearch(numbers, target);
        if (index != -1) {
            System.out.println("Знайдено " + target + " на індексі " + index);
        } else {
            System.out.println("Число " + target + " не знайдено");
        }
    }
}

