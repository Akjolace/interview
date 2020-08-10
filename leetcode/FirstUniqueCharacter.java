/*
Given a string, find the first non-repeating character in it and return its index. If it doesn't exist, return -1.

        Examples:

        s = "leetcode"
        return 0.

        s = "loveleetcode"
        return 2.
*/
public class FirstUniqueCharacter {
    public int firstUniqChar(String s){
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(Character c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(int i = 0; i < s.length(); i++){
            char current = s.charAt(i);
            if(map.get(current) == 1){
                return i;
            }
        }
        return -1;
    }
}