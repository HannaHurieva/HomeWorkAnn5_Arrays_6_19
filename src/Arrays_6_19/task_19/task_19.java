package Arrays_6_19.task_19;

import Arrays_6_19.InputArray;

/*19. Дан целочисленный массив с количеством элементов n.
Напечатать те его элементы, индексы которых являются степенями двойки (1, 2, 4, 8, 16, ...).*/
public class task_19 {
    public static void main(String[] args) {
        int n = InputArray.getLengthOfSequence();
        int[] inputArray = InputArray.getArray(n);
        System.out.println("There are elements whose indices are powers of two :");
        System.out.print("[ ");
        for (int i = 1; i < inputArray.length; i *= 2) {
            if (i != 1) System.out.print(", ");
            System.out.print(inputArray[i]);
        }
        System.out.println(" ]");
    }
}