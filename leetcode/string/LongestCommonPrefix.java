/*
14. Longest Common Prefix
Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
 */

public class LongestCommonPrefix{
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length() == 0) {
            return "";
        }
        String common = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(common) != 0) {
                common = common.substring(0, common.length() - 1);
                if (common.equals("")) {
                    return "";
                }
            }
        }
        return common;
    }

    public String lcpDivideConquer(String[] strs) {
        return lcp(strs, 0, strs.length - 1);
    }

    public String lcp(String[] strs, int left, int right){
        if(left == right){
            return strs[l];
        }
        int mid = left + (right - left) / 2;
        String leftCommon = lcp(strs, left, mid);
        String rightCommon = lcp(strs, mid + 1, right);
        return longestCommon(leftCommon, rightCommon);
    }
    public String longestCommon(String left, String right){
        int min = Math.min(left.length(), right.length());
        for(int i = 0; i < min; i++){
            if(left.charAt(i) != right.charAt(i)){
                return left.substring(0, i);
            }
        }
        return left.substring(0, min);
    }
}