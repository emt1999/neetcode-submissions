class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> numsSeen = new HashSet<>();
        for(Integer n : nums){
            if(!numsSeen.add(n)){
                return true;
            }
        }
        return false;
    }
}