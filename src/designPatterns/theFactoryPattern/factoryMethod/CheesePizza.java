package designPatterns.theFactoryPattern.factoryMethod;

import designPatterns.theFactoryPattern.simpleFactory.Constants;
import designPatterns.theFactoryPattern.simpleFactory.Pizza;

/**
 * Created by liufengfang on 2018/7/8.
 */
public class CheesePizza implements Pizza {
    private Constants.pizzaSize size;
    private String region;

    public CheesePizza(Constants.pizzaSize size, String region){
        this.size = size;
        this.region = region;
        System.out.println(region + " store created " + size + " cheese Pizza");
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
            Pizza pizza=new CheesePizza(size,"NewYork");

            return pizza;
        }
    };

    public static final PizzaFactory TOKYO_PIZZAFACORY = new PizzaFactory(){
        @Override
        public Pizza createPizza(Constants.pizzaSize size) {
            Pizza pizza=new CheesePizza(size,"Tokyo");

            return pizza;
        }
    };
}
