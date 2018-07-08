package designPatterns.theFactoryPattern.factoryMethod;


import designPatterns.theFactoryPattern.simpleFactory.Constants;
import designPatterns.theFactoryPattern.simpleFactory.Pizza;

/**
 * Created by liufengfang on 2018/7/8.
 */
public class Test {
    public static void main(String[] args) {

        PizzaStore ps = new PizzaStore();
        Pizza pizza = ps.orderNYPizza("cheese", Constants.pizzaSize.MIDDLE);

        new Customer().eat(pizza);
    }
}
