
public class IsUnique{
    public boolean hasUniqueChars(String str){
        // Assume str contains only lowercase 26 letters
        if(str.length() > 26) return false;
        int checker = 0;

        for(char c: str.toCharArray()){
            int val = c - 'a';
            // 1 << c is converting Decimal to binary
            if( (val & (1 << c)) > 0){
                return false;
            }
            checker |= (1 << c);
        }
        return true;
    }
}