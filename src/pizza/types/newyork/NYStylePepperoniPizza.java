package pizza.types.newyork;

import base.Pizza;

/**
 * This class is used to make the New York Style Pepperoni Pizza.
 * Created by Sripadmanaban on 9/22/2015.
 */
public class NYStylePepperoniPizza extends Pizza {

    public NYStylePepperoniPizza() {
        name = "NY Style Pepperoni Pizza";
        dough = "Thin Crust";
        sauce = "Marinara Sauce";

        toppings.add("Pepperoni Slices");
        toppings.add("Red Onions");
    }
}
