class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        ArrayList<Integer>[] buckets = new ArrayList[nums.length];
        HashMap<Integer, Integer> frequency = new HashMap<>();
        int[] ans = new int[k];
        for(int i = 0 ; i < nums.length; i++){
            buckets[i] = new ArrayList<>();
        }

        for(Integer i : nums){//number, count
            frequency.put(i, frequency.getOrDefault(i, 0)+1);
        }

        for(Integer i: frequency.keySet()){
            buckets[frequency.get(i)-1].add(i);
        }

        int count = 0;
        for(int i = nums.length-1;i>=0;i--){
            for(Integer j : buckets[i]){
                ans[count] = j;
                count++;
                if(count == k){
                    return ans;
                }


            }

        }
return ans;


    }
}
