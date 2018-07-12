package designPatterns.CommandPattern.advance;

import designPatterns.CommandPattern.basic.Command;

/**
 * Created by liufengfang on 2018/7/12.
 */
public class NoCommand implements Command {
    @Override
    public void excute() {
        System.out.println("do nothing");
    }
}
