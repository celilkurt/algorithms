package hackerrank.java.BigIntegerDecimal;

import java.math.BigDecimal;

public class BigDecimalSort {




    static void printSortedBigDecimal(String[] s){

        BigDecimal[] arr = new BigDecimal[s.length];

        for(int i = 0; i < s.length; i++){
            arr[i] = new BigDecimal(s[i]);
        }



        for(int i = 0; i < arr.length; i++){
            int maxI = i;

            for(int j = i+1; j < arr.length; j++)
                if(arr[maxI].compareTo(arr[j]) < 0)
                    maxI = j;

            if(maxI != i){
                BigDecimal temp = arr[maxI];
                arr[maxI] = arr[i];
                arr[i] = temp;

                String temp2 = s[i];
                s[i] = s[maxI];
                s[maxI] = temp2;
            }

        }
        //Output
        for(int i=0;i<s.length;i++)
        {
            System.out.println(s[i]);
        }


    }
}
