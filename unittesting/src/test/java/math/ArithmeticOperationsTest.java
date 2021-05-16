package math;

import math.ArithmeticOperations;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class ArithmeticOperationsTest {
    ArithmeticOperations AO = new ArithmeticOperations();

    @Test (expected = ArithmeticException.class)
    public void testDivideWithZero(){
        AO.divide(5,0);
    }

    @Rule
    public ExpectedException Throw = ExpectedException.none();

    @Test
    public void testMultiplyNegativeException() {
        Throw.expect(IllegalArgumentException.class);
        AO.multiply(-4,4);
    }

    @Test
    public void TestMultiplyMaxInteger(){
        Throw.expect(IllegalArgumentException.class);
        AO.multiply(Integer.MAX_VALUE/3+3,3);
    }

    @Test
    public void testMultiply(){
        Assert.assertEquals(31*35,AO.multiply(31,35));
    }



}
