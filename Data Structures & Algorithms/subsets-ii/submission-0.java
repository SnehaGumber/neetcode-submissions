class Solution {
    public void solve(int idx, int[] nums, List<Integer> ds, List<List<Integer>> ans){
        ans.add(new ArrayList<>(ds));

        if(idx == nums.length) return;

        for(int i=idx; i<nums.length; i++){
            if(i > idx && nums[i] == nums[i-1]) continue;

            ds.add(nums[i]);
            solve(i+1, nums, ds, ans);

            ds.remove(ds.size() -1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();

        solve(0, nums, ds, ans);

        return ans;
    }
}
