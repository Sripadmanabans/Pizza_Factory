package pizza.types.newyork;

import base.Pizza;

/**
 * This is the class responsible to making New york Style Veggie Pizza.
 * Created by Sripadmanaban on 9/22/2015.
 */
public class NYStyleVeggiePizza extends Pizza {

    public NYStyleVeggiePizza() {
        name = "NY Style Veggie Pizza";
        dough = "Thin Crust";
        sauce = "Marinara Sauce";

        toppings.add("Red Onions");
        toppings.add("Green Peppers");
        toppings.add("Sliced Jalapeno Peppers");
        toppings.add("Sweet Pineapple");
    }
}
