package designPatterns.theFactoryPattern.simpleFactory;

/**
 * Created by liufengfang on 2018/7/8.
 */
public class GreekPizza implements Pizza {
    private Constants.pizzaSize size;

    public GreekPizza(Constants.pizzaSize size){
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
}
