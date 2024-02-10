import java.time.Month;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int total = 0;
        int vklad = 15_000;
        int month = 1;
        while (total <= 2_459_000) {
            total = total + vklad;
            System.out.println("Месяц " + month + " сумма накоплений равна " + total + " рублей");
            month++;
        }
        System.out.println();
        System.out.println("Задача 2");
        int a = 1;
        while (a <= 10) {
            System.out.print(a + " ");
            a++;
        }
        System.out.println();
        for (a = 10; a > 0; a--) {
            System.out.print(a + " ");
        }
        System.out.println();

        System.out.println("Задача 3");
        int pepple = 12_000_000;
        int addingPeople = 17;
        int mortalityPeople = 8;
        int year = 2000;
        while (year <= 2010) {
            System.out.println("Год " + year + " численность населения составляет " + pepple);
            year++;
            pepple = pepple + pepple * (addingPeople - mortalityPeople) / 1000;
        }
        System.out.println();

        System.out.println("Задача 4");
        int sum = 12_000_000;
        double deposit = 15_000;
        double percent = 7D / 100;
        month = 0;
        while (deposit < sum) {
            month++;
            deposit = deposit + deposit * percent;
            System.out.println("Месяц " + month + " накопления " + deposit);
        }
        System.out.println();

        System.out.println("Задача 5");
        deposit = 15_000;
        month = 0;
        while (deposit < sum) {
            month++;
            deposit = deposit + deposit * percent;
            if (month % 6 == 0)
                System.out.println("Месяц " + month + " накопления " + deposit);
        }
        System.out.println();
        System.out.println("Задача 6");
        deposit = 15_000;
        for (month = 1; month <= 108; month++) {
            deposit = deposit + deposit * percent;
            if (month % 6 == 0)
                System.out.println("Месяц " + month + " накопления " + deposit);
        }
        System.out.println();
        System.out.println("Задача 7");
        int friday = 7;
        for (; friday < 31; friday = friday + 7)
            System.out.println("Сегодня пятница " + friday + "-е число. Необходимо подготовить отчет");
        System.out.println();

        System.out.println("Задача 8");
        year = 2024;
        int startYear = year - 200;
        int endYear = year + 100;
        int tsikl = 79;
        for (year = startYear; year < endYear; year++) {
            if (year % tsikl == 0)
                System.out.println(year);
        }

    }
}