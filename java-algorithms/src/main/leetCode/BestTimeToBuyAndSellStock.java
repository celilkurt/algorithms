package main.leetCode;

public class BestTimeToBuyAndSellStock {


    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int min = Integer.MAX_VALUE;
        int len = prices.length;

        for (int i = 0; i < len; i++) {

            min = Math.min(min, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - min);

        }

        return maxProfit;
    }

}
