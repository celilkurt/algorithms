package geeksforgeeks.interview.stack;

import java.util.Stack;

public class ReverseAStringUsingStack {

    public void reverse(String str){

        Stack<Character> stack = new Stack<>();
        for(char c: str.toCharArray())
            stack.push(c);


        str = "";

        while(!stack.empty())
            str += stack.pop();

        System.out.println(str);


    }


}
