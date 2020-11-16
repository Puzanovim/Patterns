package Decorator.SimpleTea;

public class Sugar extends Additions {
    Beverage beverage;

    public Sugar(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", sugar";
    }

    @Override
    public double cost() {
        return 5 + beverage.cost();
    }
}
