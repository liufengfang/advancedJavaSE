package designPatterns.CommandPattern.advance;

import designPatterns.CommandPattern.basic.Command;

/**
 * Created by liufengfang on 2018/7/12.
 * invoker
 */
public class RemoteControl {

    private Command[] ons;
    private Command[] offs;

    public RemoteControl() {
        ons = new Command[7];
        offs = new Command[7];

        for (int i = 0; i < 7; i++) {
            ons[i] = new NoCommand();
            offs[i] = new NoCommand();
        }
    }

    public void setCommand(int slotNo ,Command onCommand,Command offCommand){
        this.ons[slotNo] = onCommand;
        this.offs[slotNo] = offCommand;
    }

    public void pressOnButton(int slotNo){
        ons[slotNo].excute();
    }

    public void pressOffButton(int slotNo){
        offs[slotNo].excute();
    }
}
