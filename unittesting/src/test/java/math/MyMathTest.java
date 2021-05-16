package math;

import org.junit.Assert;
import org.junit.Test;

import math.MyMath;


public class MyMathTest {
    MyMath obj = new MyMath();

    @Test
    public void testZeroFactorial(){
        Assert.assertEquals(1,obj.factorial(0));
    }

    @Test (expected = IllegalArgumentException.class)
    public void testNegativeNumbException(){
        obj.factorial(-31);
    }


    @Test
    public void testFactorialResult(){
        Assert.assertEquals(5*4*3*2,obj.factorial(5));
    }

    @Test
    public void TestPrime() {
        Assert.assertTrue(obj.isPrime(10));

    }

    @Test(expected =  IllegalArgumentException.class)
    public void TestValidInput(){
        obj.isPrime(1);
    }












}
