public class StringCompression{
    public String stringCompressed(String str){
        int originalLength = str.length();
        int finalLength = finalLen(str);

        if(finalLength > originalLength) return str;

        int repeated = 0;
        StringBuilder compressed = new StringBuilder(finalLength);
        for(int i = 0; i < originalLength; i++){
            repeated++;
            if(i + 1 >= originalLength || str.charAt(i) != str.charAt(i + 1)){
                compressed.append(str.charAt(i));
                compressed.append(repeated);
                repeated = 0;
            }
        }
        return compressed.toString();
    }
    public int finalLen(String str){
        int repeated = 0;
        int retLen = 0;
        for(int i = 0; i < str.length(); i++){
            repeated++;
            if(i + 1 >= str.length || str.charAt(i) != str.charAt(i + 1)){
                retLen += 1 + String.valueOf(repeated).length();
                repeated = 0;
            }
        }
        return retLen;
    }
}