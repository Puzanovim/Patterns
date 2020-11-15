package Decorator;

public abstract class Beverage {
    String description = "Unknown deberage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
