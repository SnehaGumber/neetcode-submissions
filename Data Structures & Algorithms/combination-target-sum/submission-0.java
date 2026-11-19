class Solution {
    public void solve(int i, int target, int[] nums, List<Integer> ds, List<List<Integer>> ans){
        if(target == 0){
            ans.add(new ArrayList<>(ds));
            return;
        }

        if(target < 0) return;

        if(i == nums.length) return;

        ds.add(nums[i]);
        solve(i, target-nums[i], nums, ds, ans);

        ds.remove(ds.size() - 1);

        solve(i+1, target, nums, ds, ans);
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();

        solve(0, target, nums, ds, ans);

        return ans;
    }
}
