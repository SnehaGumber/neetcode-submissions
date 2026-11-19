class Solution {
    public void solve(int idx, int target, int[] nums, List<Integer> ds, List<List<Integer>> ans){
        if(target == 0){
            ans.add(new ArrayList<>(ds));
            return;
        }
         
        if(target < 0) return;

        if(idx == nums.length) return;

        for(int i=idx; i<nums.length; i++){
            if(i > idx && nums[i] == nums[i-1]) continue;
            ds.add(nums[i]);
            solve(i+1, target-nums[i], nums, ds, ans);

            ds.remove(ds.size() - 1);
        }
        
    }
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();

        Arrays.sort(nums);
        solve(0, target, nums, ds, ans);

        return ans;
    }
}
