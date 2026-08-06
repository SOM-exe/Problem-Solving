class Solution {
    public void sortColors(int[] nums) {
        int zeros = 0;
        int ones = 0;
        int twos = 0;
        for(int i : nums){
            if(i == 0) zeros++;
            if(i == 1) ones++;
            if(i == 2) twos++;
        }
       
        int i =0;
        while(zeros>0){
            nums[i] = 0;
            zeros--;
            i++;
        }
        int j = i;
        while(ones>0){
            nums[j] = 1;
            ones--;
            j++;
        }
        int z = j;
        while(twos>0){
            nums[z] = 2;
            twos--;
            z++;
        }
    }
}