package leetCode.topInterviewQuestions;

import java.util.ArrayList;

//Given a non-empty array of integers, return the third maximum number in
// this array. If it does not exist, return the maximum number. The time complexity must be in O(n).
public class ThirdMaximumNumber {


    public static void main(String[] args){

        int[] arr = {3, 2, 1,0,1,9};
        System.out.println(thirdMax(arr));

    }



    //dizinin en küçük elemanını bul.
    //lineer searce ile en büyük sayıyı bul.
    //bulunan en büyük sayıyı eğer maxListte zaten yoksa ekle.

    public static int thirdMax(int[] nums) {

        ArrayList<Integer> maxList = new ArrayList<>();

        int min = nums[0];
        for(int num: nums)
            if(num < min)
                min = num;


        for(int j = 0; j < 3; j++){
            int max = min;

            for(int i = 0; i < nums.length; i++)
                if(nums[i] > max)
                    if(!maxList.contains(nums[i]))
                        max = nums[i];

            if(!maxList.contains(max))
                maxList.add(max);
        }

        if(maxList.size() == 3)
            return maxList.get(2);
        else
            return maxList.get(0);


    }
}
