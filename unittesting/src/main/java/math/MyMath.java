package math;

public class MyMath {
    public int factorial(int number) {
//        hello from the other side  iterate with -1 and multiple each number
        if (number < 0 || number > 12) throw new IllegalArgumentException("Number input should be in the range of 0-12");
        int fact = 1;
        for (int i = number; i >0 ;i-- ) {
            fact = fact * i ;
        }
        return fact;
    }



    public boolean isPrime(int n){
        if (n < 2) {
            throw new IllegalArgumentException("Number given should be in the range 0 , 12");

        }
        for (int i=n; i < n ; i++) {
//            if the mod of the divide with any number smaller than n and bigger than n gives a perfect divide return false
            if (n%i ==0) {
                return false;
            }
        }
        return true;
    }
}
