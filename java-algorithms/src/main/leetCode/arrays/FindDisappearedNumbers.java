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
        int cursor = 0;

        for (int i = 1; i <= len; i++) {

            if (cursor < len) {

                if (nums[cursor] != i) {

                    if (nums[cursor] > i) {
                        numsNotAppear.add(i);
                        cursor--;
                    }
                }
                cursor++;

            } else {
                numsNotAppear.add(i);
            }
        }


        return numsNotAppear;
    }
}
