package leetCode.topInterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static void main(String[] args){

        int n = 30;
        for(String str: fizzBuzz(n))
            System.out.println(str);

    }


    public static List<String> fizzBuzz(int n) {

        List<String> list = new ArrayList<>();
        for(int i = 1; i <= n; i++)
            list.add(String.valueOf(i));

        for(int i = 1; i <= n/3; i++)
            list.set(i*3-1,"Fizz");

        for(int i = 1; i <= n/5; i++)
            list.set(i*5-1,"Buzz");

        for(int i = 1; i <= n/15; i++)
            list.set(i*15-1,"FizzBuzz");

        return list;
    }
}
