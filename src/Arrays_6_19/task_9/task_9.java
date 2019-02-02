package Arrays_6_19.task_9;

import Arrays_6_19.InputArray;

/*9. Дан массив действительных чисел, размерность которого N.
Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.*/
public class task_9 {
    public static void main(String[] args) {
        int n = InputArray.getLengthOfSequence();
        int[] inputArray = InputArray.getArray(n);
        int[] result = getNumberSign(inputArray);
        System.out.println("Count of positive numbers in the sequence = " + result[0]);
        System.out.println("Count of negative numbers in the sequence = " + result[1]);
        System.out.println("Count of zeros in the sequence = " + result[2]);
    }
    public static int[] getNumberSign(int[] elements) {
        int countPositive = 0;
        int countNegative = 0;
        int countZero = 0;
        for (int number : elements) {
            if (number > 0) {
                countPositive++;
            } else {
                if (number < 0) {
                    countNegative++;
                } else {
                    countZero++;
                }
            }
        }
        int[] numberSign = {countPositive, countNegative, countZero};
        return numberSign;
    }
}