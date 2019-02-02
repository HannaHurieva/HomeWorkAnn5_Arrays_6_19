package Arrays_6_19.task_14;

import Arrays_6_19.InputArray;

/*14. При поступлении в вуз абитуриенты, получившие "двойку" на первом экзамене, ко второму не допускаются.
В массиве A[n] записаны оценки экзаменующихся, полученные на первом экзамене.
Подсчитать, сколько человек не допущено ко второму экзамену.*/
public class task_14 {
    public static void main(String[] args) {
        int n = InputArray.getLengthOfSequence();
        int[] inputArray = InputArray.getArray(n);
        System.out.println("The numbers of applicants not admitted to the second exam = " + getNumbersOfNotAllowed(inputArray));
    }

    public static int getNumbersOfNotAllowed (int [] elements) {
        int count = 0;
        for (int rating : elements) {
            if (rating == 2) {
                count ++;
            }
        }
        if (count == 0) {
            System.out.println("All applicants have successfully passed the exam and are allowed");
            System.exit(0);
        }
        return  count;
    }
}