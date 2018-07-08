package designPatterns.theFactoryPattern.factoryMethod;


import designPatterns.theFactoryPattern.simpleFactory.Constants;
import designPatterns.theFactoryPattern.simpleFactory.Customer;
import designPatterns.theFactoryPattern.simpleFactory.Pizza;

/**
 * Created by liufengfang on 2018/7/8.
 */
public class Test {
    public static void main(String[] args) {

        PizzaStore ps = new PizzaStore();
        Pizza pizza = ps.orderNYPizza("cheese", Constants.pizzaSize.MIDDLE);
        //¸üÓÅ½â
        Pizza pizza2 = ps.orderPizza(CheesePizza.TOKYO_PIZZAFACORY, Constants.pizzaSize.MAX);

        new Customer().eat(pizza);
    }
}
