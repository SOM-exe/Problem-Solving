class Solution {
    public String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(i % 2 != 0){
                int ans = (int)(s.charAt(i-1)) + ch-'0';
                sb.append(s.charAt(i-1));
                sb.append((char)ans);
            }
        }
        if(sb.length() == s.length()){
            return sb.toString();
        }
        return sb.toString()+s.charAt(s.length()-1);
    }
}