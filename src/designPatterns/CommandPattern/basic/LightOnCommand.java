package designPatterns.CommandPattern.basic;

/**
 * Created by liufengfang on 2018/7/11.
 * the concrete command
 */
public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void excute() {
        light.on();
    }
}
