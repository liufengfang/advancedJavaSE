package designPatterns.CommandPattern.basic;

/**
 * Created by liufengfang on 2018/7/11.
 * the receiver
 */
public class Light {
    public void on(){
        System.out.println("Light is turned on");
    }
    void off(){
        System.out.println("Light is closed up");
    }
}
