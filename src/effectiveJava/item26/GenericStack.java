package effectiveJava.item26;

import java.util.Arrays;

/**
 * Created by liufengfang on 2018/7/15.
 */
public class GenericStack<E> {
    private static int CAP_SIZE = 3;
    private E[] Elements;
    private int index = 0;

    public GenericStack() {
        this.Elements = (E[]) new Object[CAP_SIZE];
    }

    public void insert(E e) {
        System.out.println("Elements.length = " + Elements.length);
        if (!isFull()) {
            Elements[index ++] = e;
        }
    }

    public E pop(){
        E e = null;
        if(index >= 0){
            int pi = -- index;
            e = Elements[pi];
            Elements[pi] = null;
        }
        return e;
    }

    private boolean isFull(){
        int len = Elements.length;
        if (this.index == len) {
            Elements = Arrays.copyOf(Elements, Elements.length * 2);
        }
        return false;
    }


    @Override
    public String toString() {
        return Arrays.toString(Elements);
    }

}
