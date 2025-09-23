package app16;

import java.util.Arrays;

public class ArrayUtils {

    @MethodInfo(
            name = "mergeSort",
            returnType = "int[]",
            description = "Сортує масив за допомогою алгоритму злиття"
    )
    @Author(firstName = "Ivan", lastName = "Petrenko")
    public static int[] mergeSort(int[] array) {
        if (array.length <= 1) {
            return array;
        }
        int mid = array.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(array, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(array, mid, array.length));
        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }
        while (i < left.length) result[k++] = left[i++];
        while (j < right.length) result[k++] = right[j++];
        return result;
    }

    @MethodInfo(
            name = "binarySearch",
            returnType = "int",
            description = "Здійснює бінарний пошук у відсортованому масиві"
    )
    @Author(firstName = "Olena", lastName = "Koval")
    public static int binarySearch(int[] array, int target) {
        int left = 0, right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}

