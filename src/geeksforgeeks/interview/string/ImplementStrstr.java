package geeksforgeeks.interview.string;

public class ImplementStrstr {

    public static void main(String[] args){

        System.out.println(strstr("abcdabcdadcg","adcg"));

    }

    public static int strstr(String str, String target)
    {

        for(int i = 0; i < str.length()-target.length()+1;i++){

            if(str.charAt(i) == target.charAt(0)){

                int count = 1;
                for(int j = 1; j < target.length(); j++){

                    if(target.charAt(j) == str.charAt(i+j))
                        count++;
                    else
                        break;
                }

                if(count == target.length())
                    return i;

            }
        }

        return -1;
    }
}
