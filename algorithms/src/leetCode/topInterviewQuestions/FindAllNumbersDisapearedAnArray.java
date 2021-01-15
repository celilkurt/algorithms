package leetCode.topInterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllNumbersDisapearedAnArray {

    public static void main(String[] args){

        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr).toString());

    }



    public static List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length-1; i++)
            if(nums[i+1] - nums[i] != 1)
                for(int j = nums[i]+1; j < nums[i+1];j++)
                    list.add(j);


        return list;


    }

}
