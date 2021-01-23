package geeksforgeeks.interview.string;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args){

        System.out.println(isAnagram("b","d"));
        System.out.println(isAnagram2("geeksforgeeks","forgeeksgeeks"));

    }

    //this is faster than anagram2
    public static boolean isAnagram(String s1,String s2)
    {

        if(s1.length() != s2.length())
            return false;

        int[] s1Counts = new int[26];
        int[] s2Counts = new int[26];

        for(int i = 0; i < s1.length(); i++){

            s1Counts[s1.charAt(i)-97]++;
            s2Counts[s2.charAt(i)-97]++;

        }

        for(int i = 0; i < s1Counts.length; i++)
            if(s1Counts[i] != s2Counts[i])
                return false;


        return true;

    }

    public static boolean isAnagram2(String s1,String s2)
    {

        if(s1.length() != s2.length())
            return false;

        char[] s1Arr = s1.toCharArray();
        char[] s2Arr = s2.toCharArray();

        Arrays.sort(s1Arr);
        Arrays.sort(s2Arr);

        for(int i = 0; i < s1Arr.length; i++)
            if(s1Arr[i] != s2Arr[i])
                return false;


        return true;

    }
}
