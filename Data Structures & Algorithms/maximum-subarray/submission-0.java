class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;

        int curr = nums[0];
        int result = nums[0];

        for(int i=1; i<n; i++){
            curr = Math.max(nums[i], nums[i] + curr);
            result = Math.max(curr, result);
        }

        return result;
    }
}
