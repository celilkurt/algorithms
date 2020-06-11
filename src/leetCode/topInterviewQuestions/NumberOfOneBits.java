package leetCode.topInterviewQuestions;


public class NumberOfOneBits {

    public static void main(String[] args){

        int n = -3;
        System.out.println("Input: " + n + " or " + Integer.toBinaryString(n) +
                "\nOutput: " + hammingWeight(n));

    }

    public static int hammingWeight(int n) {
        String num = Integer.toBinaryString(n);

        int count = 0;
        for(char c: num.toCharArray())
            if(c == '1')
                count++;

        return count;


    }
}
