package Decorator.SimpleTea;

public class Milk extends Additions {
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", milk";
    }

    @Override
    public double cost() {
        return 20 + beverage.cost();
    }
}
