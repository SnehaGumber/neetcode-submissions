class Solution {
    public int solve(int i, int[] dp, String s){
        if(i == s.length()) return 1;

        if(s.charAt(i) == '0') return 0;

        if(dp[i] != -1) return dp[i];

        int ways = 0;

        if(s.charAt(i)-'0' >= 0 && s.charAt(i)-'0' <= 9){
            ways += solve(i+1, dp, s);
        }

        if(i+1 < s.length()){
            int num = Integer.parseInt(s.substring(i, i+2));
            if(num>=10 && num<=26){
                ways += solve(i+2, dp, s);
            }
        }

        dp[i] = ways;
        return dp[i];
    }
    public int numDecodings(String s) {
        int n = s.length();

        int[] dp = new int[n];
        Arrays.fill(dp, -1);

        return solve(0, dp, s);
    }
}
