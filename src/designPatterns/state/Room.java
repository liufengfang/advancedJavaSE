package designPatterns.state;

/**
 * Created by liufengfang on 2019/8/8.
 */
public class Room {
    //Ϊ���л�״̬ʱ��������״̬ʵ����������С�
    private StateInterface blankState;
    private StateInterface bookedState;
    private StateInterface manLivedState;

    //��¼��ǰ״̬
    private StateInterface state;

    public Room() {
        //�˴��ǹؼ���֮һ
        blankState = new BlankState(this);
        bookedState = new BookedState(this);
        manLivedState = new ManLivedState(this);

        this.state = blankState;
    }

    public void bookRoom() {
        state.bookRoom();
    }

    public void unsubscribeRoom() {
        state.unsubscribeRoom();
    }

    public void checkInRoom() {
        state.checkInRoom();
    }

    public void checkOutRoom() {
        state.checkOutRoom();
    }


    public StateInterface getState() {
        System.out.println("this room'state is " + state.getClass().getSimpleName());
        return state;
    }

    public void setState(StateInterface state) {
        this.state = state;
    }

    public StateInterface getBlankState() {
        return blankState;
    }

    public void setBlankState(StateInterface blankState) {
        this.blankState = blankState;
    }

    public StateInterface getBookedState() {
        return bookedState;
    }

    public void setBookedState(StateInterface bookedState) {
        this.bookedState = bookedState;
    }

    public StateInterface getManLivedState() {
        return manLivedState;
    }

    public void setManLivedState(StateInterface manLivedState) {
        this.manLivedState = manLivedState;
    }
}
