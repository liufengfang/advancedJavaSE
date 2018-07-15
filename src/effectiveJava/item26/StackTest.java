package effectiveJava.item26;

/**
 * Created by liufengfang on 2018/7/15.
 */
public class StackTest {
    public static void main(String[] args) {
        testGenericStack();
//        testNoneGenericStack();
    }

    public static void testNoneGenericStack(){
        System.out.println("testing NoneGenericStack");
        Stack stack = new Stack();
        stack.insert("A");
        stack.insert("B");
        stack.insert("C");
        stack.insert("D");
        stack.insert("E");
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.toString());
    }

    public static void testGenericStack(){
        System.out.println("testing genericStack");
        GenericStack<String> stack = new GenericStack<String>();

        stack.insert("A");
        stack.insert("B");
        stack.insert("C");
        stack.insert("D");
        stack.insert("E");
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.toString());
    }
}
