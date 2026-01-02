import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Задание номер 1
        System.out.println("Задание номер 1");
        int[] inputArray1 = {25000, 9000, 29000, 32000, 45000};
        int sumAll = 0;
        int inputArray1Max = 0;
        int inputArray1Min = inputArray1[0];
        float averageValue;
        for (final int sum : inputArray1) {
            sumAll += sum;
            if (sum > inputArray1Max) {
                inputArray1Max = sum;
            }
            if (inputArray1Min > sum) {
                inputArray1Min = sum;
            }
        }
        averageValue = (float) (sumAll / inputArray1.length);
        float[] outputArray1 = {sumAll, inputArray1Max, inputArray1Min, averageValue};
        System.out.println(Arrays.toString(inputArray1));
        System.out.println(Arrays.toString(outputArray1));
        System.out.println(" ");


        // Задание номер 2
        System.out.println("Задание номер 2");
        float[] inputArray2 = {35000, 45000, 55000, 65000, 75000};
        float[] outputArray2 = new float[inputArray2.length];
        float tax = 0.13f;
        byte i = 0;
        for (float element : inputArray2) {
            element = (float) (element * tax);
            outputArray2[i] = element;
            i++;
        }
        System.out.println(Arrays.toString(inputArray2));
        System.out.println(Arrays.toString(outputArray2));
        System.out.println(" ");


        // Задание номер 3
        System.out.println("Задание номер 3");
        int[] inputArray3 = {3500, 5000, 9000, 2300, 0};
        boolean[] outputArray3 = new boolean[inputArray3.length];
        byte index = 0;
        for (int element : inputArray3) {
            boolean bonus;
            if (element >= 5000) {
                bonus = true;
            } else {
                bonus = false;
            }
            outputArray3[index] = bonus;
            index++;
        }
        System.out.println(Arrays.toString(inputArray3));
        System.out.println(Arrays.toString(outputArray3));
        System.out.println(" ");


        // Задание номер 4
        System.out.println("Задание номер 4");
        int[] inputArray4 = {1000, -7800, 980, 56, 0};
        boolean[] outputArray4 = new boolean[1];
        for (int element : inputArray4) {
            outputArray4[0] = element >= 0;
            if (outputArray4[0] == false) {
                System.out.println("Должник");
                break;
            }
        }
        System.out.println(Arrays.toString(inputArray4));
        System.out.println(Arrays.toString(outputArray4));
        System.out.println(" ");


        // Здание номер 5
        System.out.println("Задание номер 5");
        int[] inputArray5 = {0, -987, 365, 9, 18};
        int[] outputArray5 = new int[1];
        byte profit = 0;
        for (int element : inputArray5) {
            if (element > 0) {
                profit++;
            }
            outputArray5[0] = profit;
        }
        System.out.println(Arrays.toString(inputArray5));
        System.out.println(Arrays.toString(outputArray5));

    }
}
