package leetCode.topInterviewQuestions;


//Given an integer, write a function to determine if it is a power of three.
public class PowerOfThree {

    public static void main(String[] args){

        int t = 3;
        int num = 82;
        System.out.println("Is " + num + " power of " + t + ": " + isPowerOfT(t,num));

    }


    public static boolean isPowerOfT(int t,int num) {

        if(num == 0)
            return false;

        while(num%t == 0){
            num = num/t;
        }

        return num == 1;

    }
}
