class Solution {
    public boolean solve(int idx, Boolean[] dp, String s, Set<String> set){
        if(idx == s.length()) return true;
        if(dp[idx] != null) return dp[idx];

        for(int i=idx; i<s.length(); i++){
            String substr = s.substring(idx, i+1);
            if(set.contains(substr)){
                if(solve(i+1, dp, s, set)){
                    dp[idx] = true;
                    return true;
                }
            }
        }
        dp[idx] = false;
        return false;
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet<>(wordDict);

        Boolean[] dp = new Boolean[s.length()];

        return solve(0, dp, s, set);
    }
}
