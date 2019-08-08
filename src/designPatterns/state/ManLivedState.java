package designPatterns.state;

/**
 * Created by liufengfang on 2019/8/8.
 * ÒÑÈë×¡
 */
public class ManLivedState implements StateInterface {
    private Room room;

    public ManLivedState(Room room) {
        this.room = room;
    }

    @Override
    public void bookRoom() {
        System.out.println("room is ManLivedState,cannot bookRoom!");
    }

    @Override
    public void unsubscribeRoom() {
        System.out.println("room is ManLivedState,cannot unsubscribeRoom!");
    }

    @Override
    public void checkInRoom() {
        System.out.println("hi man,u've living in,there's no need to checkInRoom!");
    }

    @Override
    public void checkOutRoom() {
        room.setState(room.getBlankState());
        System.out.println("checkOutRoom success!");
    }
}
