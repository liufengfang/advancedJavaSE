package designPatterns.state;

/**
 * Created by liufengfang on 2019/8/8.
 */
public class BlankState implements StateInterface {
    private Room room;

    public BlankState(Room room) {
        this.room = room;
    }

    @Override
    public void bookRoom() {
        room.setState(room.getBookedState());
        System.out.println("room book success!");
    }

    @Override
    public void unsubscribeRoom() {
        System.out.println("room is blank,cannot unsubscribeRoom");
    }

    @Override
    public void checkInRoom() {
        room.setState(room.getManLivedState());
        System.out.println("room checked in success");
    }

    @Override
    public void checkOutRoom() {
        System.out.println("room is blank,cannot checkOutRoom");
    }
}
