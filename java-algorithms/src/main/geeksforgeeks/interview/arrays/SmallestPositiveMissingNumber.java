package geeksforgeeks.interview.arrays;

import java.util.Arrays;

public class SmallestPositiveMissingNumber {

    public static void main(String[] args){

        System.out.println(findMissing(new int[]{1,2,3,4,5},5));

    }


    static int findMissing(int arr[], int size)
    {
        boolean[] isExist = new boolean[size+1];
        Arrays.fill(isExist,false);

        for(int num: arr)
            if(num <= size && num > 0)
                isExist[num] = true;

        for(int i = 1; i < size+1; i++)
            if(!isExist[i])
                return i;


        return size+1;

    }

}
