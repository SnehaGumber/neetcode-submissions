class Solution {
    public int solve(int i, int[] dp, int n){
        if(i == n) return 1;
        if(i > n) return 0;
        if(dp[i] != -1) return dp[i];

        int oneStep = solve(i+1, dp, n);
        int twoStep = solve(i+2, dp, n);

        int ans = oneStep + twoStep;
        dp[i] = ans;

        return dp[i];
    }
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        for(int i=0; i<n+1; i++) dp[i] = -1;
        return solve(0, dp, n);
    }
}
