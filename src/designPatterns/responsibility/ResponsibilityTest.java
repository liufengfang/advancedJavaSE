package designPatterns.responsibility;

/**
 * Created by liufengfang on 2019/8/8.
 */
public class ResponsibilityTest {

    public static void main(String[] args) {
        MyRequest myRequest = new MyRequest();
        myRequest.setReqString("HELLO!");
        MyResponse myResponse = new MyResponse();
        myResponse.setResStr("BYE!");

        FilterChain filterChain = new FilterChain();
        filterChain.addFilter(new FilterOne());
        filterChain.addFilter(new FilterTwo());

        filterChain.doFilt(myRequest,myResponse,filterChain);
    }
}
