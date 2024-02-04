public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int clientOS = 0; // (0 — iOS, 1 — Android
        if (clientOS == 0)
            System.out.println("Установите версию приложения для iOS по ссылке");
        else System.out.println("Установите версию приложения для Android по ссылке");

        System.out.println("Задача 2");
        int clientOSystem = 1; // 0 — iOS, 1 — Android
        int yearOS = 2010; // год выпуска операционно системы
        if (clientOSystem == 0 && yearOS <= 2015)
        System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        if (clientOSystem == 0 && yearOS > 2015)
        System.out.println("Установите версию приложения для iOS по ссылке ");
        if (clientOSystem == 1 && yearOS <= 2015)
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        if (clientOSystem == 1 && yearOS > 2015)
            System.out.println("Установите версию приложения для Android по ссылке");

        System.out.println("Задача 3");
        int year=1854;
        int yearV=year%4;
        int yearOneHundred=year%100;
        int summery=yearV+yearOneHundred;
        if (year<1854) {System.out.println("Введите другой год");}
        else { if (summery!=0) {
            System.out.println(year + " год високосный");
        } else { System.out.println(year+" год не является високосным");        }
        }

        System.out.println("Задача 4");

        int km=180;
        int initialDistance=20;
        int delta=40;
        int day=(km+initialDistance)/delta+1;
        if (km<20) {System.out.println("Доставка "+day+" день"); }
        if (km>20 && km<60) {System.out.println("Доставка "+day+" дня");}
        if (km>60 && km<100) {System.out.println("Доставка "+day+" дня");
        } else {System.out.println("Доставка составит " + day+ " дней");}

        System.out.println("Задача 5");
        int monthNumber=9;
        if (monthNumber<=2 || monthNumber==12) {System.out.println("Зима");}
         else {
            if (monthNumber <= 5) {System.out.println("Весна");}
        else { if (monthNumber<=8) {System.out.println("Лето");}
        else {if (monthNumber<=11) {System.out.println("Осень");}}}}

        System.out.println("Задача 5");
        char season = 15;
        switch (season) {
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 12:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("В году всегда 12 месяцев и не больше.");

        }

    }
}