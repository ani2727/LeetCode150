//Problem Link: https://rb.gy/z4p2dw

//code
class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount == 0) return 0;
        int dp[] = new int[amount+1];

        for(int i = 1 ; i <= amount ; i ++) {
            dp[i] = Integer.MAX_VALUE;

            for(int coin : coins) {
                if(coin <= i) {
                    dp[i] = Math.min(dp[i],1+dp[i-coin]);
                }
            }
        }

        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }
}
