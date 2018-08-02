package effectiveJava.item30;

/**
 * Created by liufengfang on 2018/8/2.
 */
public class AppleEnum {

    public enum AE {

        H_F_S(3,4),
        N_H(1, 2);

        public final int price;
        public final int amount;

        AE(int price, int amount) {
            this.price = price;
            this.amount = amount;
        }

        public int cost(){
            return price * amount;
        }

        @Override
        public String toString() {
            return "instance of AE : " + super.toString();
        }
    }

    public static void main(String[] args) {
        AE a1 = AE.H_F_S;
        int a1Price = a1.price;
        System.out.println("a1Price = " + a1Price);

        AE a2 = AE.N_H;
        int a2Price = a2.price;
        System.out.println("a2Price = " + a2Price);

        System.out.println("a1.values()=" + a1.values());
        System.out.println("a2=" + a2);
        System.out.println("a1.cost():" + a1.cost());
        System.out.println("a2.cost():" + a2.cost());

    }


}
