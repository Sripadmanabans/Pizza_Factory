package pizza.stores;

import base.Pizza;
import base.PizzaStore;
import pizza.types.newyork.NYStyleCheesePizza;
import pizza.types.newyork.NYStylePepperoniPizza;
import pizza.types.newyork.NYStyleVeggiePizza;

/**
 * This is the class that is used to serve the New York style pizza
 * Created by Sripadmanaban on 9/28/2015.
 */
public class NewYorkPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza;

        switch (type) {
            case "Cheese":
                pizza = new NYStyleCheesePizza();
                break;
            case "Pepperoni":
                pizza = new NYStylePepperoniPizza();
                break;
            case "Veggie":
                pizza = new NYStyleVeggiePizza();
                break;
            default:
                pizza = null;
                break;
        }

        return pizza;
    }

}
