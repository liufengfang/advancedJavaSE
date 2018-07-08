package designPatterns.theFactoryPattern.simpleFactory;

import designPatterns.theFactoryPattern.factoryMethod.PizzaFactory;

/**
 * Created by liufengfang on 2018/7/8.
 */
public class CheesePizza implements Pizza{
    private Constants.pizzaSize size;

    public CheesePizza(Constants.pizzaSize size){
        this.size = size;
        System.out.println("creating " + size + " Pizza");
    }

    @Override
    public String toString(){
        return this.getClass().getSimpleName() + ", size: " + this.size;
    }

    @Override
    public void prepare() {

    }

    @Override
    public void bake() {

    }

    @Override
    public void cut() {

    }

    @Override
    public void box() {

    }

    public static final PizzaFactory NEWYORK_PIZZAFACORY = new PizzaFactory(){
        @Override
        public Pizza createPizza(Constants.pizzaSize size) {
            Pizza pizza=new CheesePizza(size);
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
            return pizza;
        }
    };

    public static final PizzaFactory TOKYO_PIZZAFACORY = new PizzaFactory(){
        @Override
        public Pizza createPizza(Constants.pizzaSize size) {
            Pizza pizza=new CheesePizza(size);
            pizza.prepare();
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.cut();
            pizza.box();
            return pizza;
        }
    };
}
