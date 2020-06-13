package leetCode.topInterviewQuestions;

public class ScrambleString {

    public static void main(String[] args){

        System.out.println(scramble("great"));

    }

    public static String scramble(String s1){

        int length = s1.length();

        if(length > 2){

            String s = "";
            s += scramble(s1.substring(length/2,length));
            s += scramble(s1.substring(length/2));
            return s;

        }else if(length == 2){

            String s = "";
            s += s1.charAt(1);
            s += s1.charAt(0);
            return s;

        }else
            return s1;


    }
}
