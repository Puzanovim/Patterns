package Decorator.SimpleTea;

public class TeaOrder {
    public static void main(String[] args) {
        Beverage beverage = new BlackTea();
        System.out.println(beverage.getDescription() + " " + beverage.cost() + "р");

        Beverage beverage1 = new BlackTea();
        beverage1 = new Milk(beverage1);
        beverage1 = new Sugar(beverage1);
        System.out.println(beverage1.getDescription() + " " + beverage1.cost() + "р");
    }
}
