package designPatterns.theFactoryPattern.simpleFactory;

/**
 * Created by liufengfang on 2018/7/8.
 */
public interface Pizza {
    void prepare();
    void bake();
    void cut();
    void box();
}
