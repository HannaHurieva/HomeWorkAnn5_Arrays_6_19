package Arrays_6_19.task_16;

import Arrays_6_19.InputArray;

import java.io.PrintStream;

/*16. В одномерном массиве размещены: в первых элементах значения аргумента, в следующих – соответствующие им значения функции.
Напечатать элементы этого массива в nпараллельных столбцов (аргумент и значения функции).*/
public class task_16 {
    public static void main(String[] args) {
        int n = InputArray.getLengthOfSequence();
        int[] inputArray = InputArray.getArray(n);
        int middle = inputArray.length/2;
        System.out.println("Argument Function");
        for (int i = 0; i < middle; i++) {
          System.out.printf("%5d%9d\n",inputArray[i],inputArray[middle + i]);
        }
    }
}