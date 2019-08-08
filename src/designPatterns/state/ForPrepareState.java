package designPatterns.state;

/**
 * Created by liufengfang on 2019/8/8.
 * ±¸ÓÃ×´Ì¬
 */
public class ForPrepareState implements StateInterface{

    @Override
    public void bookRoom() {
        System.out.println("Room for prepare,can do nothing!");
    }

    @Override
    public void unsubscribeRoom() {
        System.out.println("Room for prepare,can do nothing!");
    }

    @Override
    public void checkInRoom() {
        System.out.println("Room for prepare,can do nothing!");
    }

    @Override
    public void checkOutRoom() {
        System.out.println("Room for prepare,can do nothing!");
    }
}
