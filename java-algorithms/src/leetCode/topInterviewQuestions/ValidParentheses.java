package leetCode.topInterviewQuestions;

import java.util.ArrayList;

//Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
public class ValidParentheses {

    public static void main(String[] args){

        String s = "()[]{}";
        System.out.println(isValid(s));

    }


    public static boolean isValid(String s) {

        ArrayList<Character> parList = new ArrayList<>();

        for(char c: s.toCharArray())
            switch(c){

                case '(':
                    parList.add(c);
                    break;
                case ')':
                    if(parList.isEmpty())
                        return false;

                    if(parList.get(parList.size()-1) == '(')
                        parList.remove(parList.size()-1);
                    else
                        parList.add(c);
                    break;
                case '[':
                    parList.add(c);
                    break;
                case ']':
                    if(parList.isEmpty())
                        return false;

                    if(parList.get(parList.size()-1) == '[')
                        parList.remove(parList.size()-1);
                    else
                        parList.add(c);
                    break;
                case '{':
                    parList.add(c);
                    break;
                case '}':
                    if(parList.isEmpty())
                        return false;

                    if(parList.get(parList.size()-1) == '{')
                        parList.remove(parList.size()-1);
                    else
                        parList.add(c);
                    break;
            }

        return parList.isEmpty();
    }
}
