package effectiveJava.item35;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by liufengfang on 2019/3/24.
 */
public class RunTest {
    public static void main(String[] args) throws ClassNotFoundException {
        int tests = 0;
        int passed = 0;
        Class testClass = Class.forName(args[0]);

        for (Method m : testClass.getDeclaredMethods()) {
            if (m.isAnnotationPresent(Test.class)) {
                tests++;
                try {
                    m.invoke(null);
                    passed++;
                } catch (InvocationTargetException e) {
                    Throwable exc = e.getCause();
                    System.out.println(m + "failed: " + exc);
                } catch (Exception exc) {
                    System.out.println("INVALID @Test:" + m);
                }

            }
        }

        System.out.printf("Passed: %d,Failed: %d%n",
                passed, tests - passed);
    }
}

//ÃüÁîÐÐÖ´ÐÐ
//        [liufengfang@23:20:21]~/IdeaProjects/advanceJavaSE/out/production/advanceJavaSE$ java -cp . effectiveJava.item35.RunTest \
//        > effectiveJava.item35.Sample
