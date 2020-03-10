
package algorithms;

import java.math.BigInteger;
import java.util.ArrayList;


public class Fibonacci {
    
    
    //Find n th fibonacci number
    public static BigInteger findNthFibonacci(int n){
        
        ArrayList<BigInteger> numList = new ArrayList<>();
        
        numList.add(BigInteger.ONE);
        numList.add(BigInteger.ONE);
        
        if(n == 1 || n == 2){
            return BigInteger.ONE;
        }else if(n > 2){
            
            for(int i = 2; i < n; i++){
                numList.add(numList.get(i-1).add(numList.get(i-2)));
            }
            
            return numList.get(numList.size()-1);
        }
        
        return BigInteger.ZERO;
        
        
    }
    
    
    
}
