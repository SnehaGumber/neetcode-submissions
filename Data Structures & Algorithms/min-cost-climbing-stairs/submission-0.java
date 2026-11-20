class Solution {
    public int solve(int i, int n, int[] dp, int[] cost){
        if(i >= n) return 0;

        if(dp[i] != -1) return dp[i];

        dp[i] = cost[i] + Math.min(solve(i+1, n, dp, cost), solve(i+2, n, dp, cost));

        return dp[i];
    }
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;

        int[] dp = new int[n+1];

        Arrays.fill(dp, -1);

        return Math.min(solve(0, n, dp, cost), solve(1, n, dp, cost));
    }
}
