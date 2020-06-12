package leetCode.topInterviewQuestions;

import java.util.ArrayList;

public class CheckIfNAndItsDoubleExist {

    public static void main(String[] args){

        int[] arr = {7,1,14,11};
        System.out.println(checkIfExist(arr));

    }

    public static boolean checkIfExist(int[] arr) {

        ArrayList<Integer> list = new ArrayList<>();

        for(int num: arr){
            if(list.contains(num*2))
                return true;
            else if(num%2 == 0 && list.contains(num/2))
                return true;

            list.add(num);
        }

        return false;
    }
}
