package java8.stream;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * Created by liufengfang on 2018/11/16.
 */
public class TestOptional1 {
    public static void main(String[] args) {

        String[] stringArray = new String[]{"a", "b", "ab", "abc", "db"};

//        Stream.of(stringArray).max(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareToIgnoreCase(o2);
//            }
//        });

        Optional<String> stringOptional = Stream.of(stringArray).max((s1,s2) -> s1.length() - s2.length());
        String result = stringOptional.orElse("");
        System.out.println(result);
    }


}
