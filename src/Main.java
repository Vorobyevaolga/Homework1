import com.sun.source.util.SourcePositions;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static int[] generateRandomArray() {
         java.util.Random random = new java.util.Random();
             int[] arr = new int[30];
    for (int i = 0; i < arr.length; i++) {
        arr[i] = random.nextInt(100_000) + 100_000;
    }
    return arr;
}

public static void task1() {
    int[] arr = generateRandomArray();
    System.out.println(Arrays.toString(arr));
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
        sum = sum + arr[i];
    }
    System.out.println("Сумма выплат за месяц "+sum+" рублей.");

int maxCost=0;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i]>maxCost) {
            maxCost=arr[i];
        }
    } System.out.println("Максимальная выплата "+maxCost+ " рублей");
    int minCost=200_000;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i]<minCost) {
            minCost=arr[i];
        }
    }
    System.out.println("Минимальная выплата "+minCost+ " рублей");

    float averageCost=sum/30;
    System.out.println("Средняя сумма трат за месяц составила "+averageCost+ " рублей");

}
}