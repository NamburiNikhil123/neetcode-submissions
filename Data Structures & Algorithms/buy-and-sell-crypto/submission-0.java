class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int min = Integer.MAX_VALUE;

        for(int price : prices){
            min = Math.min(min, price);
            int profit = price - min;
            maxProfit = Math.max(profit, maxProfit);
        }
        return maxProfit;
    }
}
