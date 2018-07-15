package effectiveJava.item26;

import java.util.Arrays;

/**
 * Created by liufengfang on 2018/7/15.
 */
public class Stack {
    private static int CAP_SIZE = 3;
    private Object[] objects;
    private int index = 0;

    public Stack() {
        this.objects = new Object[CAP_SIZE];
    }

    public void insert(Object o) {
        System.out.println("objects.length = " + objects.length);
        if (!isFull()) {
            objects[index ++] = o;
        }
    }

    public Object pop(){
        Object o = null;
        if(index >= 0){
            int pi = -- index;
            o = objects[pi];
            objects[pi] = null;
        }
        return o;
    }

    private boolean isFull(){
        int len = objects.length;
        if (this.index == len) {
            objects = Arrays.copyOf(objects, objects.length * 2);
        }
        return false;
    }


    @Override
    public String toString() {
        return Arrays.toString(objects);
    }

}
