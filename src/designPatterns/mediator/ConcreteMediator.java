package designPatterns.mediator;

/**
 * Created by liufengfang on 2019/8/9.
 */
public class ConcreteMediator extends AbstractMediator {
    public ConcreteMediator(AbstractCardPartner cp1, AbstractCardPartner cp2){
        super(cp1, cp2);
    }

    @Override
    public void AWin(int money) {
        cp1.setMoney(cp1.getMoney() + money);
        cp2.setMoney(cp2.getMoney() - money);
    }

    @Override
    public void BWin(int money) {
        cp1.setMoney(cp1.getMoney() - money);
        cp2.setMoney(cp2.getMoney() + money);
    }
}
