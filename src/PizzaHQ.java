import base.PizzaStore;
import pizza.stores.ChicagoPizzaStore;
import pizza.stores.NewYorkPizzaStore;

/**
 * This is the class that acts as the hq for the pizza.
 * Created by Sripadmanaban on 9/28/2015.
 */
public class PizzaHQ {

    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NewYorkPizzaStore();
        nyPizzaStore.orderPizza("Cheese");

        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        chicagoPizzaStore.orderPizza("Veggie");

    }

}
