package pro.sky.java.course1.course_work1;


public class Main {
    public static void main(String[] args) {
        /*
          Создание объекта (кники рабобтников).
         */
        EmployeesBook employeesBook = new EmployeesBook();
        /*
          Базовая сложность.
         */
        System.out.println("Сложность: базовая сложность.");
        /*
          Получить список всех сотрудников со всеми имеющимися по ним данными:
         */
        employeesBook.printAllEmployees();
        System.out.println();
        /*
          Посчитать и вывести сумму затрат на зарплаты.
         */
        employeesBook.printSumAllSalary();
        System.out.println();
        /*
          Найти сотрудника с минимальной заплатой.
         */
        System.out.println("Работник с минимальной зарплатой: " + employeesBook.getEmployeeWithMinSalary());
        System.out.println();
        /*
          Найти сотрудника с максимальной зарплатой.
         */
        System.out.println("Работник с максимальной зарплатой: " + employeesBook.getEmployeeWithMaxSalary());
        System.out.println();
        /*
          Подсчитать и вывести среднее значение зарплат.
         */
        employeesBook.printAverageAllSalary();
        System.out.println();
        /*
        Получить Ф. И. О. всех сотрудников (вывести в консоль).
         */
        System.out.println("ФИО всех сотрудников:");
        employeesBook.printFullNameOfAllEmployees();
        System.out.println();
        /*
        Выполнение некоторых пунктов из "Повышенной сложности" и "Очень сложно".
         */
        /*
        Повышенная сложность.
         */
        System.out.println("Сложность: повышенная сложность.");
        System.out.println("Список работников отдела 4.");
        employeesBook.printAllEmployeesInDepartment("4");
        System.out.println();
        /*
        Очень сложно.
         */
        System.out.println("Сложность: очень сложно.");
        /*
        Добавить сотррудника.
         */
        employeesBook.addEmployee(new Employee("Орлов", "Дмитрий", "Иванович", "7", 89999));
        System.out.println();
        System.out.println("Проверяем добавление сотрудника");
        employeesBook.printAllEmployees();
        System.out.println();
        /*
        Удалить сотрудника.
         */
        employeesBook.removeEmployee("Игнатьев", "Никита", "Фёдорович", 5);
        System.out.println();
        System.out.println("Проверяем удаление сотрудника.");
        employeesBook.printAllEmployees();
        System.out.println();
        /*
        Список сотрудников по отделам.
         */
        System.out.println("Вывести данные сотрудников по отделам.");
        employeesBook.printFullNameOfAllEmployeesByDepartment();
    }
}