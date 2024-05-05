import company.models.Worker;
import company.models.Manager;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Maks", 4000.0, 1);
        Worker worker2 = new Worker("Tomek", 4200.0, 2);
        Worker worker3 = new Worker("Kamil", 4100.0, 3);
        Worker worker4 = new Worker("Julia", 4500.0, 4);

        Manager manager = new Manager("Dominik", 6000.0, 10);

        System.out.println("Worker 1 salary: $" + worker1.getSalary());
        System.out.println("Worker 2 salary: $" + worker2.getSalary());
        System.out.println("Worker 3 salary: $" + worker3.getSalary());
        System.out.println("Worker 4 salary: $" + worker4.getSalary());
        System.out.println("Manager salary: $" + manager.getSalary());

        worker1.work();
        worker2.work();
        worker3.work();
        worker4.work();
        manager.work();
    }
}
