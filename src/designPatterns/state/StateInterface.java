package designPatterns.state;

/**
 * Created by liufengfang on 2019/8/8.
 */
public interface StateInterface {
    /**
     * @desc Ԥ������
     * @return void
     */
    public void bookRoom();

    /**
     * @desc �˶�����
     * @return void
     */
    public void unsubscribeRoom();

    /**
     * @desc ��ס
     * @return void
     */
    public void checkInRoom();

    /**
     * @desc �˷�
     * @return void
     */
    public void checkOutRoom();
}
