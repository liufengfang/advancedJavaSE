package designPatterns.mediator;

/**
 * Created by liufengfang on 2019/8/9.
 */
public abstract class AbstractMediator {

    protected AbstractCardPartner cp1;
    protected AbstractCardPartner cp2;

    public AbstractMediator(AbstractCardPartner cp1, AbstractCardPartner cp2) {
        this.cp1 = cp1;
        this.cp2 = cp2;
    }

    public abstract void AWin(int money);
    public abstract void BWin(int money);

}
