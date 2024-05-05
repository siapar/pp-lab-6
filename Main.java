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
        Worker worker5 = new Worker("Zbigniew", 4000.0, 5, "2022-05-21", "Worker");
        Worker worker6 = new Worker("Pola", 4200.0, 5, "2022-03-02", "Worker");
        Worker worker7 = new Worker("Maciek", 4100.0, 5, "2022-11-26", "Worker");
        Worker worker8 = new Worker("Paulina", 4100.0, 6, "2022-11-26", "Worker");

        Manager manager = new Manager("Dominik", 6000.0, 10, "2021-02-04", "Manager");
        Manager manager2 = new Manager("Piotr", 6000.0, 11, "2021-02-04", "Manager");
        Manager manager3 = new Manager("Jakub", 6000.0, 12, "2021-02-04", "Manager");

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(worker5);
        employees.add(worker6);
        employees.add(worker7);
        employees.add(worker8);
        employees.add(manager);
        employees.add(manager2);
        employees.add(manager3);

        double totalSalaryAllEmployees = 0.0;
        double totalSalaryManagers = 0.0;
        double totalSalaryWorkers = 0.0;

        for (Employee employee : employees) {
            totalSalaryAllEmployees += employee.getSalary();
            if (employee instanceof Manager) {
                totalSalaryManagers += employee.getSalary();
            } else if (employee instanceof Worker) {
                totalSalaryWorkers += employee.getSalary();
            }
        }

        for (Employee employee : employees) {
            employee.work();
            System.out.println(
                    "- " + employee.getName() + " (ID: " + employee.hashCode() + ", Position: " + employee.getPosition()
                            + ", Hire date: " + employee.getHireDate() + ", Salary: $" + employee.getSalary() + ")");
        }

        System.out.println("Hash codes:");
        System.out.println(worker5.getName() + " has code: " + worker5.hashCode());
        System.out.println(worker6.getName() + " has code: " + worker6.hashCode());
        System.out.println(worker7.getName() + " has code: " + worker7.hashCode());
        System.out.println(manager2.getName() + " has code: " + manager2.hashCode());

        ArrayList<Employee> comparisonList = new ArrayList<>();
        comparisonList.add(worker6);
        comparisonList.add(worker7);

        System.out.println("Total salary of all employees: $" + totalSalaryAllEmployees);
        System.out.println("Total salary of all managers: $" + totalSalaryManagers);
        System.out.println("Total salary of all workers: $" + totalSalaryWorkers);

        System.out.println("Praownicy z tym samym ID " + worker5.hashCode() + ":");
        for (Employee employee : employees) {
            if (employee instanceof Worker && employee.hashCode() == worker5.hashCode()) {
                System.out.println("- " + employee.getName());
            }
        }
    }
}