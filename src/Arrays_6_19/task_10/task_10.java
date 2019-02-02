package Arrays_6_19.task_10;

import Arrays_6_19.InputArray;

import java.util.Arrays;

/*10. Даны действительные числа a1, a2, …, an.
Поменять местами наибольший и наименьший элементы.*/
public class task_10 {
    public static void main(String[] args) {
        int n = InputArray.getLengthOfSequence();
        int[] inputArray = InputArray.getArray(n);
        getSwapArray(inputArray);
        System.out.println("The sequence where minimum and maximum are swapped:");
        System.out.println(Arrays.toString(inputArray));
    }
    public static void getSwapArray(int[] elements) {
        int max = elements[0];
        int indexMax = 0;
        int min = elements[0];
        int indexMin = 0;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] > max) {
                max = elements[i];
                indexMax = i;
            }
            if (elements[i] < min) {
                min = elements[i];
                indexMin = i;
            }
        }
        swapElements(elements, indexMin, indexMax);
    }
    public static void swapElements(int[] array, int min, int max) {
        int temp = array[max];
        array[max] = array[min];
        array[min] = temp;
    }
}