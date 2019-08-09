package designPatterns.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by liufengfang on 2019/8/9.
 * ���ù�������Ч��֧�ִ���ϸ���ȵĶ���
 */
public class FlyweightFactory {
    static Map<String, Shape> shapes = new HashMap<String, Shape>();

    public static Shape getShape(String key) {
        Shape shape = shapes.get(key);
        //���shape==null,��ʾ������,���½�,���ұ��ֵ��������
        if (shape == null) {
            shape = new Circle(key);
            shapes.put(key, shape);
        }
        return shape;
    }

    public static int getSum() {
        return shapes.size();
    }

}
