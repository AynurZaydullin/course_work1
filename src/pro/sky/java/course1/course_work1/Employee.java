package pro.sky.java.course1.course_work1;

import java.util.Objects;

public class Employee {
    private String lastName;
    private String name;
    private String middleName;
    private String department;
    private double salary;
    /*
    Добавить статическую переменную-счетчик, которая отвечает за id.
     */
    private final long id = count;
    private static long count = 1L;

    public Employee(String lastName, String name, String middleName, String department, double salary) {
        this.lastName = lastName;
        this.name = name;
        this.middleName = middleName;
        this.department = department;
        this.salary = salary;
        count++;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public long getId() {
        return id;
    }

    public static long getCount() {
        return count;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Работник № " + id + "\n" + "ФИО: " + lastName + " " + name + " " + middleName + ". " + "Отдел " +
                department + ". " + "Зарплата - " + salary + " " + " рублей.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
