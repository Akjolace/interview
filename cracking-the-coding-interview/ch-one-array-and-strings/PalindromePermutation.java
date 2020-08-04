public class PalindromePermutation{
    public boolean isPalindromePermutation(String str){
        //Ignore case sensetive and non-letter chars
        str = str.replaceAll("[^a-zA-Z]+","").toLowerCase();
        int checker = 0;

        for(char c : str.toCharArray()){
            int val = c - 'a';
            checker ^= (1 << val);
        }

        int oddCharCount = 0;
        for(int i = 0; i < 26; i++){
            if( (checker & (1 << i)) > 0){
                if(oddCharCount != 0) {
                    return false;
                } else {
                    oddCharCount++;
                }
            }
        }

        return true;
    }
}