package lesson12.employee;

import java.util.Locale;

/**
 * Created by belkin on 31.05.2017.
 */
public class Report {
    public static void generateReport(Employee[] employees) {
        for (Employee employee : employees) {
            String[] fullname = employee.getName().split("\\s+");
            System.out.printf(Locale.ROOT, "%s.%s. %-10s%12.2f%n",
                    fullname[1].substring(0, 1), fullname[2].substring(0, 1), fullname[0], employee.getSalary());
        }
    }
}