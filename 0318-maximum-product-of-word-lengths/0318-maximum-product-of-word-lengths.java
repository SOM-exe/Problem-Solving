class Solution {

    public int maxProduct(String[] words) {

        int n = words.length;

        int[] mask = new int[n];

        for (int i = 0; i < n; i++) {

            for (char ch : words[i].toCharArray()) {

                mask[i] |= 1 << (ch - 'a');
            }
        }

        int max = 0;


        for (int i = 0; i < n - 1; i++) {

            for (int j = i + 1; j < n; j++) {

                if ((mask[i] & mask[j]) == 0) {

                    max = Math.max(
                        max,
                        words[i].length() * words[j].length()
                    );
                }
            }
        }

        return max;
    }
}