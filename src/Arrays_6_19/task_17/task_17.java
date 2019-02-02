package Arrays_6_19.task_17;

import java.util.Scanner;

/*17. Пригодность детали оценивается по размеру B, который должен соответствовать интервалу (A – δ, A + δ).
Определить, имеются ли в партии из N деталей бракованные.
Если да, то подсчитать их количество, иначе выдать отрицательный ответ.*/
public class task_17 {
    public static void main(String[] args) {
        int n = getNumberOfPartsInBatch();
        float[] inputArray = getPartSize(n);
        float A = 3.5f, delta = 0.05f;
        int defect = getHowManyDefectiveParts(inputArray, A, delta);
        if (defect == 0) {
            System.out.println("The batch of parts does not contain defects, sizes of parts are in ("+(A-delta)+","+(A+delta)+")");
        } else {
            System.out.println("The batch of " + n + " parts contains " + defect + " defects : sizes of parts are not in ("+(A-delta)+","+(A+delta)+")");
        }
    }
    public static int getNumberOfPartsInBatch() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the number of parts in the batch, N:");
        int n = in.nextInt();
        return n;
    }
    public static float[] getPartSize(int n) {
        Scanner in = new Scanner(System.in);
        float[] array = new float[n];
        System.out.println("Input the part size, B:");
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextFloat();
        }
        return array;
    }
    public static int getHowManyDefectiveParts(float[] parts, float A, float delta) {
        int count = 0;
        for (float partsize : parts) {
            if ((partsize <= A - delta) || (partsize >= A + delta)) {
                count++;
            }
        }
        return count;
    }
}