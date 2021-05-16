package io;

import io.FileIO;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class FileIOTest {
    FileIO IO = new FileIO();
    public static String Path = "src/test/resources/";

//basic test for valid inputs
    @Test
    public void ValidFileNameTest(){
        int[] expectedNumbers = new int[] {1,5,6,6,7,8};
        String path = Path.concat("NumbersFileOne");
        Assert.assertArrayEquals(expectedNumbers, IO.readFile(path));
    }

    @Rule
    public ExpectedException Throw = ExpectedException.none();


//    Tests inability to find the file for which the path was given
    @Test
    public void TestFileNameNotFound(){
        Throw.expect(IllegalArgumentException.class);
        Throw.expectMessage("Input file does not exist");
        String path = Path.concat("NumbersFileTo");
        IO.readFile(path);
    }

//    Tests empty file
    @Test
    public void TestReadFileEmptyInput(){
        Throw.expect(IllegalArgumentException.class);
        Throw.expectMessage("Given file is empty");
        String path = Path.concat("EmptyFile.txt");
        IO.readFile(path);
    }


//    Strings doubles in files testing
    @Test
    public void testReadFileContainsInvalidEntries(){
        int[] array = new int[] {5,3,6};
        String path = Path.concat("NumbersFileTwo");
        Assert.assertArrayEquals(array, IO.readFile(path));
    }


}
