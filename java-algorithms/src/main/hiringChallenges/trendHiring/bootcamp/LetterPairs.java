package main.hiringChallenges.trendHiring.bootcamp;

import java.util.Stack;

public class LetterPairs {

    public static void main(String[] args) {

        String result = solution("ABDBAC");
    }

    /***
     * Aşağıdaki belirtilen harf çiftlerinden birbirlerine komşu olanlar silinir
     * ve geriye kalan string döndürülür.
     *
     * A-B komşuluğu veya C-D komşuluğu
     *
     * Girdi: "DDACBBAA"
     * Çıktı: "DDAC"
     *
     * Girdi: "ABDBAC"
     * Çıktı: ""
     *
     * ***/
    public static String solution(String S){


        Stack<Character> stack = new Stack<>();

        char c;
        int len = S.length();
        for(int i = 0; i < len; i++){

            if(stack.isEmpty()){
                stack.push(S.charAt(i));
            }else{
                c = S.charAt(i);
                switch (c){
                    case 'A':
                        if(stack.peek() == 'B'){
                            stack.pop();
                        }else{
                            stack.push(c);
                        }
                        break;
                    case 'B':
                        if(stack.peek() == 'A'){
                            stack.pop();
                        }else{
                            stack.push(c);
                        }
                        break;
                    case 'C':
                        if(stack.peek() == 'D'){
                            stack.pop();
                        }else{
                            stack.push(c);
                        }
                        break;
                    case 'D':
                        if(stack.peek() == 'C'){
                            stack.pop();
                        }else{
                            stack.push(c);
                        }
                        break;
                }
            }
        }

        StringBuilder ansStr = new StringBuilder(stack.size());
        for (Character character : stack) {
            ansStr.append(character);
        }

        return ansStr.toString();
    }

}
