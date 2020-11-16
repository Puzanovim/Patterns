package Decorator.SimpleTea;

public class GreenTea extends Beverage {
    public GreenTea() {
        description = "Green Tea";
    }

    @Override
    public double cost() {
        return 80;
    }
}
