class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length < 2){
            return 0;
        }
        Arrays.sort(nums);
        int i = 0;
        int j = i+1;
        int maxv = Integer.MIN_VALUE;
        while(i<nums.length-1){
            int diff = Math.abs(nums[i] - nums[j]);
            maxv = Math.max(maxv , diff);
            i++;
            j++;
        }
        return maxv;
    }
}