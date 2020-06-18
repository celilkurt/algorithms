package leetCode.topInterviewQuestions;

import java.util.HashMap;


//Given a paragraph and a list of banned words, return the most frequent word that
//is not in the list of banned words.It is guaranteed there is at least one word that
// isn't banned and that the answer is unique.
public class MostCommonWord {


    public static void main(String[] args){

        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = {"hit"};

        System.out.println(mostCommonWord(paragraph,banned));

    }



    public static String mostCommonWord(String paragraph, String[] banned) {

        HashMap<String,Integer> map = new HashMap<String,Integer>();

        String[] words = paragraph.split("\\W+");

        for(String word: words)
            if(!isBanned(word,banned)){
                String lowerWord = word.toLowerCase();
                if(map.containsKey(lowerWord))
                    map.put(lowerWord,map.get(lowerWord)+1);
                else
                    map.put(lowerWord,1);

            }

        String max = "";
        for(String word: words){
            String lowerWord = word.toLowerCase();
            if(!isBanned(lowerWord,banned)){
                max = lowerWord;
                break;
            }
        }


        for(String key: map.keySet())
            if(map.get(max) < map.get(key))
                max = key;


        return max;

    }

    public static boolean isBanned(String word, String[] banned){


        for(String str: banned)
            if(word.equals(str))
                return true;

        return false;

    }
}
