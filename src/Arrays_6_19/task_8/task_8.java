package Arrays_6_19.task_8;

import Arrays_6_19.InputArray;

import java.util.Scanner;

/*8. Последовательность действительных чисел оканчивается нулем.
Найти количество членов этой последовательности.*/
public class task_8 {
    public static void main(String[] args) {
        int n = InputArray.getLengthOfSequence();
        int[] inputArray = new int[n];
        int k=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Input the sequence:");
        // первый встретившийся нуль считается концом введенной последовательности
        for (int i = 0; i < inputArray.length ; i++) {
            inputArray[i]=in.nextInt();
            if (inputArray[i]==0){
                System.out.println("The quantity of numbers in the sequence to zero (zero included) = "+(k+1));
                System.exit(0);
            }
            else {
                k++;
            }
        }
        System.out.println("The entered sequence does not contain zero");
    }
}