

package algorithms;

import java.util.ArrayList;
import java.util.Arrays;


public class PrimeNumbers {
    
    public static ArrayList<Integer> findPrimeFactors(int n){
        
        ArrayList<Integer> factorList = new ArrayList<>();

        
        int sqrt = (int)Math.sqrt(n)+1;
        for(int i = 2; i < sqrt && n > 1; i++){
            
            if(isPrime(i)){
                
                while(n%i == 0){
                    factorList.add(i);
                    n = (int)n/i;
                }
            }
            
            
        }
        
        if(n < 1)
            factorList.add(n);
        
        return factorList;
    }
    
    public static boolean isPrime(int n){
        
        if(n <= 1) return false;
        if(n <= 3) return true;

        if(n%2 == 0 || n%3 == 0)
            return false;


        int sqrt = (int)Math.sqrt(n)+1;
        for(int i = 5; i < sqrt; i += 6)
            if(n%i == 0 || n%(i+2) == 0)
                return false;
        
        return true;
    }
    
    /*
        *In mathematics, the Sieve of Eratosthenes is a simple and ingenious
        *ancient algorithm for finding all prime numbers up to any given limit.
    
    */
    public static ArrayList<Integer> sieveOfEratos(int n){
        
        ArrayList<Integer> list = new ArrayList<>();
        boolean[] numArr = new boolean[n+1];
        Arrays.fill(numArr, true);
        numArr[0] = false;
        numArr[1] = false;
        
        
        for(int i = 2; i < n+1; i++){
            
            if(numArr[i]){
                for(int j = 0; j < (int)(n)/i+1; j++)
                    numArr[j*i] = false;
                
                list.add(i);
            }
                
        }
        
        return list;
    }


    static void printPrime(int... numbers){

        for(int num: numbers){
            if(isPrime(num))
                System.out.print(num + " ");

        }System.out.println("");

    }

    //Generic sample: inputArray can be a string array or int array
    public static < E > void printArray( E[] inputArray ){

        for(E element: inputArray)
            System.out.println(element);
    }
    
    
    
    
    
    
}
