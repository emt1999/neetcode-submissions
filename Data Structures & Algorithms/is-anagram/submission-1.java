class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> count1 = new HashMap<>();
        HashMap<Character, Integer> count2 = new HashMap<>();
        for(Character n : s.toCharArray()){
            count1.put(n, count1.getOrDefault(n, 0) + 1);
        }
        for(Character n : t.toCharArray()){
            count2.put(n, count2.getOrDefault(n, 0) + 1);
        }
        return count1.equals(count2);

    }
}
