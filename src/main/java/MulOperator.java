
public class MulOperator implements Operator {
    @Override
    public double apply(Operands operands) {
        return operands.var1*operands.var2;
    }
}
