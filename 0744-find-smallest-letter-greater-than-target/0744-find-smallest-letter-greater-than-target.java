class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for(int i = 0; i<letters.length; i++){
            char ch = letters[i];
            if((ch-'a') > (target-'a')){
                return ch;
            } else continue;
        }
        return letters[0];
    }
}