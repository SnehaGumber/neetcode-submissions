class Solution {
    public void solve(int idx, String digits, StringBuilder res, HashMap<Character, String> map, List<String> ans){
        if(idx == digits.length()){
            ans.add(res.toString());
            return;
        }

        for(char curr : map.get(digits.charAt(idx)).toCharArray()){
            res.append(curr);
            solve(idx+1, digits, res, map, ans);
            res.deleteCharAt(res.length() - 1);
        }
    }
    public List<String> letterCombinations(String digits) {
        HashMap<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        List<String> ans = new ArrayList<>();

        if(digits.length() == 0) return ans;
        StringBuilder res = new StringBuilder();

        solve(0, digits, res, map, ans);

        return ans;
    }
}
