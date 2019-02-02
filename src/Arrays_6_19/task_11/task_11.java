package Arrays_6_19.task_11;

import Arrays_6_19.InputArray;

import java.util.Arrays;

/*11. Даны целые числа a1 a2, .... аn.
Вывести напечать только те числа, для которых выполняется условие аi ≤ i.*/
public class task_11 {
    public static void main(String[] args) {
        int n = InputArray.getLengthOfSequence();
        int[] inputArray = InputArray.getArray(n);
        int[] resultArray = getArrayWithCondition(inputArray);
        System.out.println("The numbers of sequence for which the condition ai ≤ i is satisfied :");
        System.out.println(Arrays.toString(resultArray));
    }
    public static int[] getArrayWithCondition(int[] elements) {
        int[] newArray = new int [elements.length];
        int j = 0;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] <= i) {
                newArray[j] = elements[i];
                j++;
            }
        }
        if (j == 0) {
            System.out.println("The sequence does not contain numbers for which the condition ai ≤ i is satisfied. ");
            System.exit(0);
        }
        int[] resultArray = Arrays.copyOf(newArray, j);
        return resultArray;
    }
}