class Solution {
    public boolean isPalindrome(String str){
        int i = 0;
        int j = str.length() - 1;
        while(i <= j){
            if(str.charAt(i) != str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public void solve(int idx, String s, List<String> ds, List<List<String>> ans){
        if(idx == s.length()){
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i=idx; i<s.length(); i++){
            String added = s.substring(idx, i+1);
            if(isPalindrome(added)){
                ds.add(added);
                solve(i+1, s, ds, ans);
                ds.remove(ds.size() - 1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> ds = new ArrayList<>();

        solve(0, s, ds, ans);

        return ans;
    }
}
