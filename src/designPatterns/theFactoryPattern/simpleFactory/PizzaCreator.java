package designPatterns.theFactoryPattern.simpleFactory;

/**
 * Created by liufengfang on 2018/7/8.
 */
//简单工厂模式(Simple Factory Pattern)，通过参数的不同返回不同的实例，被创建的父类通常有共同的父类。
//    因为经常是静态的，所以也叫静态工厂方法模式(Static Factory Method Pattern)
//工厂模式即工厂方法模式，有一个'大哥'是抽象工厂模式。

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
