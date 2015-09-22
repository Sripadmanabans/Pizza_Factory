package pizza.types.chicago;

import base.Pizza;

/**
 * This is the class responsible for making the Chicago Style Veggie Pizza.
 * Created by Sripadmanaban on 9/22/2015.
 */
public class ChicagoStyleVeggiePizza extends Pizza {

    public ChicagoStyleVeggiePizza() {
        name = "Chicago Style Veggie Pizza";
        dough = "Extra Thick Crust";
        sauce = "Plum Tomato Sauce";

        toppings.add("Red Onions");
        toppings.add("Green Peppers");
        toppings.add("Sliced Jalapeno Peppers");
        toppings.add("Sweet Pineapple");
    }
}
