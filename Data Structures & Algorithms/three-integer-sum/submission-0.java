class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       List<List<Integer>> ans = new ArrayList<>();
       Arrays.sort(nums);
       for(int i = 0; i < nums.length;i++){
        int left = i+1;
        int right = nums.length-1;
        int target = -nums[i];
        while(left<right){
            int sum = nums[left]+nums[right];
            if(sum == target){
                List<Integer> newList = Arrays.asList(nums[i], nums[left], nums[right]);
                if(!ans.contains(newList)){
                    ans.add(newList);
                }
                
                right--;
                left++;
            }else if(sum<target){
                left++;
            }else{
                right--;
            }
        }

       } 
       return ans;

    }
}
