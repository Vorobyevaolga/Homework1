public class Main {
    public static void main(String[] args) {
        var totalHours=640; //Всего часов
        var workingHours=8; //Продолжительность рабочего дня
        var numbersOfWorkers=totalHours/workingHours; //сколько работников на предприятии
        System.out.println(totalHours);
        System.out.println(workingHours);
        System.out.println("Всего работников на предприятии - "+numbersOfWorkers);
        numbersOfWorkers=numbersOfWorkers+94; // на 94 работника больше
        totalHours=numbersOfWorkers*8; //всего часов работы, при условии увеличения численности на 94 человека
        System.out.println("Если в компании работает "+numbersOfWorkers+" человек, то всего "+totalHours+" часов работы может быть поделено между сотрудниками");


    }
}
