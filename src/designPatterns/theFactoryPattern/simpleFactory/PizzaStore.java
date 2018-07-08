package designPatterns.theFactoryPattern.simpleFactory;

/**
 * Created by liufengfang on 2018/7/8.
 */
public class PizzaStore {
    PizzaCreator pizzaCreator;

    public PizzaStore(PizzaCreator pizzaCreator) {
        this.pizzaCreator = pizzaCreator;
    }

    public Pizza orderPizza(String name, Constants.pizzaSize size){

        Pizza pizza = pizzaCreator.create(name, size);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

}
