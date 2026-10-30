class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        String firstString = strs[0];
        int i = 0;
    for (i = 0; i < firstString.length(); i++){
        for(int j = 1; j < strs.length; j++){
          String str = strs[j];
          if(i >= str.length() || str.charAt(i) != firstString.charAt(i)){
             return firstString.substring(0,i);
          }
        }
    }
return firstString;
 }
}