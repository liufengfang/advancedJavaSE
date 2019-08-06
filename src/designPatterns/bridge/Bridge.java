package designPatterns.bridge;

/**
 * Created by liufengfang on 2019/8/6.
 */
public abstract class Bridge {
    protected Sourceable sourceable;

    public Bridge(Sourceable sourceable) {
        this.sourceable = sourceable;
    }

    public abstract void connect();
}
