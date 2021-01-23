package geeksforgeeks.interview.math;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

//n ve n'e kadar olan sayıların tam olarak bölebildiği en küçük sayı.
public class SmallestDivisibleNumber {

    public static void main(String[] args){

        //System.out.println(getSmallestDivNum(3));
        System.out.println(getSmallestDivNum(9));
        System.out.println(getSmallestDivNum(12));

    }

    public static long getSmallestDivNum(int n){

        long num = 1;

        if(n < 2)
            return num;

        HashMap<Integer,Integer> factors = new HashMap<>();

        for(int i = 2; i <= n; i++){

            if(isPrime(i)){
                factors.put(i,1);
            }else{
                int temp = i;
                for(int factor: factors.keySet()){
                    int count = 0;
                    while(temp%factor == 0){
                        count++;
                        temp /= factor;
                    }

                    if(factors.get(factor) < count)
                        factors.put(factor,count);

                    if(temp <= 1)
                        break;
                }

                if(temp > 1)
                    factors.put(temp,1);

            }
        }

        for(Integer key: factors.keySet()){
            int count = factors.get(key);
            while(count-- > 0)
                num *= key;
        }

        return num;

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


}
