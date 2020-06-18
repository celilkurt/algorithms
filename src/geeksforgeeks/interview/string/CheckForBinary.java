package geeksforgeeks.interview.string;


//return true if given number is binary
public class CheckForBinary {


    boolean isBinary(String str)
    {
        for(char c: str.toCharArray())
            if(c != '0' && c != '1')
                return false;

        return true;

    }


}
