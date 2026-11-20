class Solution {
    public int solve(int i, int n, int[] dp, int[] nums){
        if(i >= n) return 0;

        if(dp[i] != -1) return dp[i];

        int take = nums[i] + solve(i+2, n, dp, nums);
        int nottake = solve(i+1, n, dp, nums);

        dp[i] =  Math.max(take, nottake);

        return dp[i];
    }
    public int rob(int[] nums) {
        int n = nums.length;

        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);

        return solve(0, n, dp, nums);
    }
}
