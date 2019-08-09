package designPatterns.mediator;

/**
 * Created by liufengfang on 2019/8/9.
 * �н���ģʽ��Mediator Pattern�����������Ͷ���������֮���ͨ�Ÿ����ԡ�
 * ȱ��:������һ��ͬ����ʱ��
 * ���ò�ȥ�޸ĳ����н�����;����н����࣬
 * ��ʱ����ʹ�ù۲���ģʽ��״̬ģʽ�����������⡣
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
