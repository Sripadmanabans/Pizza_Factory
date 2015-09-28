package pizza.stores;

import base.Pizza;
import base.PizzaStore;
import pizza.types.chicago.ChicagoStyleCheesePizza;
import pizza.types.chicago.ChicagoStylePepperoniPizza;
import pizza.types.chicago.ChicagoStyleVeggiePizza;

/**
 * This is the class that is used to create the Chicago Pizzas.
 * Created by Sripadmanaban on 9/28/2015.
 */
public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza;

        switch (type) {
            case "Cheese":
                pizza = new ChicagoStyleCheesePizza();
                break;
            case "Pepperoni":
                pizza = new ChicagoStylePepperoniPizza();
                break;
            case "Veggie":
                pizza = new ChicagoStyleVeggiePizza();
                break;
            default:
                pizza = null;
                break;
        }

        return pizza;
    }

}
