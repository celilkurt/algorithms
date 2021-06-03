package main.leetCode;

public class BestTimeToBuyAndSellStock2 {


    public static void main(String[] args) {

        System.out.println(maxProfit(new int[]{7,6,4,3,1}));

    }

    public static int maxProfit(int[] prices) {

        int totalProfit = 0;
        int min = prices[0];

        for (int price : prices) {

            if (min < price) {
                totalProfit += price - min;
            }

            min = price;
        }

        return totalProfit;
    }
}
