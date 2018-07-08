package designPatterns.theFactoryPattern.factoryMethod;

import designPatterns.theFactoryPattern.factoryMethod.CheesePizza;
import designPatterns.theFactoryPattern.simpleFactory.Constants;
import designPatterns.theFactoryPattern.simpleFactory.Pizza;
import designPatterns.theFactoryPattern.simpleFactory.PizzaCreator;

/**
 * Created by liufengfang on 2018/7/8.
 * 工厂方法总结:把对象的创建放到一个单独的类里面.
 * 最优解：1.创建工厂方法的抽象类或借口，实体类通过内部类实现工厂方法。2.面向接口工厂类编程。
 */
public class PizzaStore {

    public Pizza orderNYPizza(String name, Constants.pizzaSize size){
        Pizza pizza = null;
        if("cheese".equals(name)){
            pizza = CheesePizza.NEWYORK_PIZZAFACORY.createPizza(size);
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }
        return pizza;
    }

    public Pizza orderTokyoPizza(String name, Constants.pizzaSize size){
        Pizza pizza = null;
        if("cheese".equals(name)){
            pizza = CheesePizza.TOKYO_PIZZAFACORY.createPizza(size);
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }
        return pizza;
    }

    //更优解
    public Pizza orderPizza(PizzaFactory factory,Constants.pizzaSize size) {
        Pizza pizza = factory.createPizza(size);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

}
