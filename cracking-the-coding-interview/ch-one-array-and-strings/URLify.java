public class URLify{
    public void urlModify(char[] str, int trueLength){
        int numberOfSpaces = charCounter(str, 0, trueLength, ' ');
        int newIndex = trueLength - 1 + numberOfSpaces * 2;

        if(newIndex + 1 < str.length) str[newIndex + 1] = '\0';
        for(int oldIndex = trueLength - 1; oldIndex >= 0; oldIndex--){
            if(str[oldIndex] == ' '){
                str[newIndex] = '0';
                str[newIndex - 1] = '2';
                str[newIndex - 2] = '%';
                newIndex -= 3;
            } else {
                str[newIndex] = str[oldIndex];
                newIndex--;
            }
        }
    }

    public int charCounter(char[] str, int start, int end, int target){
        int count = 0;
        for(int i = start; i < end; i++){
            if(str[i] == target) {
                count++;
            }
        }
        return count;
    }
}