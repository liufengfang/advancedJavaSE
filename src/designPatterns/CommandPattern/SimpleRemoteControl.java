package designPatterns.CommandPattern;

/**
 * Created by liufengfang on 2018/7/11.
 * the invoker
 */
public class SimpleRemoteControl {
    private Command slot;

    public SimpleRemoteControl() { }

    public void setCommand(Command command) {
        this.slot = command;
    }

    public void buttonPressed(){
        this.slot.excute();
    }
}
