public class OneAway{
    public boolean isOneAway(String first, String second){
        if(Math.abs(first.length() - second.length()) > 1)
            return false;
        String s1 = (first.length() > second.length()) ? first : second;
        String s2 = (first.length() > second.length()) ? second : first;

        int index1 = 0;
        int index2 = 0;
        int difference = 1;

        while(difference > 0 && index1 < s1.length() && index2 < s2.length()){
            if(s1.charAt(index1) != s2.charAt(index2)){
                difference--;
                if(s1.length() == s2.length())
                    index2++;
            } else {
                index2++;
            }
            index1++;
        }

        return (index2 == s2.length())
    }
}