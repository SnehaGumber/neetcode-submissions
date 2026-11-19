class Solution {
    public void solve(int i, int[] nums, List<Integer> ds, List<List<Integer>> ans){
        if(i == nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }

        ds.add(nums[i]);
        solve(i+1, nums, ds, ans);

        ds.remove(ds.size() - 1);

        solve(i+1, nums, ds, ans);
    }

    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();

        solve(0, nums, ds, ans);

        return ans;
    }
}
