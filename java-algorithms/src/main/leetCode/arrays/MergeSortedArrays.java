package main.leetCode.arrays;

import java.util.Arrays;

public class MergeSortedArrays {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        if (m == 0) System.arraycopy(nums2,0,nums1,0,nums2.length);
        if (n == 0) return;

        int len = nums1.length;
        int j = 0;

        for (int i = 0; i < len; i++) {

            if (i < m) {

                if (nums1[i] > nums2[j]) {
                    int tempNum = nums2[j];
                    nums2[j] = nums1[i];
                    nums1[i] = tempNum;

                    Arrays.sort(nums2);
                }

            } else {
                nums1[i] = nums2[j];
                j++;
            }

        }


    }
}
