package designPatterns.mediator;

/**
 * Created by liufengfang on 2019/8/9.
 * 中介者模式（Mediator Pattern）是用来降低多个对象和类之间的通信复杂性。
 * 缺点:新增加一个同事类时，
 * 不得不去修改抽象中介者类和具体中介者类，
 * 此时可以使用观察者模式和状态模式来解决这个问题。
 */
public class MediatorDemo {
    public static void main(String[] args) {
        AbstractCardPartner cpA = new CardPartnerA();
        AbstractCardPartner cpB = new CardPartnerB();

        cpA.setMoney(20);
        cpB.setMoney(20);

        AbstractMediator mediator = new ConcreteMediator(cpA, cpB);
        cpA.changeMoney(5, mediator);
        System.out.println("A:" + cpA.getMoney());
        System.out.println("B:" + cpB.getMoney());

        cpB.changeMoney(25, mediator);
        System.out.println("A:" + cpA.getMoney());
        System.out.println("B:" + cpB.getMoney());
    }
}
