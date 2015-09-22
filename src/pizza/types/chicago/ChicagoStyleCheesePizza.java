package pizza.types.chicago;

import base.Pizza;

/**
 * This is the Chicago Style Cheese pizza.
 * Created by Sripadmanaban on 9/22/2015.
 */
public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Sauce and Cheese Pizza";
        dough = "Extra Thick Crust";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    protected void cut() {
        System.out.println("Cutting the pizza into square slices.");
    }
}
