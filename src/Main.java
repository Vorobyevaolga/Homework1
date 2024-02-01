import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");         // Задача1
        int age = 15;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " лет, то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " лет, то он не достиг совершеннолетия, нужно немного подождать");
        }

        System.out.println("Задача 2");         // Задача2
        int temperature = 0;
        if (temperature <= 5) {
            System.out.println("На улице холодно, " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло," + temperature + " градусов, можно идти без шапки");
        }
        System.out.println("Задача 3");         // Задача3
        int speed = 80;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф");
        } else {
            System.out.println("Если скорость," + speed + " км/ч, то можно ездить спокойно");
        }

        System.out.println("Задача 4");         // Задача4
        int ageMen = 50;
        if (ageMen >= 2 && ageMen <= 6) {
            System.out.println("Если возраст человека равен " + ageMen + ", то ему надо ходить в сад");
        }
        if (ageMen >= 7 && ageMen <= 17) {
            System.out.println("Если возраст человека равен " + ageMen + ", то ему надо ходить в школу");
        }
        if (ageMen >= 18 && ageMen <= 23) {
            System.out.println("Если возраст человека равен " + ageMen + ", то ему надо ходить в институт");
        }
        if (ageMen >= 24) {
            System.out.println("Если возраст человека равен " + ageMen + ", то ему пора на работу");
        }

        System.out.println("Задача 5");         // Задача5
        int ageBaby = 5;
        if (ageBaby < 5) {
            System.out.println("Если возраст ребенка равен " + ageBaby + " лет, то он не может кататься на аттракционе");
        }
        if (ageBaby >= 5 && ageBaby < 14) {
            System.out.println("Если возраст ребенка равен " + ageBaby + " лет, то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        }
        if (ageBaby >= 14) {
            System.out.println("Если возраст ребенка равен " + ageBaby + " лет, то он может кататься без сопровождения взрослого");
        }

        System.out.println("Задача 6");         // Задача6
        int seatOnTrain = 102;
        int seatDoenOnTrain = 60;
        int people = 204;
        System.out.println("В вагоне " + people + " людей");
        if (people < 60) {
            System.out.println("есть сидячие места");
        } else {
            if (people < 102 && people >= 60) {
                System.out.println("только стоячие места");
            } else {
                System.out.println("Вагон забит");
            }
        }

        System.out.println("Задача 7");         // Задача7
        int one = 5;
        int two = 7;
        int three = 1;
        if (two > one && two > three) {
            System.out.println("Наибольшее " + two);
        } else {
            if (one > two && one > three) {
                System.out.println("Наибольшее " + one);
            } else {
                System.out.println("Наибольшее " + three);
            }
        }

    }
}
