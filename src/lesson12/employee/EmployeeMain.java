package lesson12.employee;

/**
 * Created by belkin on 31.05.2017.
 */
public class EmployeeMain {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Савкин Андрей Сергеевич", 8500),
                new Employee("Петрушко Владимир Игроиевич", 7000),
                new Employee("Коваленко Павел Андреевич", 11500),
        };
        Report.generateReport(employees);
    }
}
