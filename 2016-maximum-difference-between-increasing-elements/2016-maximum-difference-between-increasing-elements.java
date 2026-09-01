class Solution {
    public int maximumDifference(int[] nums) {

        int maxv = Integer.MIN_VALUE;
        
        for(int i = 0; i<nums.length-1; i++){
            for(int j = i+1; j<nums.length; j++){
            if(nums[i] < nums[j]){
                maxv = Math.max(maxv , (nums[j] - nums[i]));
            }
            }
        }
        return maxv == Integer.MIN_VALUE ? -1 : maxv;
    }
}