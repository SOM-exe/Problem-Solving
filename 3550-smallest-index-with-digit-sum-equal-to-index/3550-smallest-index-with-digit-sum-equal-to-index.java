class Solution {
    public int smallestIndex(int[] nums) {
        for(int i = 0; i<nums.length; i++){
            if(nums[i] >= 0 && nums[i] < 9){
                if(i == nums[i]){
                    return i;
                }
                continue;
            }
            int sum = 0;
            while(nums[i] > 0){
                int ld = nums[i] % 10;
                sum += ld;
                nums[i] /= 10;
            }

            if(sum == i){
                return i;
            }
        }
        return -1;
    }
}