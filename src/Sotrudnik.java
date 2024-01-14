public class Sotrudnik {
    private static int idGenerator = 1;
    private final int id;
    private String fullName;
    private int salary;
    private int departament;


    public Sotrudnik(String fullName, int salary, int departament) {
        this.id = idGenerator++;
        this.fullName = fullName;
        this.salary = salary;
        this.departament = departament;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getDepartament() {
        return departament;
    }

    public void setDepartament(int departament) {
        this.departament = departament;
    }

    @Override
    public String toString() {
        return "Сотрудник: " +
                "ФИО=" + fullName + ", " +
                "ЗП- " + salary + ", " +
                "департамент -" + departament;
    }
}



