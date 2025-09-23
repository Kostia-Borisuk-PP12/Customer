package app16;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 3};
        int[] sorted = ArrayUtils.mergeSort(numbers);
        System.out.println("Відсортований масив: " + Arrays.toString(sorted));

        int target = 3;
        int index = ArrayUtils.binarySearch(sorted, target);
        System.out.println("Індекс числа " + target + ": " + index);

        System.out.println("\n=== Інформація про методи (через анотації) ===");
        for (Method method : ArrayUtils.class.getDeclaredMethods()) {
            if (method.isAnnotationPresent(MethodInfo.class) &&
                    method.isAnnotationPresent(Author.class)) {

                MethodInfo methodInfo = method.getAnnotation(MethodInfo.class);
                Author author = method.getAnnotation(Author.class);

                System.out.println("Метод: " + methodInfo.name());
                System.out.println("Тип повернення: " + methodInfo.returnType());
                System.out.println("Опис: " + methodInfo.description());
                System.out.println("Автор: " + author.firstName() + " " + author.lastName());
                System.out.println("----------------------");
            }
        }
    }
}
