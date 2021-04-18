package main.hiringChallenges.trendHiring;

public class FindDuplicatedChar {


    public static void main(String[] args) {

        System.out.println(solution("@3541@kdslfo"));
    }

    /**
     * example
     * input: 'alksormtjfcpxa'
     * output: a
     * */

    public static char solution(String S) {

        boolean[] has = new boolean[256];

        for (char c: S.toCharArray()) {
            if (has[c]) return c;
            has[c] = true;
        }

        return ' ';
    }

}
