import java.util.ArrayList;
import company.models.Worker;
import company.abstracts.Employee;
import company.models.Manager;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Maks", 4000.0, 1, "2022-05-21", "Worker");
        Worker worker2 = new Worker("Tomek", 4200.0, 2, "2022-03-02", "Worker");
        Worker worker3 = new Worker("Kamil", 4100.0, 3, "2022-11-26", "Worker");
        Worker worker4 = new Worker("Julia", 4500.0, 4, "2022-03-05", "Worker");

        Manager manager = new Manager("Dominik", 6000.0, 10, "2021-02-04", "Manager");

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(manager);

        for (Employee employee : employees) {
            employee.work();
            System.out.println(
                    "- " + employee.getName() + " (ID: " + employee.getId() + ", Position: " + employee.getPosition()
                            + ", Hire date: " + employee.getHireDate() + ", Salary: $" + employee.getSalary() + ")");
        }
    }
}
