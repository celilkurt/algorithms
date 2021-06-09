package main.leetCode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDisappearedNumbers {

    public static void main(String[] args) {

    }

    public List<Integer> findDisapearedNumbers(int[] nums) {

        Arrays.sort(nums);

        int len = nums.length;
        List<Integer> numsNotAppear = new ArrayList<>();
        boolean[] isAppear = new boolean[len+1];

        for (int num: nums) {
            isAppear[num] = true;
        }

        for (int i = 1; i <= len; i++) {

            if (!isAppear[i]) {
                numsNotAppear.add(i);
            }
        }


        return numsNotAppear;
    }
}
