package designPatterns.mediator;

/**
 * Created by liufengfang on 2019/8/9.
 */
public class CardPartnerA extends AbstractCardPartner {
    @Override
    public void changeMoney(int money, AbstractMediator mediator) {
        System.out.println("CardPartnerA win money--" + money);
        mediator.AWin(money);
    }
}
