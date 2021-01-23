package leetCode.topInterviewQuestions;

import java.util.ArrayList;
import java.util.HashSet;

//Given a non-empty array of integers, every element appears twice except for one. Find that single one.
public class SingleNumber {

    public static void main(String[] args){

        System.out.println(singleNumber(new int[]{156,3,3,6,1,2,1,2,156}));


    }

    //Her bir sayı için şu işlemler tekrarlanır:
    //sayı set'e eklenebiliyorsa şimdilik tekil bir sayıdır ve bundan dolayı uniqueList'e atanır.
    //sayı eğer zaten set'te varsa uniqueList'ten silinir.
    //Böylece uniqueList'te kalan son sayı tek olan sayıdır.
    //Karmaşıklığı lineer zamanlıdır. O(n) yani.
    public static int singleNumber(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        ArrayList<Integer> uniqueList = new ArrayList<>();

        for(int num: nums)
            if(set.add(num))
                uniqueList.add(num);
            else
                uniqueList.remove(new Integer(num));

        return uniqueList.get(0);

    }
}
