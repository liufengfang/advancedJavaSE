package designPatterns.mediator;

/**
 * Created by liufengfang on 2019/8/9.
 */
public abstract class AbstractCardPartner {
    private int money;

    public abstract void changeMoney(int money,AbstractMediator mediator);

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
