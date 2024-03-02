import java.time.LocalDate;

public class Main {
    public static boolean proverka(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static void printInfo(int year) {
        if (proverka(year)) {
            System.out.println(year + " год високосный");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void printInfoAboutVersion(int os, int produktionYear) {
        int currentYear = LocalDate.now().getYear();
        if (os == 0 && produktionYear == currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке ");
        }
        if (os == 0 && produktionYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (os == 1 && produktionYear == currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (os == 1 && produktionYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static int calkulateDeliveryDays(int distance) {
        if (distance < 0 || distance > 100) {
            return -1;
        }
        int deliveryDays = 1;
        if (distance >= 20) {
            deliveryDays++;
        }
        if (distance >= 60) {
            deliveryDays++;
        }

        return deliveryDays;
    }


    public static void main(String[] args) {
        System.out.println("Задача 1");
        printInfo(2023);

        System.out.println("Задача 2");
        printInfoAboutVersion(0, 2010);

        System.out.println("Задача 3");
        int deliveryDays = calkulateDeliveryDays(10);
        if (deliveryDays > 0) {
            System.out.println("Количество дней доставки " + deliveryDays);
        } else {
            System.out.println("не доставляем");
        }
    }
}
