import io.FileIO;
import math.ArrayOperations;
import math.MyMath;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ArrayOperationsTest {
    ArrayOperations AO = new ArrayOperations();
    public static String Path ="src/test/resources/";
    @Test
    public void FindPrimesMockTest() {
        MyMath Mymath = mock(MyMath.class);
        FileIO fileIO = mock(FileIO.class);

        when(Mymath.isPrime(1)).thenReturn(true);
        when(Mymath.isPrime(5)).thenReturn(true);
        when(Mymath.isPrime(6)).thenReturn(false);
        when(Mymath.isPrime(6)).thenReturn(false);
        when(Mymath.isPrime(7)).thenReturn(true);
        when(Mymath.isPrime(8)).thenReturn(false);

        String path = Path.concat("NumbersFileOne");
        when(fileIO.readFile(path)).thenReturn(new int[]{1,5,6,6,7,8});

        Assert.assertArrayEquals(new int[]{1,5,7},AO.findPrimesInFile(fileIO,path,Mymath));

    }


}
