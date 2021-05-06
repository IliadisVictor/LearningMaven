import math.MyMath;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class MyMathParameterized {
    @Parameterized.Parameter (value = 0)
    public int n;
    @Parameterized.Parameter (value = 1)
    public int r;

    MyMath obj = new MyMath();

    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        Object[][] DoubleArray = new Object[][]{{0,1},{1,1},{2,2},{12,479001600}};
        return Arrays.asList(DoubleArray);
    }

    @Test
    public void TestFactorial(){
        Assert.assertEquals(r,obj.factorial(n));
    }


}
