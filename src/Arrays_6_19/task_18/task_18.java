package Arrays_6_19.task_18;

import java.util.Scanner;

/*18. У вас есть доллары. Вы хотите обменять их на гривны.
 Есть информация о стоимости купли-продажи в банках города. В городе N банков.
 Составьте программу, определяющую, какой банк выбрать, чтобы выгодно обменять доллары на гривны*/
public class task_18 {
    public static void main(String[] args) {
        int n = getNumberOfBanks();
        float[] inputArray = getRateOfCurrencyPurchase(n);
        int numberOfBank = getBenefitFromTheExchange(inputArray);
        System.out.println("Exchange currency for hrn in the bank " + numberOfBank);
    }
    public static int getNumberOfBanks() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the number of banks in the city, N:");
        int n = in.nextInt();
        return n;
    }
    public static float[] getRateOfCurrencyPurchase(int n) {
        Scanner in = new Scanner(System.in);
        float[] array = new float[n];
        System.out.println("Input the rate of currency purchase in each bank :");
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextFloat();
        }
        return array;
    }
    public static int getBenefitFromTheExchange(float[] rates) {
        float max = 0;
        int index = 0;
        for (int i = 0; i < rates.length; i++) {
            if (max < rates[i]) {
                max = rates[i];
                index = i;
            }
        }
        return index;
    }
}