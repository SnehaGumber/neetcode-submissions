class Solution {
    public boolean isPartition(int i, int target, int[][] dp, int[] arr){
        if(target == 0) return true;
        if(i == arr.length) return false;
        if(dp[i][target] != -1) return dp[i][target] == 0 ?  true : false;
        if(arr[i] > target){
            boolean res = isPartition(i+1, target, dp, arr);
            if(res) dp[i][target] = 0;
            else dp[i][target] = 1;
            return res;
        }else{
            boolean take = isPartition(i+1, target-arr[i], dp, arr);
            boolean nottake = isPartition(i+1, target, dp, arr);
            boolean res = take || nottake;
            if(res) dp[i][target] = 0;
            else dp[i][target] = 1;
        }
        return dp[i][target] == 0 ? true : false;
    }
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int x : nums) sum += x;
        if(sum % 2 != 0) return false;
        int target = sum / 2;
        int[][] dp = new int[n+1][target+1];
        for(int i=0; i<n; i++) Arrays.fill(dp[i], -1);
        return isPartition(0, target, dp, nums);
    }
}
