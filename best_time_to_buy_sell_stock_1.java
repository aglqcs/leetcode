package leetcode;

public class best_time_to_buy_sell_stock_1 {
	public int maxProfit(int[] prices) {
        if(prices.length == 0 || prices.length == 1 || prices == null) return 0;
        int min = prices[0];
        int max = 0;
        for(int i = 1;i < prices.length;i ++){
            max = (prices[i] - min) > max ? prices[i] - min : max;
            min = prices[i] < min ? prices[i] : min;
        }
        return max;
    }
}
