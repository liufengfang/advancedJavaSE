package java8.lambda;

import java.util.function.DoubleBinaryOperator;

/**
 * Created by liufengfang on 2019/1/21.
 */
public enum Operator {
    ADD("+", (x, y) -> x + y),
    SUBSTRACT("-", (x, y) -> x - y),
    MULTI("*", (x, y) -> x * y),
    DIVIDE("/", (x, y) -> x / y);


    private String symbel;
    private DoubleBinaryOperator op;

    Operator(String symbel, DoubleBinaryOperator op) {
        this.symbel = symbel;
        this.op = op;
    }

    double operate(double x,double y){
        return op.applyAsDouble(x,y);
    }

    @Override
    public String toString() {
        return this.symbel;
    }
}
