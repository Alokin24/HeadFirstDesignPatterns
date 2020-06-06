package chapter03.custom_example.beverages;

import chapter03.custom_example.Beverage;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark roast";
    }

    @Override
    public double cost() {
        return .99;
    }
}
