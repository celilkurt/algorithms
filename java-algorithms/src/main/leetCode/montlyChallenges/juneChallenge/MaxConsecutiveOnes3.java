package main.leetCode.montlyChallenges.juneChallenge;

import java.util.ArrayList;

public class MaxConsecutiveOnes3 {

    public static void main(String[] args) {

        int ans = longestOnes(new int[]{1,1,1,0,0,0,1,1,1,1,0}, 2);
        System.out.println(ans);
    }

    public static  int longestOnes(int[] nums, int k) {

        int max = 0;
        ArrayList<Integer> zerosIndexes = new ArrayList<>();

        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i] == 0) {
                zerosIndexes.add(i);
            }
        }

        if (zerosIndexes.size() <= k) return len;

        int onesCount;
        for (int i = 0; i < zerosIndexes.size()-k; i++) {
            onesCount = zerosIndexes.get(i+k) - zerosIndexes.get(i);
            if (onesCount > max) {
                max = onesCount;
            }
        }

        return max;
    }

}
