package base;

/**
 * This is the class that acts as the base for all the pizza stores.
 * Created by Sripadmanaban on 9/22/2015.
 */
public abstract class PizzaStore {

    /**
     * This is teh function that is used to order the pizza.
     *
     * @param type A string that contains the type of pizza.
     * @return An object of pizza that is prepared according to type and so on.
     */
    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    /**
     * This is the function that is used to create the pizza.
     *
     * @param type A string that contains the type of the pizza.
     * @return An object that contains the pizza based on the type.
     */
    public abstract Pizza createPizza(String type);

}
