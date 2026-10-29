class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groupMap = new HashMap<>();
        for(String s : strs){
             int[] alphabet = new int[26];
            for(char c : s.toCharArray()){
                alphabet[c-'a']++;
                }
        groupMap.computeIfAbsent(Arrays.toString(alphabet), k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(groupMap.values());
    }
}
