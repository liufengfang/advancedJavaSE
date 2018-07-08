package designPatterns.theFactoryPattern.simpleFactory;

/**
 * Created by liufengfang on 2018/7/8.
 */
public class PizzaCreator {

    public Pizza create(String name, Constants.pizzaSize size){
        Pizza pizza;

        if ("cheese".equals(name)) {
            pizza = new CheesePizza(size);
        } else if ("greek".equals(name)) {
            pizza = new GreekPizza(size);
        } else {
            pizza = null;
        }

        return pizza;
    };
}
