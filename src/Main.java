import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Worker> workers = new ArrayList<>();
        ArrayList<Driver> drivers = new ArrayList<>();

        workers.add(new Director());
        workers.add(new Programmer());
        workers.add(new Cook());

        drivers.add(new Cook());
        drivers.add(new Programmer());

        for (Worker worker : workers) {
            worker.work();
        }

        for (Driver driver : drivers) {
            driver.drive();
        }
    }
}