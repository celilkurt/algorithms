package geeksforgeeks.interview.string;

import java.util.Arrays;

public class MissingCharactersInPanagram {


    public static String missingPanagram(String str)
    {
        boolean[] arr = new boolean[26];
        Arrays.fill(arr,false);


        for(char c:str.toCharArray())
            arr[Character.toLowerCase(c)-97] = true;

        String misChars = "";
        for(int i = 0; i < 26; i++)
            if(!arr[i])
                misChars += (char)(i+97);

        return misChars;

    }
}
