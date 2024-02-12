import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");

        int[] arrInt = new int[]{1, 2, 3};
        double[] arrDouble = new double[]{1.57, 7.654, 9.986};
        int[] arrEx = {100, 70654, 9986, 542, 2548};

        System.out.println("Задача 2");

        for (int i = 0; i < arrInt.length; i++) {
            if (i == arrInt.length - 1) {
                System.out.println(arrInt[i]);
                break;
            }
            System.out.print(arrInt[i] + " , ");
        }
        for (int i = 0; i < arrDouble.length; i++) {
            if (i == arrDouble.length - 1) {
                System.out.println(arrDouble[i]);
                break;
            }
            System.out.print(arrDouble[i] + " , ");
        }
        for (int i = 0; i < arrEx.length; i++) {
            if (i == arrEx.length - 1) {
                System.out.println(arrEx[i]);
                break;
            }
            System.out.print(arrEx[i] + " , ");
        }


        System.out.println("Задача 3");
        for (int i = arrInt.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(arrInt[i]);
                break;
            }
            System.out.print(arrInt[i] + " , ");
        }
        for (int i = arrDouble.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(arrDouble[i]);
                break;
            }
            System.out.print(arrDouble[i] + " , ");
        }
        for (int i = arrEx.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(arrEx[i]);
                break;
            }
            System.out.print(arrEx[i] + " , ");
        }

        System.out.println("Задача 4");
        System.out.println(Arrays.toString(arrInt));
        for (int i = 0; i < arrInt.length; i++) {
            if (arrInt[i] % 2 == 1) {
                arrInt[i] = arrInt[i] + 1;
                System.out.print(Arrays.toString(arrInt));
            }
        }
    }
}