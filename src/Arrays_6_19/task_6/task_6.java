package Arrays_6_19.task_6;

import Arrays_6_19.InputArray;

/*6. Дана последовательность чисел a1, a2, ..., an.
 Указать наименьшую длину числовой оси, содержащую все эти числа.*/
public class task_6 {
    public static void main(String[] args) {
        int n = InputArray.getLengthOfSequence();
        int[] inputArray = InputArray.getArray(n);
        int axleLength = getAxleLength(inputArray);
        System.out.println("The shortest length of the number axis containing all numbers of these sequence = " + axleLength);
    }
    public static int getAxleLength(int[] elements) {
        int max = elements[0];
        int min = elements[0];
        int diff = 0;
        for (int i = 1; i < elements.length; i++) {
            if (elements[i] > max) {
                max = elements[i];
            } else if (elements[i] < min) {
                min = elements[i];
            }
        }
        diff = max - min;
        return diff;
    }
}