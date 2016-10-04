import org.junit.Test;

import static org.junit.Assert.*;


public class TestBasikMath {
    @Test
    public void testAdd(){
        Calculator calc = new Calculator();
        String input = "12+1";
        double result = calc.value(input);
        double pole = 13;
        assertEquals(13,result,0.0);
    }

    @Test
    public void testDiff(){
        Calculator calc = new Calculator();
        String input = "25-5";
        double result = calc.value(input);
        assertEquals(20, result,0.0);
    }
    @Test
    public void testMul(){
        Calculator calc = new Calculator();
        String input = "2*7";
        double result = calc.value(input);
        assertEquals(14, result,0.0);
    }
    @Test
    public void testDivNaNull(){
        Calculator calc = new Calculator();
        String input = "6/0";
        double result = 0;
        try {
            result = calc.value(input);
        }
        catch (IllegalArgumentException e) {
            System.out.print("dsaadsads");
        }
        assertEquals(1,1);
    }

    public void testDiv(){
        Calculator calc = new Calculator();
        String input = "6/6";
        double result = calc.value(input);
        assertEquals(1, result,0.0);
    }
}