package Decorator;

public class HouseBland extends Beverage {
    public HouseBland() {
        description = "House Bland";
    }

    @Override
    public double cost() {
        return .89;
    }
}
