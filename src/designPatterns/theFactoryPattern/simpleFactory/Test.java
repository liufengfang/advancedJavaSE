package designPatterns.theFactoryPattern.simpleFactory;

/**
 * Created by liufengfang on 2018/7/8.
 */
public class Test {
    public static void main(String[] args) {

        PizzaStore ps = new PizzaStore(new PizzaCreator());
        Pizza pizza = ps.orderPizza("cheese", Constants.pizzaSize.MIDDLE);

        new Customer().eat(pizza);
    }
}
