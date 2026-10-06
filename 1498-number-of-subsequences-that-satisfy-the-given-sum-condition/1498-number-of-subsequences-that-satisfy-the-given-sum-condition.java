class Solution {

    static final int MOD = 1_000_000_007;

    public int numSubseq(int[] nums, int target) {

        Arrays.sort(nums);

        int n = nums.length;

        int[] pow2 = new int[n];
        pow2[0] = 1;

        for (int i = 1; i < n; i++) {
            pow2[i] = (pow2[i - 1] * 2) % MOD;
        }

        int count = 0;

        int idx = 0;
        int end = n - 1;

        while (idx <= end) {

            if (nums[idx] + nums[end] <= target) {

                count = (count + pow2[end - idx]) % MOD;

                idx++;

            } else {

                end--;
            }
        }

        return count;
    }
}