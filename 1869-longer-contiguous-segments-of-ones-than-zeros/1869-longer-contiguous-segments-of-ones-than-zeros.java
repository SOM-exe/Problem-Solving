class Solution {
    public boolean checkZeroOnes(String s) {
        int x1 = Integer.MIN_VALUE;
        int x2 = Integer.MIN_VALUE;
        int ones = 0;
        int zeros = 0;
        for(char ch : s.toCharArray()){
            if(ch == '1'){
                x1 = Math.max(x1 , ones++);
                zeros = 0;
            }
            if(ch == '0'){
                x2 = Math.max(x2 , zeros++);
                ones = 0;
            }
        }
        if(x1 > x2){
            return true;
        }
        return false;
    }
}