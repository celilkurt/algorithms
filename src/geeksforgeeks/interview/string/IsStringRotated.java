package geeksforgeeks.interview.string;


//Given two strings s1 and s2. The task is to check if
// s2 is a rotated version of the string s1.
public class IsStringRotated {

    public static void main(String[] args){

        String[] arr = {"geeksforgeeks",
                "forgeeksgeeks",
                "mightandmagic",
                "andmagicmigth",
                "mushroomkingdom",
                "itsamemario",
                "geekofgeeks",
                "geeksgeekof"};

        for(int i = 0; i < arr.length/2; i++)
            System.out.println(areRotations(arr[i*2],arr[i*2+1]));

    }

    public static boolean areRotations(String s, String x )
    {
        if(s.length() != x.length())
            return false;

        for(int i = 0; i < s.length(); i++){

            if(x.charAt(0) == s.charAt(i)){
                int count = 1;
                for(int j = 1; j < x.length(); j++)
                    if(x.charAt(j) != s.charAt((j+i)%s.length()))
                        break;
                    else
                        count++;

                if(count == x.length())
                    return true;
            }
        }

        return false;
    }
}
