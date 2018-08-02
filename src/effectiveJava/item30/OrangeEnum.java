package effectiveJava.item30;

/**
 * Created by liufengfang on 2018/8/2.
 */
public enum OrangeEnum {

    BULUE(1),
    YELLOW(2);

    private final int order;

    OrangeEnum(int order){
        this.order = order;
    }

    public int getOrder(){
        return order;
    }

    public static void main(String[] args) {
        System.out.println(OrangeEnum.YELLOW.order);
    }
}
