class Solution {
    public int fun(StringBuilder ss) {
        long p2 = 1;
        long num = 0;

        for (int i = ss.length() - 1; i >= 0; i--) {
            if (ss.charAt(i) == '1') {
                num += p2;
            }
            p2 *= 2;
        }

        return (int) num;
    }

    public int reverseBits(int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 32; i++) {
            sb.append((n & 1) == 1 ? '1' : '0');
            n = n >>> 1;
        }

        return fun(sb);
    }
}