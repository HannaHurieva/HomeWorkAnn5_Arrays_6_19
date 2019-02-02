package Arrays_6_19.task_7;

import Arrays_6_19.InputArray;

import java.util.Arrays;
import java.util.Scanner;

/*7. Дана последовательность действительных чисел a1, a2, ..., an.
Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен.*/
public class task_7 {
    public static void main(String[] args) {
        int n = InputArray.getLengthOfSequence();
        int[] inputArray = InputArray.getArray(n);
        Scanner in = new Scanner(System.in);
        System.out.println("Input Z:");
        int z = in.nextInt();
        int numberOfReplacements = getReplacements_to_z(inputArray, z);
        System.out.println(Arrays.toString(inputArray));
        System.out.println("Replacements to Z in the array: " + numberOfReplacements);
    }
    public static int getReplacements_to_z(int[] elements, int target) {
        int j = 0;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] > target) {
                elements[i] = target;
                j++;
            }
        }
        return j;
    }
}