package pizza.types.newyork;

import base.Pizza;

/**
 * This is the class that makes New York style Cheese Pizza.
 * Created by Sripadmanaban on 9/22/2015.
 */
public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }

}
