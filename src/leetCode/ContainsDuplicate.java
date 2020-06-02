package leetCode;

//Problem URL
//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/578/

import java.util.HashSet;

public class ContainsDuplicate {

    public static void main(String[] args){

        System.out.println(containsDuplicate(new int[]{1,3,65,3,4,7,4,9}));
        System.out.println(containsDuplicate(new int[]{1,3,65,4,7,78,9}));

    }

    //if contains duplicate num return true;
    public static boolean containsDuplicate(int[] nums) {

        HashSet<Integer> numSet = new HashSet<>();
        for(int n: nums)
            numSet.add(n);

        return nums.length != numSet.size();


    }
}


