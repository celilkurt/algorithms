package main.leetCode.arrays;

import java.util.Arrays;

public class DuplicateZeros {

    // [1,0,2,3,0,4,5,0]
    // [1,0,0,2,3,0,0,4]


    public static void main(String[] args) {
        int[] arr = {8,4,5,0,0,0,0,7};

        duplicateZeros(arr);

        System.out.println(Arrays.toString(arr));
    }


    public static void duplicateZeros(int[] arr) {

        int len = arr.length;
        int[] newArr = new int[len];
        int j = 0;

        for (int i = 0; i < len; i++) {

            if (arr[j] == 0) {
                newArr[i] = 0;
                if (i+1 < len) {
                    i++;
                    newArr[i] = 0;
                }
            } else {
                newArr[i] = arr[j];
            }

            j++;
        }
        System.arraycopy(newArr,0,arr,0,newArr.length);
    }
}
