package main.leetCode.montlyChallenges.juneChallenge;

import java.util.Stack;

public class RemoveAllAdjacentDuplicates {
    // in a string

    /**
     * input: azxxzy
     * output: ay
     *
     * input: abbaca
     * output: ca
     * */


    public static void main(String[] args) {
        System.out.println(removeDuplicates("azxxzy"));
    }


    public static String removeDuplicates(String s) {

        if (s.isEmpty()) return "";
        Stack<Character> charStack = new Stack<>();
        char[] sArr = s.toCharArray();

        for (char c: sArr) {

            if (charStack.isEmpty()) {
                charStack.push(c);
            } else if (charStack.peek() == c){
                charStack.pop();
            } else {
                charStack.push(c);
            }
        }

        StringBuilder str = new StringBuilder(charStack.size());
        for (char c: charStack) str.append(c);

        return str.toString();
    }


}
