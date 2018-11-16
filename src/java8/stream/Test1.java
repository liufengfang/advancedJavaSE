package java8.stream;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Created by liufengfang on 2018/11/16.
 */
public class Test1 {
    public static void main(String[] args) {
        String[] stringArray = new String[]{"a", "b", "ab", "abc", "db"};
        Stream<String> stringStream = Stream.of(stringArray);
//        long l = stringStream.count();
//        System.out.println(l);

        Stream<String> resultStream = stringStream.filter(s -> s.length() > 1);
        Object [] strs = resultStream.toArray();
        System.out.println(Arrays.toString(strs));
    }
}
