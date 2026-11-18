class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> frequencyMap = new HashMap<>();
        for(Integer n: nums){               
            frequencyMap.put(n,frequencyMap.getOrDefault(n, 0)+1);
        }

        List<Integer>[] buckets = new ArrayList[nums.length];
        for (int i = 0; i<nums.length;i++){
            buckets[i] = new ArrayList<>();
        }

        for(Integer n : frequencyMap.keySet()){
            buckets[frequencyMap.get(n) -1].add(n);
        }

        int count = 0;
        int[] ans = new int[k];
        for(int i = buckets.length-1; i>=0 ; i--){
            List<Integer> list = buckets[i];
            for(Integer num : list){
                ans[count] = num;
                count++;
                if(count == k){
                    return ans;
                }
            }
        }

        return ans;
        


    }
}
