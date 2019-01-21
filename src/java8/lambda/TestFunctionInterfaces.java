package java8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

import static java.util.Comparator.comparingInt;

/**
 * Created by liufengfang on 2019/1/21.
 */
public class TestFunctionInterfaces {
    public static void main(String[] args) {
        t1();
    }

    private static void t1(){
        List<String> words = Arrays.asList("a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa");
        Collections.shuffle(words);
        System.out.println(words);

        words.sort(comparing(String::length));
        System.out.println(words);

        Collections.shuffle(words);
        words.sort(comparing2(String::length));
        System.out.println(words);

        //final version
        Collections.shuffle(words);
        words.sort(Comparator.comparingInt(String::length));
        System.out.println(words);
    }

    private static Comparator<? super String> comparing(Function<String,Integer> act) {
        return (x, y) -> act.apply(x) - act.apply(y);
    }

    private static Comparator<? super String> comparing2(ToIntFunction<String> act) {
        return Comparator.comparingInt(act);
    }


}
