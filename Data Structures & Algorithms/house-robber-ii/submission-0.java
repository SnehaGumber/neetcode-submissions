class Solution {
    public int solve(int i, int end, int[] dp, int[] nums){
        if(i > end) return 0;

        if(dp[i] != -1) return dp[i];

        int take = nums[i] + solve(i+2, end, dp, nums);
        int nottake = solve(i+1, end, dp, nums);

        dp[i] = Math.max(take, nottake);
        return dp[i];
    }
    public int rob(int[] nums) {
        int n = nums.length;

        if(n==1) return nums[0];

        int[] dp1 = new int[n+1];
        Arrays.fill(dp1, -1);

        int[] dp2 = new int[n+1];
        Arrays.fill(dp2, -1);

        return Math.max(
            solve(0, n-2, dp1, nums),
            solve(1, n-1, dp2, nums)
        );
    }
}
