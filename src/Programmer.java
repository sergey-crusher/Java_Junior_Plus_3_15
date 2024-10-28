public class Programmer implements Worker, Driver {
    @Override
    public void work() {
        System.out.println("Пью кофе и иногда кодю");
    }

    @Override
    public void drive() {
        System.out.println("Врум-врум");
    }
}
