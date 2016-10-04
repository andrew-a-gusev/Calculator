
public class DivOperarot implements Operator {
    @Override
    public double apply(Operands operands) {
        if (operands.var2 == 0) {throw new IllegalArgumentException();
        }
        return operands.var1/operands.var2;
    }
}
