class Solution {
    public int alternateDigitSum(int n) {
        String s = String.valueOf(n);
        int sum =0;
        for(int i = 0; i<s.length(); i++){
            char ch =s.charAt(i);
           if(i % 2 == 0){
              sum = sum + (ch -'0');
           }  else{
              sum = sum - (ch -'0');
           }         
        }
        return sum;
    }
}