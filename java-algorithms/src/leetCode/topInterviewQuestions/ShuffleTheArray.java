package leetCode.topInterviewQuestions;


import java.util.Arrays;

//Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
//
//Return the array in the form [x1,y1,x2,y2,...,xn,yn].
public class ShuffleTheArray {

    public static void main(String[] args){

        int[] arr = {2,5,1,3,4,7};

        System.out.println(Arrays.toString(shuffle(arr,arr.length/2)));

    }


    public static int[] shuffle(int[] nums, int n) {

        int[] arr = new int[n*2];
        int meter = 0;

        for(int i = 0; i < n; i++){
            arr[meter++] = nums[i];
            arr[meter++] = nums[i+n];
        }

        return arr;
    }
}
