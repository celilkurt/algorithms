package leetCode.topInterviewQuestions;

//Given an array, rotate the array to the right by k steps, where k is non-negative.
public class RotateArray {

    public static void main(String[] args){

        int[] nums = {1,2,3,4,5,6,7};
        rotate(nums,3);
        for(int num: nums)
            System.out.print(num + " ");
    }

    public static void rotate(int[] nums, int k) {

        int[] clone = nums.clone();
        for(int i = 0; i < clone.length; i++)
            nums[(i+k)%nums.length] = clone[i];


    }
}
