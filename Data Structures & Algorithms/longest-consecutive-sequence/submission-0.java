class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;

        HashSet<Integer> set = new HashSet<>();

        for(int x : nums){
            set.add(x);
        }

        int count = 0;
        
        for(int x : set){
            if(!set.contains(x-1)){
                int len = 0;
                int curr = x;
                while(set.contains(curr)){
                    len++;
                    curr = curr + 1;
                }
                count = Math.max(len, count);
            }
        }

        return count;
    }
}
