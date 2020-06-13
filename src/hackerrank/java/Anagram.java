package hackerrank.java;
//Case sensitive anagram test
public class Anagram {

    public static void main(String[] args){

        System.out.println(isAnagram("alalalr","aalarll"));

    }


    static boolean isAnagram(String a, String b) {

        boolean key = true;

        if(a.length() == b.length()){


            char[] arrA = a.toCharArray();
            char[] arrB = b.toCharArray();

            for(int i = 0; i < arrA.length; i++){
                //for Case sensitivity


                arrA[i] = Character.toLowerCase(arrA[i]);
                arrB[i] = Character.toLowerCase(arrB[i]);


            }

            for(int i = 0; i < arrA.length; i++){
                int max = i;
                for(int j = i+1; j < arrA.length; j++)
                    if(arrA[max] < arrA[j])
                        max = j;

                if(i != max){

                    char temp = arrA[i];
                    arrA[i] = arrA[max];
                    arrA[max] = temp;

                }
            }

            for(int i = 0; i < arrB.length; i++){
                int max = i;
                for(int j = i+1; j < arrB.length; j++)
                    if(arrB[max] < arrB[j])
                        max = j;

                if(i != max){

                    char temp = arrB[i];
                    arrB[i] = arrB[max];
                    arrB[max] = temp;

                }

            }

            for(int i = 0; i < arrA.length; i++)
                if(arrA[i] != arrB[i])
                    return false;

            return true;

        }else
            return false;


    }
}
