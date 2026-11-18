class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            int complement = target - nums[i];
            if(!map.containsKey(complement)){
                map.put(nums[i], i);
            }else{
                int[] result = new int[]{i, map.get(complement)};
                Arrays.sort(result);
                return result;
            }
        }

        return new int[]{};
    }
}
