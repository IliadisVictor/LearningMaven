package math;
import java.util.ArrayList;
import io.FileIO;

public class ArrayOperations {

    public int[] findPrimesInFile(FileIO fileIo, String filepath, MyMath myMath) {
        int InitialNumber[] = fileIo.readFile(filepath);
        ArrayList<Integer> PrimeNumbers= new ArrayList<Integer>();
        for (int i=0;i <InitialNumber.length ;i++) {
            if (myMath.isPrime(InitialNumber[i])) {
                PrimeNumbers.add(InitialNumber[i]);
            }
        }

        int[] PrimeNumbersArray = new int[PrimeNumbers.size()];
        for (int i=0;i <PrimeNumbers.size() ;i++) {
            PrimeNumbersArray[i]= PrimeNumbers.get(i);
        }
        return PrimeNumbersArray;
    }

}
