package geeksforgeeks.interview.arrays;

public class KadanesAlgorithm {

    public static void main(String[] args){

        System.out.println(maxSubarraySum(new int[]{1,2,3,-2,5},5));
        System.out.println(maxSubarraySum(new int[]{-1,-2,-3,-4},4));


    }

    static int maxSubarraySum(int arr[], int n){

        int[] sums = new int[n];
        sums[0] = arr[0];

        for(int i = 1; i < n; i++)
            if(sums[i-1]+arr[i] > arr[i])
                sums[i] = sums[i-1] + arr[i];
            else
                sums[i] = arr[i];

        int max = sums[0];

        for(int num:sums)
            if(num > max)
                max = num;

        return max;


    }



}
