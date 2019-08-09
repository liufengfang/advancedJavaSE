package designPatterns.flyweight;

/**
 * Created by liufengfang on 2019/8/9.
 */
public class Circle extends Shape {

    private String color;

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("画了一个" + color + "的圆形");
    }
}
