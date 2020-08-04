public class StringRotation{
    public boolean isSubstring(String s1, String s2){
        String s1s1 = s1 + s1;
        return (s1s1.indexOf(s2) != -1);
    }
}