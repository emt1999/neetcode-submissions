class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map <String, List<String>> strMap = new HashMap<>();
        for (int i = 0; i < strs.length; i++){
            String currentString = strs[i];
            int[] strArr = new int[26];
            
            for(Character c : currentString.toCharArray()){
                strArr[c- 'a'] += 1;
            }
        strMap.computeIfAbsent(Arrays.toString(strArr), k -> 
                                new ArrayList<String>
                                ()).add(currentString);   
        }

        return new ArrayList<>(strMap.values());
    }
}
