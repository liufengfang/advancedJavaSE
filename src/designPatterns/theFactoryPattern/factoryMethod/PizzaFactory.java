package designPatterns.theFactoryPattern.factoryMethod;

import designPatterns.theFactoryPattern.simpleFactory.Constants;
import designPatterns.theFactoryPattern.simpleFactory.Pizza;

/**
 * Created by liufengfang on 2018/7/8.
 */
public interface PizzaFactory {
    Pizza createPizza(Constants.pizzaSize size);
}
