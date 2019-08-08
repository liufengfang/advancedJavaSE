package designPatterns.state;

/**
 * Created by liufengfang on 2019/8/8.
 */
public class StatePatternTest {
    public static void main(String[] args) {

        Room room0 = new Room();
        room0.setState(room0.getBlankState());

        Room room1 = new Room();
        room1.setState(room1.getManLivedState());

        Room[] rooms = new Room[2];
        rooms[0] = room0;
        room0.bookRoom();
        room0.checkOutRoom();

        System.out.println("--------------");
        rooms[1] = room1;

        for (int i = 0; i < 2; i++) {
            rooms[i].checkInRoom();
        }

        System.out.println("--------------");
        Room roomForPrepare = new Room();
        roomForPrepare.setState(roomForPrepare.getForPrepareState());
        roomForPrepare.bookRoom();
    }
}
