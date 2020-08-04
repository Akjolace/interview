public class CheckPermutation{
    public boolean checkPermutationTwoString(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        //Assume ASCII characters only
        int[] charCounter = new int[128];

        for (int i = 0; i < s1.length(); i++) {
            charCounter[s1.charAt(i) - 'a']++;
            charCounter[s2.charAt(i) - 'a']--;
        }

        for (int numbers : charCounter) {
            if (numbers != 0) return false;
        }

        return true;
    }
}