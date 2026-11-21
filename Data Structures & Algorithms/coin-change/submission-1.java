class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;

        int[] dp = new int[amount + 1];

        for(int i=1; i<=amount; i++){
            dp[i] = Integer.MAX_VALUE;
        }

        for(int i=0; i<n; i++){
            for(int target=1; target<=amount; target++){
                if(coins[i] <= target){
                    if(dp[target-coins[i]] != Integer.MAX_VALUE){
                        dp[target] = Math.min(dp[target], 1+dp[target-coins[i]]);
                    }
                }
            }
        }

        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }
}
