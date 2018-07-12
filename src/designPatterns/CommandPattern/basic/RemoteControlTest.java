package designPatterns.CommandPattern.basic;

/**
 * Created by liufengfang on 2018/7/11.
 * the cient
 */
public class RemoteControlTest {

    public static void main(String[] args) {

        Light light = new Light();
        Command command = new LightOnCommand(light);

        SimpleRemoteControl src = new SimpleRemoteControl();
        src.setCommand(command);
        src.buttonPressed();

        //receiver   action
        GarageDoor garageDoor = new GarageDoor();
        Command gdCommand = new GarageDoorOpenCommand(garageDoor);

        src.setCommand(gdCommand);
        src.buttonPressed();
    }
}
