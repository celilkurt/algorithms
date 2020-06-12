package leetCode.topInterviewQuestions;

import java.util.ArrayList;


//Given an array A of non-negative integers, return an array
// consisting of all the even elements of A, followed by all the odd elements of A.
public class SortArrayWithParity {

    public int[] sortArrayByParity(int[] A) {

        ArrayList<Integer> evens = new ArrayList<>();
        ArrayList<Integer> odds = new ArrayList<>();

        for(int num: A)
            if(num%2==0)
                evens.add(num);
            else
                odds.add(num);

        int e = 0, o = 0;

        for(int i = 0; i < A.length; i++)
            if(e < evens.size())
                A[i] = evens.get(e++);
            else
                A[i] = odds.get(o++);

        return A;


    }
}
