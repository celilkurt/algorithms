package main.codlity;

public class CountDiv {

    public static void main(String[] args) {
        System.out.println(solution(48, 126, 4));
    }

    public static int solution(int A, int B, int K) {

        int top = Math.floorDiv(B, K);
        int bottom = (int) Math.ceil((double) A / (double) K);

        return top - bottom + 1;
    }
}
