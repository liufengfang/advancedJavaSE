package designPatterns.state;

/**
 * Created by liufengfang on 2019/8/8.
 */
public interface StateInterface {
    /**
     * @desc 预订房间
     * @return void
     */
    public void bookRoom();

    /**
     * @desc 退订房间
     * @return void
     */
    public void unsubscribeRoom();

    /**
     * @desc 入住
     * @return void
     */
    public void checkInRoom();

    /**
     * @desc 退房
     * @return void
     */
    public void checkOutRoom();
}
