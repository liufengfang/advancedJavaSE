package designPatterns.theFactoryPattern.factoryMethod;

import designPatterns.theFactoryPattern.simpleFactory.CheesePizza;
import designPatterns.theFactoryPattern.simpleFactory.Constants;
import designPatterns.theFactoryPattern.simpleFactory.Pizza;
import designPatterns.theFactoryPattern.simpleFactory.PizzaCreator;

/**
 * Created by liufengfang on 2018/7/8.
 * 工厂方法总结:把对象的创建放到一个单独的类里面，
 */
public class PizzaStore {

    public Pizza orderNYPizza(String name, Constants.pizzaSize size){
        Pizza pizza = null;
        if("cheese".equals(name)){
            pizza = CheesePizza.NEWYORK_PIZZAFACORY.createPizza(Constants.pizzaSize.MAX);
        }
        return pizza;
    }

    public Pizza orderTokyoPizza(String name, Constants.pizzaSize size){
        Pizza pizza = null;
        if("cheese".equals(name)){
            pizza = CheesePizza.TOKYO_PIZZAFACORY.createPizza(Constants.pizzaSize.MAX);
        }
        return pizza;
    }

}
