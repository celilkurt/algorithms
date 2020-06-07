package leetCode;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/881/

public class FirstUniqueCharacter {


    public static void main(String[] args){

        System.out.println("for 'loveleetcode': " + firstUniqChar("loveleetcode"));
    }

    //counts dizisinde her bir karakterin adedi tutuluyor daha sayısı 1 olan ilk karakterin stringdeki index'i döndürülüyor.
    public static int firstUniqChar(String s) {

        int[] counts = new int[26];

        for(char c: s.toCharArray())
            counts[(int)c-97] += 1;

        for(int i = 0; i < s.length(); i++)
            if(counts[(int)s.charAt(i)-97] == 1)
                return i;

        return -1;

    }
}
