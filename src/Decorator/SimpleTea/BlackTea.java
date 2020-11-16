package Decorator.SimpleTea;

public class BlackTea extends Beverage {
    public BlackTea() {
        description = "Black Tea";
    }

    @Override
    public double cost() {
        return 60;
    }
}
