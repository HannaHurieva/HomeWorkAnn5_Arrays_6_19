package Arrays_6_19.task_15;

import Arrays_6_19.InputArray;

import java.util.Arrays;

/*15. Дана последовательность чисел, среди которых имеется один нуль.
Вывести на печать все числа, включительно до нуля.*/
public class task_15 {
    public static void main(String[] args) {
        int n = InputArray.getLengthOfSequence();
        int[] inputArray = InputArray.getArray(n);
        int lengthToPrint = getIndexByZeroInArray(inputArray) + 1;
        int[] newArray = Arrays.copyOf(inputArray, lengthToPrint);
        System.out.println("The sequence of numbers including zero : " + Arrays.toString(newArray));
    }
    public static int getIndexByZeroInArray(int[] elements) {
        int index = 0;
        for (int number : elements) {
            if (!(number == 0)) {
                index++;
            } else break;
        }
        return index;
    }
}