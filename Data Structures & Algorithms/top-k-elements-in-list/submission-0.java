class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> counts = new HashMap<>(); //number, frequency
        
        int[] ans = new int[k];
        int count = 0;

        for(Integer n : nums){
            counts.put(n, counts.getOrDefault(n, 0) +1);
        }
        
        List<Integer>[] buckets = new ArrayList[nums.length];
   

        for(int i = 0 ; i < nums.length;i++){
            buckets[i] = new ArrayList<>();
        }
   
        for(Integer n : counts.keySet()){
            buckets[counts.get(n) - 1].add(n);
        }

        for(int i = buckets.length -1; i>=0; i--){
            for(Integer n : buckets[i]){
                ans[count] = n;
                count++;
                if(count == k){
                    return ans;
                }
            }
        }
        return ans;

    }
}
