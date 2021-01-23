package geeksforgeeks.interview.string;

//The task is to find the maximum occurring character in the string str.
public class MaximumOccuringCharacter {

    public static char getMaxOccuringChar(String line){

        int[] counts = new int[26];

        for(char c:line.toCharArray())
            counts[c-97]++;

        int max = 0;
        for(int i = 1; i < counts.length; i++)
            if(counts[max] < counts[i])
                max = i;

        return ((char)(max+97));

    }

}
