import java.util.Objects;

public class Employee {
    private String name;
    private String lastname;
    private String surname;
    private float salary;
    private int department;
    private int ID;


    public Employee(String name, String lastname, String surname, float salary, int department) {
        this.name = name;
        this.lastname = lastname;
        this.surname = surname;
        this.salary = salary;
        this.department = department;
        ID = Main.ID;
        Main.ID++;
    }

    @Override
    public String toString() {
        return "ФИО: " + lastname +
                " " + name +
                " " + surname +
                ", Зарплата:" + salary +
                ", Отдел:" + department +
                ", ID:" + ID;
    }

    public String fullName() {
        return lastname +
                " " + name +
                " " + surname;
    }

    public String toStringWithoutDepartment() {
        return "ФИО: " + lastname +
                " " + name +
                " " + surname +
                ", Зарплата:" + salary +
                ", ID:" + ID;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary && department == employee.department && ID == employee.ID && Objects.equals(name, employee.name) && Objects.equals(lastname, employee.lastname) && Objects.equals(surname, employee.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastname, surname, salary, department, ID);
    }
}
