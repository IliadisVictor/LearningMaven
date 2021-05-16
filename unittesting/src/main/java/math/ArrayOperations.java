package math;
import java.util.ArrayList;
import io.FileIO;

public class ArrayOperations {


//    The following method reads a file and returns in an array only the prime numbers
    public int[] findPrimesInFile(FileIO fileIo, String filepath, MyMath myMath) {
//        Stores all numbers from file
        int InitialNumber[] = fileIo.readFile(filepath);
//        Create arraylist to dynamically add the prime ones it finds from iterating the Initial numbers
        ArrayList<Integer> PrimeNumbers= new ArrayList<Integer>();
        for (int i=0;i <InitialNumber.length ;i++) {
//            uses the isPrime to select the primes
            if (myMath.isPrime(InitialNumber[i])) {
                PrimeNumbers.add(InitialNumber[i]);
            }
        }
// Creates an array to return it with size of the arraylist
        int[] PrimeNumbersArray = new int[PrimeNumbers.size()];
        for (int i=0;i <PrimeNumbers.size() ;i++) {
//            stores every number from primes
            PrimeNumbersArray[i]= PrimeNumbers.get(i);
        }
        return PrimeNumbersArray;
    }

}
