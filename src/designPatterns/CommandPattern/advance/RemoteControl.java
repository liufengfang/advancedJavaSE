package designPatterns.CommandPattern.advance;

import designPatterns.CommandPattern.basic.Command;

/**
 * Created by liufengfang on 2018/7/12.
 * invoker
 */
public class RemoteControl {
    private int slotNo;

    private Command[] ons;
    private Command[] offs;

    public RemoteControl(int slotNo,Command on,Command off) {
        this.slotNo = slotNo;
        this.ons[slotNo] = on;
        this.offs[slotNo] = off;
    }

    public void pressOnButton(int slotNo){
        ons[slotNo].excute();
    }

    public void pressOffButton(int slotNo){
        offs[slotNo].excute();
    }
}
