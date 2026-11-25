class Solution {
    public String longestCommonPrefix(String[] strs) {
        int maxCount = strs[0].length();
        String firstStr = strs[0];

        for(int i = 1 ; i < strs.length;i++){
            String currentString = strs[i];
            int currentCount = 0;
            for(int j = 0; j <currentString.length() && j<firstStr.length(); j++){
                if(firstStr.charAt(j) == currentString.charAt(j)){
                    currentCount++;
                }else{
                    break;
                }
            }
            if(currentCount<maxCount){
                maxCount = currentCount;
            }
        }
        return firstStr.substring(0,maxCount);
    }
}