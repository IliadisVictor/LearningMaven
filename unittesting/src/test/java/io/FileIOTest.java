package io;

import io.FileIO;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class FileIOTest {
    FileIO IO = new FileIO();
    public static String Path = "src/test/resources/";


    @Test
    public void ValidFileNameTest(){
        int[] expectedNumbers = new int[] {1,5,6,6,7,8};
        String path = Path.concat("NumbersFileOne");
        Assert.assertArrayEquals(expectedNumbers, IO.readFile(path));
    }

    @Rule
    public ExpectedException Throw = ExpectedException.none();

    @Test
    public void TestFileNameNotFound(){
        Throw.expect(IllegalArgumentException.class);
        String path = Path.concat("NumbersFileTo");
        IO.readFile(path);
    }

    @Test
    public void TestReadFileEmptyInput(){
        Throw.expect(IllegalArgumentException.class);
        String path = Path.concat("EmptyFile.txt");
        IO.readFile(path);
    }

    @Test
    public void testReadFileContainsInvalidEntries(){
        int[] array = new int[] {5,3,6};
        String path = Path.concat("NumbersFileTwo");
        Assert.assertArrayEquals(array, IO.readFile(path));
    }


}
