class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> numSet = new HashSet<Integer>();
        
        for (int n : nums){
            if (numSet.add(n) == false){
                return true;
            }
        }
        return false;
    }
}