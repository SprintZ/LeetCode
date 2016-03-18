public class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0 || prices.length == 1) {
            return 0;
        }
        int dp[] = new int[prices.length];
        dp[0] = 0;
        for(int i=1; i<prices.length; i++) {
            dp[i] = Math.max(0, dp[i-1]+prices[i]-prices[i-1]);
        }
        int max = dp[0];
        int day = 0;
        for(int i=1; i<prices.length; i++) {
            if(dp[i] >= max) {
                day = i;
                max = dp[i];
            }
        }
        int min = 0;
        for(int i=0; i<i; i++) {
            if(dp[i] < min) {
                min = dp[i];
            }
        }
        return max - min;
    }
}