class Solution {
    public String makeFancyString(String s) {
        StringBuilder ans = new StringBuilder();
        int c = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (i == 0 || ch != s.charAt(i - 1)) {
                c = 0;
            }

            if (c < 2) {
                ans.append(ch);
                c++;
            }
        }

        return ans.toString();
    }
}