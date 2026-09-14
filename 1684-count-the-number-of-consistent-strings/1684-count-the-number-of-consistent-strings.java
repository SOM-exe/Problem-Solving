class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int c = 0;
       for(String s : words){
        boolean get = true;
        for(char ch : s.toCharArray()){
            if(!allowed.contains("" + ch)){
                get = false;
            }
        }
        if(get){
            c++;
        }
       } 
       return c;
    }
}