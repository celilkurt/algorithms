package leetCode;

import java.util.Iterator;
import java.util.TreeSet;

//Problem URL
// https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/727/

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args){

        int[] nums = {1,3,4,4,4,6,6,7,7,8,8};
        int n = removeDuplicates(nums);

        int meter = 0;
        while(meter < n){
            System.out.print(nums[meter++] + " ");
        }

    }


    public static int removeDuplicates(int[] nums) {

        TreeSet<Integer> numSet = new TreeSet<>();

        for(int num:nums)
            numSet.add(num);

        Iterator value = numSet.iterator();
        int i = 0;
        while(value.hasNext())
            nums[i++] = (int)value.next();



        return numSet.size();
    }
}


