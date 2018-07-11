package designPatterns.CommandPattern;

/**
 * Created by liufengfang on 2018/7/11.
 * the concrete command
 */
public class GarageDoorOpenCommand implements Command {
    private GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void excute() {
        this.garageDoor.up();
    }
}
