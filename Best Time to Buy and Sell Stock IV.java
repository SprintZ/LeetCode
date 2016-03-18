public class Solution {
    public int maxProfit(int k, int[] prices) {
        if(prices.length == 0 || prices.length == 1) {
            return 0;
        }
        if(k >= prices.length) {
            return simple(prices);
        }
        int local[] = new int[k+1];
        int global[] = new int[k+1];
        
        for(int i=1; i<prices.length; i++) {
            int diff = prices[i]-prices[i-1];
            for(int j=k; j>0; j--) {
                local[j] = Math.max(global[j-1]+Math.max(diff, 0), local[j]+diff);
                global[j] = Math.max(local[j], global[j]);
            }
        }
        return global[k];
        
    }
    
    private int simple(int[] prices) {
        // TODO Auto-generated method stub
        int profit = 0;
        for(int i=1; i<prices.length; i++) {
            if(prices[i]>prices[i-1]) {
                profit = profit + prices[i] - prices[i-1];
            }
        }
        return profit;
    }
}