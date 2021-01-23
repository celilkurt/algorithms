package leetCode.topInterviewQuestions;


//Problem URL
//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/567/

import java.util.ArrayList;

public class MoveZeroes {

    public static void main(String[] args){


        
    }

    //0 dan farklı bütün elemanları bir list'e at sonra list'teki herbir elemanı baştan itibaren diziye ekle
    //nums dizisinin kalan kısmını 0 la doldur.
    public static void moveZeroes(int[] nums) {
        ArrayList<Integer> numList = new ArrayList<>();

        for(int num: nums)
            if(num != 0)
                numList.add(num);

        int meter = 0;
        for(int num: numList)
            nums[meter++] = num;

        while(meter < nums.length)
            nums[meter++] = 0;

    }
}
