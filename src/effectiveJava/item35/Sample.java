package effectiveJava.item35;

/**
 * Created by liufengfang on 2019/3/24.
 */
public class Sample {
    @Test
    public static void m1() {
    }

    public static void m2() {
    }

    @Test
    public static void m3() {
        throw new RuntimeException("Boom");
    }

    @Test
    public static void m4() {
    }

    @Test
    public void m5() {
    }

    public static void m6() {
    }

    @Test
    public static void m7() {
        throw new RuntimeException("crash");
    }

    public static void m8() {
    }

    @Test
    private static void m9(){}
}
