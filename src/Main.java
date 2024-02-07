public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        for (int i=0; i<=10; i++) {
            System.out.println(i);
        }

        System.out.println("Задача 2");
        for (int i=10; i>=0; i=i-1) {
            System.out.println(i);
        }
        System.out.println("Задача 3");
        for (int i=0; i<=17; i=i+2) {
            System.out.println(i);
        }
        System.out.println("Задача 4");
        for (int i=10; i>=-10; i=i-1) {
            System.out.println(i);
        }
        System.out.println("Задача 5");
        for (int i=1904; i<=2096; i=i+4) {
            System.out.println(i+" год является високосным");
        }

        System.out.println("Задача 6");
        for (int i=7; i<=98; i=i+7) {
            System.out.println(i);}

        System.out.println("Задача 7");
        for (int i=1; i<=512; i=i*2) {
            System.out.println(i);}

        System.out.println("Задача 8");
        int summa=0;
        int vklad=29000;
        for (int i=0; i<=12; i=i+1) {
            summa=vklad+summa;
            System.out.println("Месяц"+i+", сумма накоплений равна "+summa+" рублей");
        }

        System.out.println("Задача 9");
        int total=29000;
        int сontribution=29000;
        for (int i=0; i<=12; i=i+1) {
            total=total+total/100*12; total=сontribution+total;
            System.out.println("Месяц"+i+", сумма накоплений равна "+total+" рублей");
        }
    }
}