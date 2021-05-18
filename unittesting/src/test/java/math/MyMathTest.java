package math;

import org.junit.Assert;
import org.junit.Test;

import math.MyMath;


public class MyMathTest {
    MyMath obj = new MyMath();


//    test factorial method for input zero
    @Test
    public void testZeroFactorial(){
        Assert.assertEquals(1,obj.factorial(0));
    }
//test  factorial for negative input
    @Test (expected = IllegalArgumentException.class)
    public void testNegativeNumbException(){
        obj.factorial(-31);
    }

//test factorial result for proper input
    @Test
    public void testFactorialResult(){
        Assert.assertEquals(5*4*3*2,obj.factorial(5));
    }

//    test proper result for prime method
    @Test
    public void TestPrime() {
        Assert.assertTrue(obj.isPrime(10));

    }
// test prime method validity of input
    @Test(expected =  IllegalArgumentException.class)
    public void TestValidInput(){
        obj.isPrime(1);
    }












}
