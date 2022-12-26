package com.skypro.courswork_1;

public class Main {
    private static final Employee[] employees = {
            new Employee("Некрасов Николай Алекеевич", 1, 54000f),
            new Employee("Булгаков Михаил Афанасьевич", 2, 55000f),
            new Employee("Чехов Антон Павлович", 3, 56000f),
            new Employee("Лермонтов Михаил Юрьевич", 4, 57000f),
            new Employee("Гоголь Николай Васильевич", 5, 58000f),
            new Employee("Пушкин Александ Сергеевич", 1, 59000f),
            new Employee("Толстой Лев Николаевич", 2, 60000f),
            new Employee("Тургенев Иван Сергеевич", 3, 61000f),
            new Employee("Грибоедов Александр Сергеевич", 4, 62000f),
            new Employee("Достоевский Федор Михайлович", 5, 63000f)
    };

    public static void printListOfAllEmployees() { //список всех сотрудников со всеми данными
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            System.out.println(employee);
        }
    }

    public static void printFullNameAllEmployees() { //список Ф.И.О. всех сотрудников
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            System.out.println(employee.getFullName());
        }
    }

    public static Employee findEmployeeWithMinSalary() { //поиск сотрудника с минимальной зарплатой

        Employee value = employees[0];
        double minSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
                value = employee;
            }
        }
        return value;
    }

    public static double findAverageSalaryAllEmployees() { //подсчет среднего значения зарплат
        return sumSalaryAllEmployees() / employees.length;
    }

    public static double sumSalaryAllEmployees() { //подсчет суммы всех зарплат
        double sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static Employee findEmployeeWithMaxSalary() { //поиск сотрудника с максимальной зарплатой
        Employee value = employees[0];
        double maxSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employees[i].getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                value = employee;
            }
        }
        return value;
    }

    public static void separator() {
        System.out.println("==================================================================");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("==================================================================");
    }

    public static void main(String[] args) {

        separator();
        printFullNameAllEmployees();//список Ф.И.О. всех сотрудников
        separator();
        printListOfAllEmployees();//список всех сотрудников со всеми данными
        separator();
        System.out.println(findEmployeeWithMaxSalary());//поиск сотрудника с максимальной зарплатой
        separator();
        System.out.println("Средняя зарплата за месяц " + findAverageSalaryAllEmployees() + " руб.");//подсчет среднего значения зарплат
        separator();
        System.out.println(findEmployeeWithMinSalary());//поиск сотрудника с минимальной зарплатой
        separator();
        System.out.println("Сумма всех зарплат за месяц равна " + sumSalaryAllEmployees() + " руб.");//подсчет суммы всех зарплат
        separator();
    }
}
