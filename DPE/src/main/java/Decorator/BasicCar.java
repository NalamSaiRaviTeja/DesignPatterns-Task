package Decorator;

public class BasicCar implements Car {
    public void assemble() {
        System.out.print("Basic Car.");
    }

    public long carPrice() {
        return 600000;
    }
}
