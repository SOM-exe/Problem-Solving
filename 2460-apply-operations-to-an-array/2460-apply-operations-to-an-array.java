class Solution {
    public int[] applyOperations(int[] nums) {
        int i = 0; 
        int j = i+1;
        while(i<nums.length-1){
            if(nums[i] == nums[j]){
                nums[i] = nums[i]*2;
                nums[j] = 0;
            }
            i++;
            j++;
        }

        int m = 0;

        for (int n = 0; n < nums.length; n++) {

            if (nums[n] != 0) {

                int temp = nums[n];
                nums[n] = nums[m];
                nums[m] = temp;

                m++;
            }
        }
        return nums;
    }
}