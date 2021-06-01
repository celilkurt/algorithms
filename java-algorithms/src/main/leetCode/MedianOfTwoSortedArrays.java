package main.leetCode;

public class MedianOfTwoSortedArrays {

    public static void main(String[] args) {

        System.out.println(findMedianSortedArrays(new int[]{2}, new int[]{}));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int len = nums1.length + nums2.length;
        int iter1 = 0, iter2 = 0;

        int[] newArr = new int[len/2+1];


        for (int i  = 0; i < len/2+1; i++ ) {

            if (iter1 < nums1.length && iter2 < nums2.length) {
                if (nums1[iter1] > nums2[iter2]) {
                    newArr[i] = nums2[iter2];
                    iter2++;
                } else {
                    newArr[i] = nums1[iter1];
                    iter1++;
                }
            } else if (iter1 < nums1.length) {
                newArr[i] = nums1[iter1];
                iter1++;
            } else {
                newArr[i] = nums2[iter2];
                iter2++;
            }

        }

        if (len%2 == 0) {
            return (newArr[newArr.length-1] + newArr[newArr.length-2]) / (double)2;
        } else {
            return newArr[newArr.length-1];
        }

    }


}
