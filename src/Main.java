public class Main {
    private final static Sotrudnik[] sotrudnik = new Sotrudnik[10];

    public static void main(String[] args) {
        sotrudnik[0] = new Sotrudnik("Воробьева Ольга Владимировна", 10_000, 1);
        sotrudnik[1] = new Sotrudnik("Иванов Иван Иванович", 15_000, 2);
        sotrudnik[2] = new Sotrudnik("Кожевников Валерий Федорович", 20_000, 3);
        sotrudnik[3] = new Sotrudnik("Бочкарева Анна Львовна", 25_000, 4);
        sotrudnik[4] = new Sotrudnik("Морозов Лев Александрович", 30000, 2);
        sotrudnik[5] = new Sotrudnik("Лучнева Марина Федоровна", 25000, 4);
        sotrudnik[6] = new Sotrudnik("Борисов Петр Михайлович", 45000, 1);
        sotrudnik[7] = new Sotrudnik("Логинова Ольга Викторовна", 55000, 5);
        sotrudnik[8] = new Sotrudnik("Черепанов Олег Николаевич", 25000, 4);
        sotrudnik[9] = new Sotrudnik("Иванов Петр Сидорович", 35000, 3);

        printSotrudnik();
        printFullNameOfSotrufnik();
        System.out.println("Сумма ЗП:" + calculatetSumOfSalary());
        System.out.println("Средняя ЗП:" + calculatetAverageOfSalaries());
        System.out.println("Сотрудник с максимальной ЗП " + findSotrudnikWithMaxSalary());
        System.out.println("Сотрудник с минимальной ЗП " + findSotrudnikWithMinSalary());

    }

    private static void printSotrudnik() {
        for (int i = 0; i < sotrudnik.length; i++) {
            System.out.println(sotrudnik);
        }
    }

    private static void printFullNameOfSotrufnik() {
        for (int i = 0; i < sotrudnik.length; i++) {
            System.out.println(sotrudnik.getFullName());
        }
    }

    private static int calculatetSumOfSalary() {
        int sum = 0;
        for (int i = 0; i < sotrudnik.length; i++) {
            sum += sotrudnik.getSalary();
        }
        return sum;
    }

    private static double calculatetAverageOfSalaries() {
        return (double) calculatetSumOfSalary() / sotrudnik.length;
    }

    private static Sotrudnik findSotrudnikWithMaxSalary() {
        Sotrudnik sotrudnikWithMaxSalary = null;
        int maxSalary = Integer.MIN_VALUE;
        for (int i = 0; i < sotrudnik.length; i++) {
            if (sotrudnik.getSalary() > maxSalary) {
                maxSalary = sotrudnik.getSalary;
                sotrudnikWithMaxSalary = sotrudnik;
            }
            return sotrudnikWithMaxSalary;
        }
    }

    private static Sotrudnik findSotrudnikWithMinSalary() {
        Sotrudnik sotrudnikWithMinSalary = null;
        int minSalary = Integer.MAX_VALUE;
        for (int i = 0; i < sotrudnik.length; i++) {
            if (sotrudnik.getSalary() < minSalary) {
                minSalary = sotrudnik.getSalary;
                sotrudnikWithMinSalary = sotrudnik;
            }
            return sotrudnikWithMinSalary;
        }
    }
}