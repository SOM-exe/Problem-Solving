class Solution {
    public boolean isvowel(char ch){
         if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'||ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            return true;
        }
        return false;
    }
    public String toGoatLatin(String sentence) {
        ArrayList<String> ls = new ArrayList<>();
        String[] arr = sentence.split(" ");
        int i = 1;
       for (String s : arr) {
            String ans;

           if (isvowel(s.charAt(0))) {
            ans = s + "ma";
            } else {
                ans = s.substring(1) + s.charAt(0) + "ma";
            }

         for (int j = 0; j < i; j++) {
              ans += "a";
        }

            ls.add(ans);
            i++;
        }
        String result = String.join(" ", ls);
        return result;
    }
}