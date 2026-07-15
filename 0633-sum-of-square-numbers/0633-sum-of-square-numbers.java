class Solution {
    public boolean judgeSquareSum(int c) {
        int n = (int) Math.sqrt(c);

        int[] arr = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            arr[i] = i;
        }

        int l = 0;
        int r = arr.length - 1;

        while (l <= r) {
            long sum = (long) arr[l] * arr[l] + (long) arr[r] * arr[r];

            if (sum == c) {
                return true;
            } else if (sum < c) {
                l++;
            } else {
                r--;
            }
        }

        return false;

    }
}