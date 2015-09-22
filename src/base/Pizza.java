package base;

import java.util.ArrayList;
import java.util.List;

/**
 * This is the base class for all the pizzas.
 * Created by Sripadmanaban on 9/22/2015.
 */
public abstract class Pizza {

    protected String name;
    protected String dough;
    protected String sauce;
    protected List<String> toppings = new ArrayList<>();

    /**
     * The function is called to prepare the pizza.
     */
    protected void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough to get " + dough);
        System.out.println("Adding a scintillating layer of " + sauce);
        System.out.println("Adding toppings...");
        for (String topping : toppings) {
            System.out.println("    " + topping);
        }
    }

    /**
     * This function is called to bake the pizza.
     */
    protected void bake() {
        System.out.println("Bake for 25 minutes at 350F.");
    }

    /**
     * This function is called to cut the pizza.
     */
    protected void cut() {
        System.out.println("Cut the pizza into diagonal slices.");
    }

    /**
     * This function is called to box the pizza.
     */
    protected void box() {
        System.out.println("Place the pizza carefully in official PizzaStore Box.");
    }

    /**
     * Function used to return the name of the pizza.
     *
     * @return A string that contains the name of the pizza.
     */
    public String getName() {
        return name;
    }

}
