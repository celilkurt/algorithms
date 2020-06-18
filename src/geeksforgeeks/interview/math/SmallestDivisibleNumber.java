package geeksforgeeks.interview.math;


import java.util.HashSet;
import java.util.Iterator;

//n ve n'e kadar olan sayıların tam olarak bölebildiği en küçük sayı.
public class SmallestDivisibleNumber {

    public static long getSmallestDivNum(int n){

        long num = 1;

        if(n < 2)
            return num;

        HashSet<Integer> factors = new HashSet<>();
        factors.add(2);

        for(int i = 2; i <= n; i++){

            for(int j = 3; j <= i; j += 2)
                if(i%j == 0)
                    factors.add(j);

        }

        Iterator<Integer> iterator = factors.iterator();

        while(iterator.hasNext()){
            num *= (long)iterator.next();
        }


        return num;

    }


}
