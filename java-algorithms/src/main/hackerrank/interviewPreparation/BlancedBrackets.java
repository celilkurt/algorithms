package main.hackerrank.interviewPreparation;


import java.util.Stack;

public class BlancedBrackets {


    static String isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        for(char c: s.toCharArray()) {
            switch(c){

        case '(':
                case '{':
                case '[':
                    stack.push(c);
            break;
        case ')':
            if(stack.isEmpty())
                return "NO";
            if(stack.peek() == '(')
                stack.pop();
            else
                stack.push(c);
            break;
                case ']':
            if(stack.isEmpty())
                return "NO";
            if(stack.peek() == '[')
                stack.pop();
            else
                stack.push(c);
            break;
                case '}':
            if(stack.isEmpty())
                return "NO";

            if(stack.peek() == '{')
                stack.pop();
            else
                stack.push(c);
            break;
    }
        }

        if (stack.isEmpty()) return "YES";
        else return "NO";
}


}
