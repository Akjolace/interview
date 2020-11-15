/*
17. Letter Combinations of a Phone Number
        Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.

        A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
        Input: "23"
        Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
        Note:

        Although the above answer is in lexicographical order, your answer could be in any order you want.*/
public class LetterCombinationPhoneNumber{
    Map<String, String> mapping = new HashMap<String, String>(){{
        put("2", "abc");
        put("3", "def");
        put("4", "ghi");
        put("5", "jkl");
        put("6", "mno");
        put("7", "pqrs");
        put("8", "tuv");
        put("9", "wxyz");
    }};
    public List<String> letterCombinations(String digits){
        List<String> result = new LinkedList<String>();
        if(digits == null || digits.length() == 0){
            return result;
        }
        combinationRecursive(result, digits, 0, "");
        return result;
    }

    public combinationRecursive(List<String> result, String digits, int index, String combination){
        if(combination.length() == digits.length()){
            result.add(combination);
            return;
        }
        //Converting numbers to mapped Letters
        // 2 -> "abc",  3 -> "def"
        String letters = mapping.get(digits.charAt(index) + "");
        for(int i = 0; i < letters.length(); i++){
            combinationRecursive(result, digits, index + 1, combination + letters.charAt(i));
        }
    }
}