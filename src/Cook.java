public class Cook implements Worker, Driver {
    @Override
    public void work() {
        System.out.println("Готовлю кушать");
    }

    @Override
    public void drive() {
        System.out.println("Хрум-хрум");
    }
}
