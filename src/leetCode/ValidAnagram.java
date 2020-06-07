package leetCode;


//https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/882/
public class ValidAnagram {

    public static void main(String[] args){

        System.out.println("for 'anagram','anaggram':" + isAnagram("anagram","anaggram"));


    }

    //İki string için içerdikleri her bir karakterin adedi hesaplanıyor ve karşılaştırma yapılıyor eşit olmadıkları
    //bir durum varsa false döndürülüyor.
    public static boolean isAnagram(String s, String t) {

        if(s.length() != t.length())
            return false;

        int[] sCounts = new int[26];
        int[] tCounts = new int[26];


        for(int i = 0; i < s.length(); i++){
            sCounts[(int)s.charAt(i)-97] += 1;
            tCounts[(int)t.charAt(i)-97] += 1;
        }

        for(int i = 0; i < sCounts.length; i++)
            if(sCounts[i] != tCounts[i])
                return false;

        return true;

    }


}
