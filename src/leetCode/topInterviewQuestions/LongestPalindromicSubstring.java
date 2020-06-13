package leetCode.topInterviewQuestions;


//Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
public class LongestPalindromicSubstring {

    public static void main(String[] args){

        System.out.println(longestPalindrome("asdbababasdqwe"));

    }

    public static String longestPalindrome(String s) {

        for(int i = s.length(); i > 0; i--){

            for(int j = 0; j+i <= s.length(); j++){

                String str = s.substring(j,i+j);
                if(isPalindrome(str))
                    return str;

            }
        }

        return "";
    }

    public static boolean isPalindrome(String s){

        for(int i = 0; i < s.length()/2; i++){

            if(s.charAt(i) != s.charAt(s.length()-i-1))
                return false;

        }

        return true;

    }

}

