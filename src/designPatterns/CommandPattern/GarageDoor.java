package designPatterns.CommandPattern;

/**
 * Created by liufengfang on 2018/7/11.
 * the receiver
 */
public class GarageDoor {
    public void up(){
        System.out.println("GarageDoor up");
    }

    public void down(){
        System.out.println("GarageDoor down");
    }

    public void lightOn(){
        System.out.println("GarageDoor lightOn");
    }

    public void lightOff(){
        System.out.println("GarageDoor lightDown");
    }
}
