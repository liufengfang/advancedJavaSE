package designPatterns.responsibility;

/**
 * Created by liufengfang on 2019/8/8.
 */
public interface FilterInterface {
    void doFilt(MyRequest myRequest, MyResponse myResponse,FilterChain filterChain);
}
