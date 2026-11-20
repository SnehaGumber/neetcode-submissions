class Solution {
    public int solve(int amount, int[] dp, int[] coins){
        if(amount == 0) return 0;
        if(amount < 0) return -1;
        if(dp[amount] != Integer.MAX_VALUE) return dp[amount];

        int mini = Integer.MAX_VALUE;

        for(int i=0; i<coins.length; i++){
            if(coins[i] <= amount){
                int res = solve(amount-coins[i], dp, coins);
                if(res != -1) mini = Math.min(mini, 1+res);
            }
        }
        
        if(mini == Integer.MAX_VALUE) dp[amount] = -1;
        else dp[amount] = mini;
        return dp[amount];
    }
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;

        int[] dp = new int[amount+1];
        Arrays.fill(dp, Integer.MAX_VALUE);

        return solve(amount, dp, coins);
    }
}
