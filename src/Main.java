import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");         // Задача1
        int car = 40_000;
        byte cat = 5;
        short dog = 130;
        long costCar = 4_000_000;
        float weght = 3.4F;
        double z = 3.5625485;
        System.out.println("Кошек-" + cat);
        System.out.println("Собак-" + dog);
        System.out.println("Машин-" + car);
        System.out.println("Вес-" + weght + "кг");
        System.out.println("z=" + z);
        // Конец Задачи 1

        System.out.println("Задача 2");         // Задача2
        float a = 27.12F;
        long c = 987_678_965 - 549;
        float e = 2.786F;
        int d = 569;
        int f = -159;
        short k = 27897;
        short b = 67;
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("c=" + c);
        System.out.println("d=" + d);
        System.out.println("e=" + e);
        System.out.println("f=" + f);
        System.out.println("k=" + k);
        // Конец Задачи 2

        System.out.println("Задача 3");          // Задача3
        int classA = 23;
        int classB = 27;
        int classD = 30;
        int paper = 480;
        int list = paper / (classA + classB + classD);
        System.out.println("На каждого ученика рассчитано " + list + " листов бумаги");
        // Конец Задачи 3

        System.out.println("Задача 4");        // Задача4
        int bottleIn1Minute = 16 / 2;
        int bottleIn20Minute = 20 * bottleIn1Minute;
        int bottleInDay = 24 * 60 * bottleIn1Minute;
        int bottleIn3Day = 3 * bottleInDay;
        int bottleIn1Month = 30 * bottleIn3Day;
        System.out.println("За 20 минут машина произвела " + bottleIn20Minute + " штук бутылок");
        System.out.println("За сутки машина произвела " + bottleInDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottleIn3Day + " штук бутылок");
        System.out.println("За месяц машина произвела " + bottleIn1Month + " штук бутылок");
        // Конец Задачи 4

        System.out.println("Задача 5");           // Задача 5
        int paint = 120;
        int whitePaintOneClass = 2;
        int brownPaintOneClass = 4;
        int Class = paint / (whitePaintOneClass + brownPaintOneClass);
        int whitePaint = whitePaintOneClass * Class;
        int brownPaint = brownPaintOneClass * Class;
        System.out.println("В школе, где " + Class + " классов, нужно " + whitePaint + " банок белой краски и " + brownPaint + " банок коричневой краски");
        // Конец Задачи 5

        System.out.println("Задача 6");            // Задача 6
        int weightBanana = 5 * 80;
        int weightMilke = 2 * 105;
        int weightIceCream = 2 * 100;
        int weightEgg = 4 * 70;
        int weightGr = weightBanana + weightEgg + weightIceCream + weightMilke;
        float weightKg = (float) weightGr / 1000;
        System.out.println("Вес спортивного завтрака в граммах " + weightGr + " гр");
        System.out.println("Вес спортивного завтрака в килограммах " + weightKg + " кг");
        // Конец Задачи 6

        System.out.println("Задача 7");            // Задача7
        int weightDown = 7000;
        int weightMin = 250;
        int weightMax = 500;
        int maxDay = weightDown / weightMin;
        int minDay = weightDown / weightMax;
        int weightAverage = (weightMin + weightMax) / 2;
        int averageDay = weightDown / weightAverage;
        System.out.println("Для сброса 7 кг спортсмену понадобится максимум " + maxDay + " дней");
        System.out.println("Для сброса 7 кг спортсмену понадобится  минимум " + minDay + " дней");
        System.out.println("В среднем за день " + weightAverage + " гр");
        System.out.println("Для сброса 7 кг спортсмену понадобится в среднем " + averageDay + " дней ");
        // Конец Задачи 7

        System.out.println("Задача 8");        // Задача8
        int coastMasha = 67760;
        int coastDenis = 83690;
        int coastKristina = 76230;
        double newCoastMasha = 1.1 * coastMasha;
        double newCoastDenis = 1.1 * coastDenis;
        double newCoastKristina = 1.1 * coastKristina;
        double defferentMasha1 = (newCoastMasha - coastMasha) * 12;
        double defferentMasha2 = coastMasha * 0.1 * 12;
        double defferentDenis1 = (newCoastDenis - coastDenis) * 12;
        double defferentDenis2 = coastDenis * 0.1 * 12;
        double defferentKristina1 = (newCoastKristina - coastKristina) * 12;
        double defferentKristina2 = coastKristina * 0.1 * 12;
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        System.out.println("Маша теперь получает " + numberFormat.format(newCoastMasha) + " Годовой доход вырос на " + numberFormat.format(defferentMasha1));
        System.out.println("Денис теперь получает " + numberFormat.format(newCoastDenis) + " Годовой доход вырос на " + numberFormat.format(defferentDenis1));
        System.out.println("Кристина теперь получает " + numberFormat.format(newCoastKristina) + " Годовой доход вырос на " + numberFormat.format(defferentKristina1));
        // Конец Задачи 8


    }
}
