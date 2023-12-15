/*
* MathUtils.java
*/

/**
* Provides static mathematical utility functions.
*/
public class MathUtils {
//-------------------------------------------------------------
// Returns the factorial of the argument given
//-------------------------------------------------------------
    public static int factorial(int n) throws IllegalArgumentException {
        if(n<0) throw new IllegalArgumentException("You can't calculate the factorial of negative number.");
        if(n>16) throw new IllegalArgumentException("Result of factorial overflows 'int' type.");
        int fac = 1;
        for (int i=n; i>0; i--){
            fac *= i;
        }
        return fac;
    }
}
