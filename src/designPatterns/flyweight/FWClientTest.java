package designPatterns.flyweight;

/**
 * Created by liufengfang on 2019/8/9.
 */
public class FWClientTest {
    public static void main(String[] args) {
        Shape shape1 = FlyweightFactory.getShape("��ɫ");
        shape1.draw();

        Shape shape2 = FlyweightFactory.getShape("��ɫ");
        shape2.draw();

        Shape shape3 = FlyweightFactory.getShape("��ɫ");
        shape3.draw();

        Shape shape4 = FlyweightFactory.getShape("��ɫ");
        shape4.draw();

        Shape shape5 = FlyweightFactory.getShape("��ɫ");
        shape5.draw();

        Shape shape6 = FlyweightFactory.getShape("��ɫ");
        shape6.draw();

        System.out.println("һ��������" + FlyweightFactory.getSum() + "����ɫ��Բ��");
    }
}
