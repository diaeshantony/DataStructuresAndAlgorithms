package List;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Jane", "Jone", 123));
        employeeList.add(new Employee("james", "gomes", 124));
        employeeList.add(new Employee("john", "Cena", 125));


        System.out.println(employeeList.get(1));
        System.out.println(employeeList.isEmpty());
        employeeList.set(1, new Employee("Diaesh", "Antony", 12));

        employeeList.forEach(employee -> {
            System.out.println(employee);
        });

        System.out.println(employeeList.size());

        System.out.println("-----------------");
        employeeList.remove(2);

        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
        for (Employee employee: employeeArray) {
            System.out.println(employee);
        }

    }
}
