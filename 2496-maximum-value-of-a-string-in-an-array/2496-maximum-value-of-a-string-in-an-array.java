class Solution {

    public int maximumValue(String[] strs) {

        int maxv = 0;
        int ans = 0;

        for (String i : strs) {

            boolean letter = false;

            for (char ch : i.toCharArray()) {
                if (Character.isLetter(ch)) {
                    letter = true;
                    break;
                }
            }

            if (letter) {
                maxv = Math.max(maxv, i.length());
            } else {
                int num = Integer.parseInt(i);
                ans = Math.max(ans, num);
            }
        }

        return Math.max(maxv, ans);
    }
}