package Arrays_6_19.task_12;

import Arrays_6_19.InputArray;

import java.util.Arrays;
import java.util.Scanner;

/*12. Даны натуральные числа a1, a2, ..., an.
Указать те, у которых остаток от деления на М равен L (0 ≤ L ≤ М – 1).*/
public class task_12 {
    public static void main(String[] args) {
        int n = InputArray.getLengthOfSequence();
        int[] inputArray = InputArray.getArray(n);
        Scanner in = new Scanner(System.in);
        System.out.println("Input condition: 1) divider M :");
        int M = in.nextInt();
        System.out.println("2) L - remainder of division by M (0 ≤ L ≤ М – 1) :");
        int L = in.nextInt();
        int[] resultArray = getArrayRemainderOfDivision(inputArray, M, L);
        System.out.println("The numbers of sequence for which the condition is satisfied :");
        System.out.println(Arrays.toString(resultArray));
    }
    public static int[] getArrayRemainderOfDivision(int[] elements, int divider, int remainder) {
        int[] newArray = new int[elements.length];
        int j = 0;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] % divider == remainder) {
                newArray[j] = elements[i];
                j++;
            }
        }
        if (j == 0) {
            System.out.println("The sequence does not contain numbers for which the condition: remainder of division by M = L (0 ≤ L ≤ М – 1) - is satisfied. ");
            System.exit(0);
        }
        int[] resultArray = Arrays.copyOf(newArray, j);
        return resultArray;
    }
}