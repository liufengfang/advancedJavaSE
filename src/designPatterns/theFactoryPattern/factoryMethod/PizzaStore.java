package designPatterns.theFactoryPattern.factoryMethod;

import designPatterns.theFactoryPattern.factoryMethod.CheesePizza;
import designPatterns.theFactoryPattern.simpleFactory.Constants;
import designPatterns.theFactoryPattern.simpleFactory.Pizza;
import designPatterns.theFactoryPattern.simpleFactory.PizzaCreator;

/**
 * Created by liufengfang on 2018/7/8.
 * ���������ܽ�:�Ѷ���Ĵ����ŵ�һ��������������.
 * ���Ž⣺1.�������������ĳ�������ڣ�ʵ����ͨ���ڲ���ʵ�ֹ���������2.����ӿڹ������̡�
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

    //���Ž�
    public Pizza orderPizza(PizzaFactory factory,Constants.pizzaSize size) {
        Pizza pizza = factory.createPizza(size);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

}
