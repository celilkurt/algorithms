package main.leetCode.topInterviewQuestions;

public class RomanToInteger {

    public static void main(String[] args){

        String input = "MCMXCIV";
        System.out.println("Input: " + input +
                "\nOutput: " + romanToInt(input));


    }


    public static int romanToInt(String s) {

        char pre = ' ';
        int sum = 0;
        for(int i = s.length()-1; i >= 0; i--){

            switch(s.charAt(i)){

                case 'I':
                    if(pre == 'V' || pre == 'X')
                        sum--;
                    else
                        sum++;
                    pre = ' ';
                    break;
                case 'V':
                    pre = 'V';
                    sum += 5;
                    break;
                case 'X':
                    if(pre == 'C' || pre == 'L'){
                        pre = ' ';
                        sum -= 10;
                    }else{
                        pre = 'X';
                        sum += 10;
                    }
                    break;
                case 'L':
                    pre = 'L';
                    sum += 50;
                    break;
                case 'C':
                    if(pre == 'D' || pre == 'M'){
                        pre = ' ';
                        sum -= 100;
                    }else{
                        pre = 'C';
                        sum += 100;
                    }
                    break;
                case 'D':
                    pre = 'D';
                    sum += 500;
                    break;
                case 'M':
                    pre = 'M';
                    sum += 1000;
                    break;

            }
        }

        return sum;
    }

}
