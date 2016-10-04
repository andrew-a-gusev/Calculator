import org.junit.Test;

public class Calculator {

    public int value(String input) {
        Operator operator= getOperator(input);
        Operands operands = getOperands(input);
        return operator.apply(operands);
    }

    private Operands getOperands(String input) {
        String[] substring = input.split("\\+|-|\\*|/");
        Operands Operands = new Operands();
        Operands.var1 = Integer.valueOf(substring[0]);
        Operands.var2 = Integer.valueOf(substring[1]);
        return Operands;
    }

    private Operator getOperator(String input) {
        /**
         * Norm?
         */
        for (int i=0; i < input.length(); i++) {
            if ('+' == input.charAt(i)) return new SumOperator();
            else if ('-' == input.charAt(i)) return new DiffOperator();
            else if ('*' == input.charAt(i)) return new MulOperator();
            else if ('/' == input.charAt(i)) return new DivOperarot();
                }
        return null;
    }

}
