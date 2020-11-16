package Decorator.SimpleTea;

public class Limon extends Additions {
    Beverage beverage;

    public Limon(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", limon";
    }

    @Override
    public double cost() {
        return 10 + beverage.cost();
    }
}
