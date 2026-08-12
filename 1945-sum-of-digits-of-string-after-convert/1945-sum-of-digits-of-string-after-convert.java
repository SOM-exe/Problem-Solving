class Solution {
    public int getLucky(String s, int k) {
        int sum = 0;

        for (char c : s.toCharArray()) {
            int value = c - 'a' + 1;

            while (value > 0) {
                sum += value % 10;
                value /= 10;
            }
        }


        for (int i = 1; i < k; i++) {
            int next = 0;

            while (sum > 0) {
                next += sum % 10;
                sum /= 10;
            }

            sum = next;
        }

        return sum;
    }
}
