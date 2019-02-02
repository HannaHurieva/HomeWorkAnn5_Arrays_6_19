package Arrays_6_19.task_13;

import Arrays_6_19.InputArray;

import java.util.Arrays;

/*13. В заданном одномерном массиве поменять местами соседние элементы,
 стоящие на четных местах, с элементами, стоящими на нечетных.*/
public class task_13 {
    public static void main(String[] args) {
        int n = InputArray.getLengthOfSequence();
        int[] inputArray = InputArray.getArray(n);
        changeEvenAndOdd(inputArray);
        System.out.println(Arrays.toString(inputArray));
    }
    public static void changeEvenAndOdd (int [] elements) {
        for (int i = 0; i < elements.length-1 ; i=i+2) {
            swap(elements, i, i + 1);
        }
    }
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}