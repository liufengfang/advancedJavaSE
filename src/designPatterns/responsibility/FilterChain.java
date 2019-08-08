package designPatterns.responsibility;

import java.util.LinkedList;

/**
 * Created by liufengfang on 2019/8/8.
 * 1.ʵ����FilterInterface�ӿڣ�����������У���ʵ��Ҳ���ԣ�
 * 2.����ְ���������ݽṹLinkedList
 */
public class FilterChain implements FilterInterface{
    //��֤filter���ӵ�˳�򣬺Ϳ�ʼfilt��˳��һ�¡�
    LinkedList<FilterInterface> filters = new LinkedList<>();
    private int index;

    public void doFilt(MyRequest myRequest, MyResponse myResponse, FilterChain filterChain) {
        //��ֹ�±�Խ���쳣
        if (--index >= 0) {
            filters.get(index).doFilt(myRequest,myResponse,filterChain);
        }
    }

    public void addFilter(FilterInterface filter) {
        index ++;
        filters.addFirst(filter);
    }
}
