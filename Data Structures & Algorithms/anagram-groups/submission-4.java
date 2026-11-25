class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<HashMap<Character,Integer>,List<String>> groups = new HashMap<>();

        for(String s : strs){
        HashMap<Character, Integer> frequency = new HashMap<>();
            for(Character c : s.toCharArray()){
                frequency.put(c, frequency.getOrDefault(c, 0)+1);
            }
        groups.put(frequency, groups.getOrDefault(frequency, new ArrayList<>()));
        groups.get(frequency).add(s);
        }
       
        return new ArrayList<>(groups.values());

    }
}
