package designPatterns.responsibility;

/**
 * Created by liufengfang on 2019/8/8.
 */
public class FilterTwo implements FilterInterface {
    @Override
    public void doFilt(MyRequest myRequest, MyResponse myResponse, FilterChain filterChain) {
        System.out.println("FilterTwo begin filt " + myRequest.getReqString());
        filterChain.doFilt(myRequest,myResponse,filterChain);
        System.out.println("FilterTwo end filt " + myResponse.getResStr());
    }
}
