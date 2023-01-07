package pro.sky.java.course1.course_work1;

import java.util.ArrayList;
import java.util.List;

public class EmployeesBook {
    /*
    Создание приватного хранилища сотрудников.
     */
    private static Employee[] employees = new Employee[10];
    {
        employees[0] = new Employee("Иванов", "Иван", "Иванович", "1", 70555);
        employees[1] = new Employee("Петров", "Дима", "Иванович", "2", 71555);
        employees[2] = new Employee("Сидоров", "Дима", "Иванович", "3", 72555);
        employees[3] = new Employee("Прокофьев", "Никита", "Иванович", "4", 73555);
        employees[4] = new Employee("Игнатьев", "Никита", "Фёдорович", "4", 74555);
        employees[5] = new Employee("Игнатьев", "Никита", "Фёдорович", "4", 75555);
    }

    public void printFullNameOfAllEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getLastName() + " " + employee.getName() + " " + employee.getMiddleName());
            }
        }
    }
    /**
     * Вывод списка всех работников.
     */
    public void printAllEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    /**
     * Посчитать сумму затрат на зарплаты в месяц.
     *
     * @return
     */
    public double sumAllSalary() {
        double sum = 0d;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    /**
     * Вывод суммы затрат на зарплаты в месяц.
     */
    public void printSumAllSalary() {
        System.out.println("Сумма затрат на зарплаты в месяц - " + sumAllSalary() + " рублей.");
    }

    /**
     * Подсчитать среднее значение зарплат.
     * @return
     */
    public double averageAllSalary() {
        int countEmployees = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                countEmployees++;
            }
        }
        return sumAllSalary()/countEmployees;
    }

    public void printAverageAllSalary() {
        System.out.println("Среднее значение зарплат - " + averageAllSalary() + " рублей.");
    }
    public int getIndexOfFirstNotNullArrayElement() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                return i;
            }
        }
        throw new RuntimeException("В списке нет ни одного работника.");
    }

    /**
     * Получение работника с минимальной зарплатой.
     *
     * @return
     */
    public Employee getEmployeeWithMinSalary() {
        Employee employeeWithMinSalary = employees[getIndexOfFirstNotNullArrayElement()];
        for (int i = getIndexOfFirstNotNullArrayElement() + 1; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() < employeeWithMinSalary.getSalary()) {
                employeeWithMinSalary = employees[i];
            }
        }
        return employeeWithMinSalary;
    }

    /**
     * Получение работника с максимальной зарплатой.
     *
     * @return
     */
    public Employee getEmployeeWithMaxSalary() {
        Employee employeeWithMaxSalary = employees[getIndexOfFirstNotNullArrayElement()];
        for (int i = getIndexOfFirstNotNullArrayElement() + 1; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() > employeeWithMaxSalary.getSalary()) {
                employeeWithMaxSalary = employees[i];
            }
        }
        return employeeWithMaxSalary;
    }

    /**
     * Вывод всех сотрудников заданного отдела.
     * @param department
     */
    public void printAllEmployeesInDepartment(String department) {
        for (Employee employee : employees) {
            if (employee != null && department.equals(employee.getDepartment())) {
                System.out.println("Работник №" + employee.getId() + "\n" + "ФИО: " + employee.getLastName() +
                        " " + employee.getName() + " " + employee.getMiddleName() + ". " + "Зарплата - " + employee.getSalary() + " рублей.");
            }
        }
    }

    public void printFullNameOfAllEmployeesInDepartment(String department) {
        for (Employee employee : employees) {
            if (employee != null && department.equals(employee.getDepartment())) {
                System.out.println("ФИО: " + employee.getLastName() +
                        " " + employee.getName() + " " + employee.getMiddleName());
            }
        }
    }
    /**
     * Вывод всех сотрудников по отделам.
     */
    public void printFullNameOfAllEmployeesByDepartment() {
        List<String> departments = findAllDepartment();
        for (String department : departments) {
            System.out.println("В отделе №" + department + " работают следующие сотрудники:");
            printFullNameOfAllEmployeesInDepartment(department);
        }
    }

    /**
     * Добавление работника в массив.
     *
     * @param employee
     */
    public void addEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                System.out.println("Добавлен новый работник.");
                return;
            }
        }
        System.out.println("Места в списке нет, чтобы добавить нового работника.");
    }

    /**
     * Удаление работника с заданным ФИО и id.
     *
     * @param lastName
     * @param name
     * @param middleName
     * @param id
     */
    public void removeEmployee(String lastName, String name, String middleName, long id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && lastName.equals(employees[i].getLastName()) && name.equals(employees[i].getName())
                    && middleName.equals(employees[i].getMiddleName()) && id == employees[i].getId()) {
                employees[i] = null;
                return;
            }
        }
    }

    /**
     * Получение списка сотрудников по всем отделам.
     * @return
     */
    public List<String> findAllDepartment() {
        List<String> allDepartment = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee != null && !allDepartment.contains(employee.getDepartment())) {
                allDepartment.add(employee.getDepartment());
            }
        }
        return allDepartment;
    }
}
