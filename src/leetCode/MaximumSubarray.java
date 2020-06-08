package leetCode;


//Given an integer array nums, find the contiguous
// subarray (containing at least one number) which has the largest sum and return its sum.
public class MaximumSubarray {

    public static void main(String[] args){

        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));

    }

    ////Kadane's Algorithm to Maximum Sum Subarray Problem
    //maxSums dizisinde i. indexteki eleman nums dizisnde i. elemanın dahil olduğu en yüksek toplamı tutar.
    public static int maxSubArray(int[] nums) {

        int[] maxSums = new int[nums.length];
        maxSums[0] = nums[0];


        for(int i = 1; i < nums.length; i++)
            if(maxSums[i-1] + nums[i] > nums[i])
                maxSums[i] = maxSums[i-1] + nums[i];
            else
                maxSums[i] = nums[i];

        int max = maxSums[0];
        for(int num:maxSums)
            if(num > max)
                max = num;

        return max;

    }

}
