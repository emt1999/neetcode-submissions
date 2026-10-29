class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> sTable = new HashMap<>();
        Map<Character, Integer> tTable = new HashMap<>();
        for(char c : s.toCharArray()){
            int currentCount = sTable.getOrDefault(c, 0);
            sTable.put(c ,currentCount + 1);
        }

        for(char c : t.toCharArray()){
            int currentCount = tTable.getOrDefault(c, 0);
            tTable.put(c, currentCount + 1);
        }

        return sTable.equals(tTable);

    }
}
