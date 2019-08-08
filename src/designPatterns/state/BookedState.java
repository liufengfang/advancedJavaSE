package designPatterns.state;

/**
 * Created by liufengfang on 2019/8/8.
 * ÒÑÔ¤¶©
 */
public class BookedState implements StateInterface{
    private Room room;

    public BookedState(Room room) {
        this.room = room;
    }

    @Override
    public void bookRoom() {
        System.out.println("room is booked,cannot book again!");
    }

    @Override
    public void unsubscribeRoom() {
        room.setState(room.getBlankState());
        System.out.println("room unsubscribeRoom success!");
    }

    @Override
    public void checkInRoom() {
        room.setState(room.getManLivedState());
        System.out.println("room checkInRoom success!");
    }

    @Override
    public void checkOutRoom() {
        System.out.println("room is booked,you haven't checked in,cannot checkOutRoom!");
    }
}
