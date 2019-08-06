package designPatterns.bridge;

/**
 * Created by liufengfang on 2019/8/6.
 */
public class BridgeManager extends Bridge {

    public BridgeManager(Sourceable sourceable) {
        super(sourceable);
    }

    @Override
    public void connect() {
        System.out.println("Bridgemanager connnecting");
        sourceable.doSomething();
    }

    public static void main(String[] args) {
        BridgeManager bm = new BridgeManager(new MySql());
        bm.connect();

        System.out.println("-------------");
        bm = new BridgeManager(new Oracle());
        bm.connect();
    }
}

class MySql implements Sourceable {
    @Override
    public void doSomething() {
        System.out.println("MySql connected");
    }
}

class Oracle implements Sourceable {
    @Override
    public void doSomething() {
        System.out.println("Oracle Connected");
    }
}
