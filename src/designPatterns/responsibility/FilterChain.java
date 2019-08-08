package designPatterns.responsibility;

import java.util.LinkedList;

/**
 * Created by liufengfang on 2019/8/8.
 * 1.实现了FilterInterface接口（在这个例子中，不实现也可以）
 * 2.保存职责链的数据结构LinkedList
 */
public class FilterChain implements FilterInterface{
    //保证filter增加的顺序，和开始filt的顺序一致。
    LinkedList<FilterInterface> filters = new LinkedList<>();
    private int index;

    public void doFilt(MyRequest myRequest, MyResponse myResponse, FilterChain filterChain) {
        //防止下标越界异常
        if (--index >= 0) {
            filters.get(index).doFilt(myRequest,myResponse,filterChain);
        }
    }

    public void addFilter(FilterInterface filter) {
        index ++;
        filters.addFirst(filter);
    }
}
