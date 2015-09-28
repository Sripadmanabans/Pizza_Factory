package pizza.types.chicago;

import base.Pizza;

/**
 * This is the class responsible for makein Chicago Style Pepperoni Pizza.
 * Created by Sripadmanaban on 9/22/2015.
 */
public class ChicagoStylePepperoniPizza extends Pizza {

    public ChicagoStylePepperoniPizza() {
        name = "Chicago Style Pepperoni Pizza";
        dough = "Extra Thick Crust";
        sauce = "Plum Tomato Sauce";

        toppings.add("Pepperoni Slices");
        toppings.add("Red Onions");
    }
}
