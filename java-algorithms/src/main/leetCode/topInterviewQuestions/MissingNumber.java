package leetCode.topInterviewQuestions;

import java.util.Arrays;

//Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
public class MissingNumber {

    public static void main(String[] args){

        int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println("Input: " + Arrays.toString(nums) +
                "\nOutput: " + missingNumber(nums));

    }

    public static int missingNumber(int[] nums) {
        boolean[] nums2 = new boolean[nums.length+1];
        Arrays.fill(nums2,true);

        for(int num: nums)
            nums2[num] = false;

        for(int i = 0; i < nums2.length; i++)
            if(nums2[i])
                return i;

        return 0;
    }
}
