package java8.lambda;

import java.util.*;
import java.util.function.ToIntFunction;

/**
 * Created by liufengfang on 2018/11/15.
 */
public class simple {
    public static void main(String[] args) {

        String s1 = "g";
        String s2 = "ab";
        String s3 = "cba";
        String s4 = "abcd";

        List<String> ls = new ArrayList<>(Arrays.asList(s1, s2, s3, s4));
        Collections.sort(ls);
        System.out.println(ls);

//        Collections.sort(ls,(l1,l2) -> l1.length() - l2.length());
        //1.can be replaced with below:
        Collections.sort(ls, Comparator.comparingInt((String str) -> str.length()));
        System.out.println(ls);

        Collections.shuffle(ls);
        System.out.println("shuffled:" + ls);
//        Comparator<String> comparator = Comparator.comparingInt(str -> str.length());
        //2.can be replaced with below:
        Comparator<String> comparator = Comparator.comparingInt(String :: length);
        Collections.sort(ls,comparator);
        System.out.println(ls);

//        Comparator<String> comparator = Comparator.comparingInt(new ToIntFunction<String>() {
//            @Override
//            public int applyAsInt(String value) {
//                return value.length();
//            }
//        });
    }
}
