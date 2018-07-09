package designPatterns.theSigletonPattern;

/**
 * Created by liufengfang on 2018/7/9.
 */
public class Singleton {
    private String name;

    //    public static Singleton UNIQUEINSTANCE = null;
    private static Singleton UNIQUEINSTANCE;

    private Singleton() {
    }

    private Singleton(String name) {
        this.name = name;
    }

    //init on Class loading
//    static {
//        UNIQUEINSTANCE = new Singleton();
//    }

    //lazy instantiation
    private Singleton getInstainceWithName() {
        if (null == UNIQUEINSTANCE) {
            UNIQUEINSTANCE = new Singleton();
        }
        return UNIQUEINSTANCE;
    }

    private Singleton getInstainceWithName(String name) {
        if (null == UNIQUEINSTANCE) {
            UNIQUEINSTANCE = new Singleton(name);
        }
        return UNIQUEINSTANCE;
    }
}
