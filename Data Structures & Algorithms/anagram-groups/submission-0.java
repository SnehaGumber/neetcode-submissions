class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for(String s : strs){
            char[] key = new char[26];
            for(int i=0; i<s.length(); i++){
                char ch = s.charAt(i);
                key[ch-'a']++;
            }
            String sorted = new String(key);
            map.computeIfAbsent(sorted, k -> new ArrayList<>()).add(s);   
        }

        return new ArrayList<>(map.values());

    }
}
