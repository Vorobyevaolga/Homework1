public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Задача1");
        String firstName = "Ольга "; // С именем firstName  — для хранения имени.
        String middleName = "Владимировна "; // С именем middleName  — для хранения отчества.
        String lastName = "Воробьева "; // С именем lastName— для хранения фамилии.
        String fullName = lastName + firstName + middleName; // С именем fullName  — для хранения Ф. И. О. сотрудника в формате «Фамилия Имя Отчество».
        System.out.println("Ф. И. О. сотрудника — " + fullName);

        System.out.println("Задача2_v1");
        String fullName1 = fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName1);
        System.out.println("Задача2_v2");
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase());

        System.out.println("Задача3");
        firstName = "Семён ";
        middleName = "Семёныч ";
        lastName = "Иванов ";
        fullName=lastName+firstName+middleName;
        String fullNameTrue = fullName.replace("ё", "е");
        System.out.println("Входные Ф. И. О. сотрудника —  " + fullName);
        System.out.println("Данные Ф. И. О. сотрудника — " +fullNameTrue);

    }
}