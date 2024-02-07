public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int clientOS = 1; // (0 — iOS, 1 — Android
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");}
        else {System.out.println("Установите версию приложения для Android по ссылке");}

        System.out.println("Задача 2");
        int clientOSystem = 1; // 0 — iOS, 1 — Android
        int yearOS = 2010; // год выпуска операционно системы
        if (clientOSystem == 0 && yearOS <= 2015) {
        System.out.println("Установите облегченную версию приложения для iOS по ссылке");}
        if (clientOSystem == 0 && yearOS > 2015) {
        System.out.println("Установите версию приложения для iOS по ссылке ");}
        if (clientOSystem == 1 && yearOS <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");}
        if (clientOSystem == 1 && yearOS > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");}

        System.out.println("Задача 3");
        int year=2000;
        int yearV=year%4;
        int yearOneHundred=year%100;
        int yearForHundred=year%400;
        if (year<1854) {System.out.println("Введите другой год");}
        else { if (yearV==0 && yearOneHundred!=0 || yearForHundred==0) {
            System.out.println(year + " год високосный");
        } else { System.out.println(year+" год не является високосным");        }
        }

        System.out.println("Задача 4");
        int km=10;
        if (km<=20) {System.out.println("Доставка 1 день");}
        if (km>20 && km<=60) {System.out.println("Доставка 2 дня");}
        if (km>60 && km<=100) {System.out.println("Доставка 3 дня");
        } else {System.out.println("не доставляем");}

        System.out.println("Задача 5");
        char season = 20;
        switch (season) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("В году всегда 12 месяцев и не больше.");

        }

    }
}